import streamlit as st
import streamlit.components.v1 as components
import os

# 페이지 설정
st.set_page_config(page_title="일상 무자 (ilsang_mooja)", layout="wide")

# 빌드된 React 파일을 찾는 경로
build_dir = "dist"
index_file = os.path.join(build_dir, "index.html")

if os.path.exists(index_file):
    with open(index_file, 'r', encoding='utf-8') as f:
        html_content = f.read()
    
    # React 앱을 Streamlit 화면에 띄우기
    # (참고: 정적 자산 경로 문제 해결을 위해 iframe이나 직접 렌더링 방식을 사용합니다.)
    components.html(html_content, height=800, scrolling=True)
else:
    st.error("빌드된 파일을 찾을 수 없습니다. 'npm run build'를 먼저 실행해 주세요!")
    st.info("현재 폴더 위치: " + os.getcwd())
