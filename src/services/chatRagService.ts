/**
 * Server-side RAG Chat Service
 * - knowledge.md를 청크로 분리 → Gemini text-embedding-004로 벡터화
 * - 질문 시 코사인 유사도 검색 → 상위 청크 + 페르소나 프롬프트 → Gemini Flash 답변
 */
import { GoogleGenAI } from "@google/genai";

/* ── Knowledge Chunks ── */
const KNOWLEDGE_CHUNKS = [
  {
    id: "app_intro",
    title: "앱 소개",
    content:
      "MyDay 2.0은 사진을 선택하면 AI(Gemini)가 감성적인 블로그 글을 자동으로 작성하고, 네이버 블로그에 원클릭으로 포스팅해주는 앱입니다. 슬로건은 '내 하루를 빛나게'입니다. 글쓰기는 귀찮은데 블로그는 하고 싶을 때 딱 좋은 앱이에요.",
  },
  {
    id: "onboarding",
    title: "초기 설정 (온보딩)",
    content:
      "앱을 처음 실행하면 초기 설정 화면이 나옵니다. 네이버 아이디, 네이버 비밀번호, 네이버 블로그 아이디, Gemini API 키를 입력합니다. 네이버 블로그 아이디는 blog.naver.com/xxxxx 에서 xxxxx 부분입니다. 최초 1회만 입력하면 다음 실행부터는 바로 메인 화면으로 이동합니다. 설정 아이콘에서 '계정 및 API 관리'로 언제든 변경 가능하고, '온보딩 다시 보기'로 초기 설정 화면을 다시 볼 수 있습니다.",
  },
  {
    id: "api_key",
    title: "Gemini API 키 발급",
    content:
      "Gemini API 키는 AI를 부르는 마법 주문 같은 거예요. https://aistudio.google.com 에 접속하여 Google 계정으로 로그인하고, 왼쪽 메뉴에서 'Get API key' 또는 'API 키 가져오기'를 선택합니다. 'Create API key' 버튼을 눌러 새로운 키를 발급하고, 생성된 키(AIza...로 시작)를 복사해서 앱의 'Gemini API 키' 입력란에 붙여넣고 저장합니다. 무료로 발급 가능하며 일일 사용량 제한이 있을 수 있습니다.",
  },
  {
    id: "step1_photo",
    title: "STEP 1: 사진 추가",
    content:
      "최소 1장, 최대 10장까지 사진을 선택할 수 있습니다. 사진을 선택한 후 반드시 '확인' 버튼을 눌러야 합니다. 이미지 파일만 선택 가능합니다. 사진이 많을수록 AI가 더 풍성한 글을 작성합니다.",
  },
  {
    id: "step2_place",
    title: "STEP 2: 장소 선택",
    content:
      "선택 가능한 장소로 카페, 공원, 영화관, 쇼핑몰, 전시회장, 일식가, 중식가, 한식가가 있으며 복수선택이 가능합니다. 목록에 없는 장소는 '기타 (직접 입력)'으로 자유롭게 입력할 수 있습니다.",
  },
  {
    id: "step3_reason",
    title: "STEP 3: 이유 선택",
    content:
      "선택 가능한 이유로 데이트, 미팅, 산책, 카페 투어, 공부, 쇼핑, 운동, 여행이 있으며 복수선택이 가능합니다. 사진을 찍은 이유를 선택하면 AI가 그 분위기에 맞는 글을 작성합니다.",
  },
  {
    id: "step4_person",
    title: "STEP 4: 사진 속 인물 입력",
    content:
      "사진에 나온 사람이 누구인지 자유롭게 입력합니다. 예: 친구와 나, 가족들, 남자친구 등. 풍경/음식 사진 등 사람이 없으면 비워두어도 됩니다. 선택사항이에요.",
  },
  {
    id: "ai_generate",
    title: "AI 글 생성",
    content:
      "4단계를 완료하면 AI가 자동으로 감성적인 블로그 글을 작성합니다. '포스팅 글 새로 생성하기' 버튼으로 같은 사진에 대해 다른 스타일의 글을 받을 수 있습니다. AI는 계절, 절기, 공휴일 등을 자동으로 반영하여 시의적절한 글을 작성합니다. 생성된 글의 총 글자수와 섹션 수를 확인할 수 있고, 포스팅 본문 화면에서 글을 직접 수정할 수도 있습니다.",
  },
  {
    id: "auto_posting",
    title: "네이버 블로그 자동 포스팅",
    content:
      "'네이버 블로그 자동 포스팅 실행' 버튼을 누르면 AI가 작성한 글과 사진이 네이버 블로그에 자동 업로드됩니다. 포스팅 완료 시 '포스팅이 완료되었어요. 블로그에서 확인해 주세요!' 메시지가 나타나고, 실패 시 '다시 포스팅하면 빠르게 재시도할 수 있어요' 안내가 나옵니다. '다른 사진으로 또 포스팅하기'로 새로운 포스팅을 시작할 수 있습니다.",
  },
  {
    id: "settings",
    title: "설정 관리",
    content:
      "설정 아이콘에서 '계정 및 API 관리'로 진입하면 네이버 아이디, 비밀번호, 블로그 아이디, Gemini API 키를 변경할 수 있습니다. '초기 설정 다시 하기'로 온보딩 과정을 처음부터 다시 진행할 수 있습니다.",
  },
  {
    id: "network",
    title: "네트워크 및 오프라인",
    content:
      "AI 글 생성과 블로그 포스팅에는 인터넷 연결이 필수입니다. 사진 선택, 장소/이유 고르기는 오프라인에서도 가능합니다.",
  },
  {
    id: "api_usage",
    title: "Gemini API 사용량",
    content:
      "Gemini API에는 일일 사용량 제한이 있을 수 있습니다. 사용량 초과 시 일정 시간 후 자동으로 재시도할 수 있습니다. '기존 Gemini 모델이 종료되어 최신 모델로 전환 중입니다' 메시지가 나오면 잠시 후 다시 시도하세요.",
  },
  {
    id: "safety_policy",
    title: "안전 정책",
    content:
      "'입력 내용이 안전 정책에 의해 차단되었습니다'라는 메시지가 나오면 표현을 완화해서 다시 시도해주세요.",
  },
  {
    id: "philosophy",
    title: "오늘의 철학",
    content:
      "매일 철학자 명언 이미지가 표시됩니다. 앱 사용에 영감을 주는 기능입니다.",
  },
  {
    id: "faq",
    title: "자주 묻는 질문",
    content:
      "사진 없이도 글을 쓸 수 있나요? → 최소 1장의 사진이 필요합니다. API 키 비용이 드나요? → Google AI Studio에서 무료로 발급 가능합니다. 포스팅 후 수정할 수 있나요? → 네이버 블로그에서 직접 수정할 수 있습니다. 하루에 몇 번 포스팅할 수 있나요? → 횟수 제한은 없지만 Gemini API 사용량 제한에 따라 달라질 수 있습니다.",
  },
];

