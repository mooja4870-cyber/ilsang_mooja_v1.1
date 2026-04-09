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
  /* ── 용어 사전 (앱에 노출되는 모든 용어) ── */
  {
    id: "term_onboarding",
    title: "용어: 온보딩",
    content: "온보딩은 앱을 처음 쓸 때 거치는 초기 설정 과정이에요. 앱이랑 첫 인사하는 시간이라고 생각하면 돼요! 네이버 아이디, 비밀번호, 블로그 아이디, Gemini API 키를 입력하는 단계입니다.",
  },
  {
    id: "term_posting",
    title: "용어: 포스팅",
    content: "포스팅은 블로그에 글을 올리는 것을 말해요. MyDay에서는 AI가 만든 감성 글을 네이버 블로그에 자동으로 올려주는 걸 포스팅이라고 해요.",
  },
  {
    id: "term_auto_posting",
    title: "용어: 자동 포스팅",
    content: "자동 포스팅은 버튼 하나만 누르면 AI가 만든 글과 사진이 네이버 블로그에 자동으로 업로드되는 기능이에요. 직접 블로그 편집기를 열 필요가 없어요!",
  },
  {
    id: "term_api_key",
    title: "용어: API 키 / Gemini API 키",
    content: "API 키는 AI를 부르는 마법 주문 같은 거예요. Gemini API 키는 Google AI Studio에서 무료로 발급받을 수 있고, 이 키가 있어야 AI가 글을 써줄 수 있어요. 'AIza...'로 시작하는 문자열입니다.",
  },
  {
    id: "term_gemini",
    title: "용어: Gemini / 제미나이",
    content: "Gemini(제미나이)는 Google이 만든 AI 모델이에요. MyDay 앱에서 사진을 보고 감성적인 블로그 글을 써주는 두뇌 역할을 합니다. 글 생성과 챗봇 답변 모두 Gemini가 담당해요.",
  },
  {
    id: "term_blog_id",
    title: "용어: 블로그 아이디 / 네이버 블로그 아이디",
    content: "블로그 아이디는 네이버 블로그 주소에서 나만의 고유 이름이에요. blog.naver.com/xxxxx 에서 xxxxx 부분이 블로그 아이디입니다. 포스팅할 블로그를 지정하는 데 쓰여요.",
  },
  {
    id: "term_naver",
    title: "용어: 네이버",
    content: "네이버는 한국 최대 포털 사이트예요. MyDay 앱은 네이버 블로그에 자동으로 글을 올려주는 앱이라서, 네이버 아이디와 비밀번호가 필요해요.",
  },
  {
    id: "term_section",
    title: "용어: 섹션",
    content: "섹션은 블로그 글의 구간/단락을 뜻해요. 사진 한 장당 하나의 섹션이 만들어져요. 사진 3장이면 3개 섹션으로 글이 구성됩니다.",
  },
  {
    id: "term_hashtag",
    title: "용어: 해시태그",
    content: "해시태그는 #으로 시작하는 키워드 태그예요. 블로그 글 맨 아래에 붙어서 검색에 잘 걸리게 도와줘요. AI가 글 내용에 맞는 해시태그를 자동으로 만들어줍니다.",
  },
  {
    id: "term_char_count",
    title: "용어: 글자수",
    content: "글자수는 AI가 생성한 블로그 글의 전체 문자 수예요. 생성 후 화면에서 총 글자수를 확인할 수 있어요.",
  },
  {
    id: "term_body",
    title: "용어: 본문 / 포스팅 본문",
    content: "본문은 블로그 글의 메인 내용 부분이에요. AI가 써준 글을 '포스팅 본문' 화면에서 확인하고 직접 수정할 수도 있어요.",
  },
  {
    id: "term_regen",
    title: "용어: 재생성 / 새로 생성",
    content: "재생성은 같은 사진으로 AI에게 다시 글을 써달라고 하는 거예요. '포스팅 글 새로 생성하기' 버튼을 누르면 다른 스타일의 글을 받을 수 있어요.",
  },
  {
    id: "term_photo",
    title: "용어: 사진 / 이미지",
    content: "사진은 블로그 글의 소재가 되는 이미지예요. 최소 1장, 최대 10장까지 선택할 수 있고, 사진이 많을수록 AI가 더 풍성한 글을 써줘요.",
  },
  {
    id: "term_place",
    title: "용어: 장소 / 장소 선택",
    content: "장소는 사진을 찍은 곳을 말해요. 카페, 공원, 영화관 같은 것 중에서 고르거나 직접 입력할 수 있어요. 복수선택도 돼요!",
  },
  {
    id: "term_reason",
    title: "용어: 이유 / 이유 선택",
    content: "이유는 사진을 찍게 된 목적이에요. 데이트, 산책, 카페 투어 같은 것 중에서 고를 수 있고, 선택한 이유에 따라 AI가 글의 분위기를 맞춰줘요.",
  },
  {
    id: "term_person",
    title: "용어: 인물 / 사진 속 인물",
    content: "인물은 사진에 나온 사람을 말해요. '친구와 나', '가족들' 같이 자유롭게 적으면 돼요. 사람이 없는 사진이면 비워도 됩니다.",
  },
  {
    id: "term_confirm_btn",
    title: "용어: 확인 버튼",
    content: "확인 버튼은 사진을 선택한 뒤 눌러야 하는 버튼이에요. 이걸 안 누르면 다음 단계로 넘어갈 수 없어요!",
  },
  {
    id: "term_multi_select",
    title: "용어: 복수선택",
    content: "복수선택은 하나가 아닌 여러 개를 동시에 고를 수 있다는 뜻이에요. 장소나 이유를 선택할 때 여러 개를 함께 선택할 수 있어요.",
  },
  {
    id: "term_custom_input",
    title: "용어: 기타 직접 입력",
    content: "기타 직접 입력은 목록에 원하는 항목이 없을 때 직접 타이핑해서 넣을 수 있는 기능이에요. 장소 선택에서 특별한 장소를 추가할 때 쓰면 돼요.",
  },
  {
    id: "term_safety_policy",
    title: "용어: 안전 정책",
    content: "안전 정책은 AI가 부적절한 내용을 걸러내는 필터예요. 가끔 민감한 표현이 차단될 수 있는데, 표현을 살짝 바꿔서 다시 시도하면 해결돼요.",
  },
  {
    id: "term_usage_limit",
    title: "용어: 사용량 / API 사용량",
    content: "사용량은 Gemini API를 하루에 쓸 수 있는 양이에요. 무료 계정은 일일 제한이 있어서 초과하면 잠시 기다렸다가 다시 시도해야 해요.",
  },
  {
    id: "term_season",
    title: "용어: 절기",
    content: "절기는 입춘, 춘분, 하지, 추분 같은 계절의 변화를 나타내는 시기예요. AI가 글을 쓸 때 현재 절기를 자동으로 반영해서 시의적절한 글을 만들어줘요.",
  },
  {
    id: "term_holiday",
    title: "용어: 공휴일",
    content: "공휴일은 신정, 삼일절, 어린이날 같은 국가 기념일이에요. AI가 글을 쓸 때 공휴일이면 그에 맞는 분위기를 자동으로 반영해줘요.",
  },
  {
    id: "term_philosophy",
    title: "용어: 오늘의 철학 / 명언",
    content: "오늘의 철학은 매일 앱에 표시되는 철학자 명언 이미지예요. 앱을 열 때마다 영감을 주는 한마디를 볼 수 있어요.",
  },
  {
    id: "term_slogan",
    title: "용어: 슬로건",
    content: "슬로건은 앱의 한 줄 캐치프레이즈예요. MyDay 2.0의 슬로건은 '내 하루를 빛나게'입니다.",
  },
  {
    id: "term_initial_setup",
    title: "용어: 초기 설정",
    content: "초기 설정은 앱을 처음 실행했을 때 필요한 정보를 입력하는 과정이에요. 온보딩이라고도 해요. 네이버 계정과 Gemini API 키를 한 번만 넣으면 끝!",
  },
  {
    id: "term_account",
    title: "용어: 계정 / 네이버 계정",
    content: "계정은 네이버에 로그인할 때 쓰는 아이디와 비밀번호 세트예요. MyDay 앱이 네이버 블로그에 자동으로 글을 올리려면 네이버 계정이 필요해요.",
  },
  {
    id: "term_ai_writing",
    title: "용어: AI 글 생성 / AI 글쓰기",
    content: "AI 글 생성은 Gemini AI가 사진과 선택한 정보를 바탕으로 감성적인 블로그 글을 자동으로 써주는 기능이에요. 4단계 입력을 마치면 자동으로 시작돼요.",
  },
  /* ── 버전 변경 이력 ── */
  {
    id: "changelog_v2_2_v2_5",
    title: "버전 이력: v2.2~v2.5",
    content: "v2.2에서 챗봇 기능이 처음 추가되었고(Gemini 기반 앱 사용 가이드 도우미), 불필요 파일 정리와 하네스 스크립트 수정이 이루어졌어요. v2.3에서 리퍼럴+공유카드 시스템과 하단 고정메뉴(포스팅 기록, 빠른도움)가 추가됐고, v2.4에서 기존 챗봇을 RAG FAQ 챗봇(100 Intent, 500 Q/A)으로 교체했어요. v2.5에서 하네스 배포 파이프라인이 완료됐습니다.",
  },
  {
    id: "changelog_v2_6_v2_9",
    title: "버전 이력: v2.6~v2.9",
    content: "v2.6에서 공유·초대 콘텐츠를 전면 교체해 블로그 본문 기반 세로 이미지를 생성하고, 챗봇 대화체를 개선했어요. v2.8에서 RAG FAQ 답변을 전체 대화체로 바꾸고, 서버사이드 RAG 챗봇(벡터 인덱스+코사인 유사도+Gemini Flash)을 구축했어요. 용어 질문 라우팅도 개선해서 '~이 뭐니' 패턴을 서버 RAG로 직행시켰어요. v2.9에서 앱 용어 사전을 40개 이상으로 확장했습니다.",
  },
  {
    id: "changelog_v2_10_v2_14",
    title: "버전 이력: v2.10~v2.14",
    content: "v2.10에서 용어 RAG 강화본을 배포했고, v2.11에서 공유초대·포스팅기록 클릭 시 준비중 팝업을 표시하도록 했어요. v2.12에서 초대코드 복사도 준비중으로 전환하고 내 블로그 열기 연결을 복구했어요. v2.13에서 챗봇 텍스트를 133% 크기로 확대했고, v2.14에서 RAG FAQ 배지를 제거하고 블로그 열기 신뢰성을 보강했어요. 네이버 계정 전환 발행도 안정화했습니다.",
  },
  {
    id: "changelog_v2_15_v2_19",
    title: "버전 이력: v2.15~v2.19 (현재)",
    content: "v2.15에서 모바일 백엔드 복구를 강화해 HTTP/localhost 주소를 자동으로 Railway HTTPS로 정규화했어요. v2.16에서 포스팅 Network Error를 수정하고 CORS 차단을 방지했어요. v2.17에서 포스팅을 비동기 큐 방식으로 전환해 타임아웃 문제를 해결했고, v2.18에서 중복 발행 잠금과 발행 상태 복구를 도입했어요. v2.19가 현재 최신 버전입니다.",
  },
  {
    id: "changelog_features",
    title: "주요 기능 변경 요약",
    content: "현재 MyDay 2.0 앱의 핵심 기능: 사진 기반 AI 블로그 글 생성(Gemini), 네이버 블로그 자동 포스팅(비동기 큐), RAG 기반 챗봇(로컬 FAQ + 서버 벡터 검색), 하단 메뉴(빠른도움, 내 블로그 열기), 계정별 세션 분리 발행. 공유·초대와 포스팅 기록은 현재 준비 중이에요.",
  },
  /* ── 기술 용어 (Change Log에서 등장하는) ── */
  {
    id: "term_async_queue",
    title: "용어: 비동기 큐 / publish-async",
    content: "비동기 큐는 포스팅 요청을 바로 처리하지 않고 대기열에 넣어서 순서대로 처리하는 방식이에요. 덕분에 타임아웃 없이 안정적으로 발행할 수 있어요. jobId로 진행 상황을 확인할 수 있습니다.",
  },
  {
    id: "term_cors",
    title: "용어: CORS / 네트워크 에러",
    content: "CORS는 브라우저가 다른 서버에 요청할 때 보안을 위해 확인하는 규칙이에요. MyDay 앱에서 가끔 Network Error가 뜨면 이 CORS 설정 문제일 수 있는데, v2.16에서 해결했어요.",
  },
  {
    id: "term_harness",
    title: "용어: 하네스 / 하네스 배포",
    content: "하네스는 앱을 빌드하고 서명하고 폰에 설치하고 실행하는 자동화 파이프라인이에요. scripts/harness_cycle.sh 스크립트로 한 번에 처리할 수 있어요.",
  },
  {
    id: "term_rag",
    title: "용어: RAG / 벡터 검색",
    content: "RAG(Retrieval-Augmented Generation)는 질문에 관련된 정보만 검색해서 AI에게 넘기는 기법이에요. MyDay 챗봇은 질문을 벡터로 변환하고 가장 비슷한 지식 조각을 찾아서 Gemini가 자연스러운 답변을 만들어줘요.",
  },
  {
    id: "term_duplicate_lock",
    title: "용어: 중복 발행 잠금",
    content: "중복 발행 잠금은 이전 포스팅이 아직 처리 중일 때 같은 계정으로 새 발행을 막아주는 안전장치예요. 완료되거나 실패하면 자동으로 잠금이 풀려요.",
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
