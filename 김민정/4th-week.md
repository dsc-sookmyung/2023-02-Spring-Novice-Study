# 2023-02-Spring-Novice-Study
[23-24 GDSC Sookmyung 4기] 1분기 스터디(Spring 입문)를 위한 저장소

## 5장 스프링 시큐리티와 OAuth2.0으로 로그인 기능 구현하기

이번 시간에는 로그인 기능을 구현한다.

### 구글 서비스 등록
여기서 중요한 정보를 담은 application-oauth.properties는 .gitignore에 추가하여 볼 수 없도록 만든다.
(안 넣으면 중요한 정보가 노출되어 있다는 구글 메일도 온다.)

### 구글 로그인 연동하기
1. User 클래스 생성
2. Role 클래스 생성
3. UserRepository 인터페이스 생성
4. 스프링 시큐리티 설정을 위해 스프링 시큐리티 관련 의존성 추가
5. SecurityConfig 클래스 생성
6. CustomOAuth2UserService 클래스 생성
7. OAuthAttributes 클래스 생성
8. SessionUser 클래스 생성
9. 로그인 테스트를 위해 index.mustache 수정
10. IndexController 수정
11. localhost:8080 접속해보기
12. h2-console에도 접속해보고 게시글 등록을 위해 update

### 어노테이션 기반 개선하기
1. LoginUser 어노테이션 생성
2. LoginUserArgumentResolver 클래스 생성
3. WebConfig 클래스 생성
4. IndexController 수정

### 세션 저장소로 데이터베이스 사용하기
1. 의존성 추가
2. h2-console로 spring_session 확인하기

### 네이버 로그인
1. 네이버 서비스 등록하기
2. 키 값들 application-oauth.properties에 등록
3. 스프링 시큐리티 설정 등록을 위해 OAuthAttributes에 네이버인지 판단하는 코드와 네이버 생성자 추가하기

### 기존 테스트에 시큐리티 적용하기
1. application.properties에 가짜 설정값 등록하기
2. 스프링 시큐리티 테스트를 위한 여러 도구를 지원하는 spring-security-test를 build.gradle에 추가하기
3. PostApiControllerTest에 사용자 인증 추가하기(코드 변경)
4. HelloControllerTest의 스캔대상에서 SecurityConfig 제거하기
5. 여기에 가짜로 인증된 사용자 생성하기
6. Application.java에서 @EnableJpaAuditing 제거하기
7. JpaConfig 클래스 생성하기