const CHAT_SYSTEM_PROMPT = `당신은 MyDay 2.0 앱의 유쾌하고 센스있는 도우미 챗봇 "마이"입니다.

## 성격
- 친근한 존댓말을 사용하되, 친구가 옆에서 알려주는 것처럼 자연스럽게 말합니다.
- 밝고 유쾌하며 재치있는 톤으로 대화합니다.
- 이모지를 적절히 사용합니다.
- 답변은 간결하되 충분한 정보를 제공합니다 (3~5문장 이내).
- 사용자가 불편해하지 않도록 공감을 먼저 표현하고, 그 다음에 해결책을 알려줍니다.

## 말투 규칙
- 절대 문서를 읽어주듯이 나열하지 마세요. 자기 말로 재치있게 풀어서 설명하세요.
- 같은 질문이 들어와도 매번 다른 비유, 예시, 표현을 사용해서 답변하세요.
- 딱딱한 용어는 쉽고 재미있는 표현으로 바꿔 말하세요.
- "~합니다", "~됩니다" 같은 설명서체 대신 "~해요", "~거든요", "~죠!" 같은 대화체를 쓰세요.

## 정보 규칙
- 아래 [참고 정보]를 바탕으로 답변하되, 문서를 그대로 읽어주지 말고 자연스러운 대화로 재구성하세요.
- 참고 정보에 없는 내용은 "음, 그건 저도 아직 잘 모르겠어요 😅 설정 화면이나 공식 안내를 한번 확인해 보시겠어요?"라고 답합니다.
- 앱과 무관한 질문(날씨, 뉴스 등)에는 "앗, 그건 제 전문 분야가 아니에요~ 😆 저는 MyDay 앱 전문이거든요! 앱 관련 궁금한 거 있으시면 물어봐 주세요!"라고 답합니다.`;

