# 2023-02-Spring-Novice-Study
[23-24 GDSC Sookmyung 4기] 1분기 스터디(Spring 입문)를 위한 저장소

## 4장 머스테치로 화면 구성하기

이번 시간에는 머스테치를 통해 화면 영역을 개발하는 방법을 배운다.

템플릿 엔진은 지정된 템플릿 양식과 데이터가 합쳐져 HTML문서를 출력하는 sw
-> 서버 템플릿 엔진을 이용한 화면 생성은 서버에서 Java 코드로 문자열을 만든 뒤 이 문자열을 HTML로 변환하여 브라우저로 전달한다.
즉, 브라우저에서 작동될 때는 서버 템플릿 엔진의 손을 벗어나 제어할 수 없다.

머스테치는 수많은 언어를 지원하는 가장 심플한 템플릿 엔진이다.
<장점>
 - 문법이 다른 템플릿 엔진보다 심플하다
 - 로직 코드를 사용할 수 없어 View의 역할과 서버의 역할이 명확하게 분리된다.
 - Mustache.js와 Mustache.java 2가지가 다 있어 하나의 문법으로 클라이언트/서버 템플릿을 모두 사용 가능하다.

### 기본 페이지 만들기
1. 머스테치 스타터 의존성 build.gradle 등록
2. 첫 페이지를 담당할 index.mustache 생성
3. web 패키지 안에 IndexController 생성
4. test 패키지 안에 IndexControllerTest 생성
5. http://localhost:8080 으로 접속해보기

### 게시글 등록 화면 만들기
외부 CDN 사용
1. footer.mustache, header.mustache 생성
2. index.mustache 코드 변경
3. IndexController 변경
4. posts-save.mustache 생성
5. index.js 생성
6. footer.mustache 추가
7. 등록화면 확인하기

### 전체 조회 화면 만들기
1. index.mustache UI 변경
머스테치 문법이 적용됨.
2. PostsRepository 쿼리 추가
3. PostsService 코드 추가
4. PostsListResponseDto 변경
5. 목록 기능 확인하기

### 게시글 수정, 삭제 화면 만들기
1. posts-update.mustache 파일 생성
2. index.js 함수 추가
3. index.mustache 코드 수정
4. IndexController 메소드 추가
5. 수정 기능 확인하기
6. posts-update.mustache 추가
7. index.js 추가
8. PostsService 변경
9. PostsApiController 변경
10. 삭제 기능 확인하기

