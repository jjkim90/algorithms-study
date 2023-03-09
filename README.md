# 알고리즘 공부

BOJ 답안을 정리합니다.

# VS Code에 JAVA 개발 환경 설정하기

## Java 설치, 환경변수 설정

- JDK가 설치되어 있는지 확인하려면, 터미널에서 "java -version" 명령어를 입력합니다.

## Java Extension Pack 설치

- VS Code 좌측의 사이드바에서 "Extensions" 아이콘을 누릅니다.
- 검색창에 "Java Extension Pack"을 입력하고, 설치 버튼을 누릅니다.

## settings.json 설정

- Ctrl + Shift + P 를 누른 후, “settings.json”을 검색합니다.
- Preferences: Open User Settings (JSON)을 클릭합니다.
- 중괄호 안에 `"java.home": {jdk 설치 경로}` 을 입력하고 저장합니다. 예를 들어, `"java.home": "C:\\Program Files\\Java\\jdk1.8.0_202”` 처럼 입력합니다. 역슬래시는 `\\`처럼 2번씩 입력해야 합니다.

# BOJ 답안 제출하기

`class Main{`

  `public static void main(String[] args){...} `