/* ── Vector Index ── */
interface ChunkVector {
  id: string;
  title: string;
  content: string;
  embedding: number[];
}

let vectorIndex: ChunkVector[] = [];
let indexReady = false;

function cosineSimilarity(a: number[], b: number[]): number {
  let dot = 0;
  let magA = 0;
  let magB = 0;
  for (let i = 0; i < a.length; i++) {
    dot += a[i] * b[i];
    magA += a[i] * a[i];
    magB += b[i] * b[i];
  }
  return dot / (Math.sqrt(magA) * Math.sqrt(magB) + 1e-10);
}

export async function buildVectorIndex(apiKey: string): Promise<void> {
  if (indexReady) return;

  const ai = new GoogleGenAI({ apiKey });
  console.log("[RAG] Building vector index...");

  const texts = KNOWLEDGE_CHUNKS.map((c) => `${c.title}: ${c.content}`);

  // Batch embed all chunks
  const result = await ai.models.embedContent({
    model: "text-embedding-004",
    contents: texts,
  });

  const embeddings = result.embeddings;
  if (!embeddings || embeddings.length !== KNOWLEDGE_CHUNKS.length) {
    throw new Error("[RAG] Embedding count mismatch");
  }

  vectorIndex = KNOWLEDGE_CHUNKS.map((chunk, i) => ({
    id: chunk.id,
    title: chunk.title,
    content: chunk.content,
    embedding: embeddings[i].values!,
  }));

  indexReady = true;
  console.log(`[RAG] Vector index ready (${vectorIndex.length} chunks, dim=${vectorIndex[0].embedding.length})`);
}

async function searchSimilarChunks(
  query: string,
  apiKey: string,
  topK: number = 3,
): Promise<ChunkVector[]> {
  const ai = new GoogleGenAI({ apiKey });

  const result = await ai.models.embedContent({
    model: "text-embedding-004",
    contents: query,
  });

  const queryEmbedding = result.embeddings?.[0]?.values;
  if (!queryEmbedding) throw new Error("[RAG] Failed to embed query");

  const scored = vectorIndex.map((chunk) => ({
    chunk,
    score: cosineSimilarity(queryEmbedding, chunk.embedding),
  }));

  scored.sort((a, b) => b.score - a.score);
  return scored.slice(0, topK).map((s) => s.chunk);
}

export async function chatWithRag(
  query: string,
  apiKey: string,
): Promise<string> {
  if (!indexReady) {
    await buildVectorIndex(apiKey);
  }

  // 1. 유사 청크 검색
  const relevantChunks = await searchSimilarChunks(query, apiKey, 3);

  // 2. 컨텍스트 구성
  const context = relevantChunks
    .map((c) => `[${c.title}]\n${c.content}`)
    .join("\n\n");

  // 3. Gemini Flash로 답변 생성
  const ai = new GoogleGenAI({ apiKey });
  const response = await ai.models.generateContent({
    model: "gemini-2.0-flash",
    config: {
      systemInstruction: CHAT_SYSTEM_PROMPT,
      temperature: 0.9,
      maxOutputTokens: 512,
    },
    contents: `[참고 정보]\n${context}\n\n[사용자 질문]\n${query}`,
  });

  const text = response.text;
  return text || "죄송해요, 답변을 만들지 못했어요. 다시 한번 물어봐 주세요~ 🙏";
}
