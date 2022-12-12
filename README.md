![header](https://capsule-render.vercel.app/api?type=transparent&height=100&text=나의%20역할%20:%20데이터%20수집,%20전처리,%20Java,%20실행%20화면구성&fontColor=750bde&fontSize=35)
### 1. 데이터 수집 
       약 1000개의 사자성어 데이터를 수집함
       * 데이터 출처 : 고사성어 1000개 모음 > 교육서식 | 폼114 (form114.co.kr)
### 2. 데이터 전처리 가공
       수집한 데이터 중 많이 사용하는 사자성어 위주로 간추림, 오타 제거
### 3. 화면 구성 
        1> 시작화면 구성
               1) 회원가입 - 데이터베이스 항목 생성	
               2) 로그인 - 데이터베이스 조회하여 일치시 다음 단계로
               3) 게임 종료 - 게임 종료
        2> 메뉴화면 구성
               1) 게임 시작 - 난이도 선택 (상,중,하,랜덤)	
               2) 오답노트 확인 
               3) 랭킹 확인
               4) 로그 아웃

<!-- - 로그인, 검색, 문의사항, 농업일지 등 DB에서 원하는 정보를 select한 후, 페이지에 보여주는 기능
- 회원가입, 문의사항 등록, 농업 일지 등록 등 사용자가 입력한 값을 DB에 저장하는 기능
- 회원 정보 수정, 답변 수정 등 DB에 저장된 데이터 중, 조건에 맞는 데이터만 수정하는 기능
- 회원 탈퇴 및 삭제, 문의사항 및 농업 일지 삭제 등 사용자가 원하는 데이터만 삭제하는 기능
- 페이징 기능 -->


## 📜 프로젝트를 진행하며 얻은 것
- 학습한 기술
  - JAVA, SQL  
  
- 어려웠던 부분, 오류 상황
  - 생소한 용어
  - 객체(Object)지향 프로그램에 대한 이해 부족
---

## 프로젝트를 진행한 이유
 - **Java를 활용한 미니게임을 만들어 객체지향 프로그램에 익숙해지기**
---

## 프로젝트 소개

- 개발 기간 : 2022.7.12 ~ 2022.7.14

- 개발 인원 : 4명

#### 프로젝트 기능 소개
##### 1. 시작화면
 - 1) 회원가입 - 데이터베이스 항목 생성
 - 2) 로그인 - 데이터베이스 조회하여 일치시 다음 단계로
 - 3) 게임 종료 - 게임 종료
 
 ##### 2. 메뉴화면

- 1) 게임 시작 
   * 난이도 선택 - 난이도별 해당 쿼리문 불러오기 
   * 정답시 문제별 점수 합산해서 점수로 계산,오답시 DB & 오답노트에 자동으로 등록되며 5회 틀리면 GAME OVER 출력 
   * 게임 오버 당하지 않고 끝까지 플레이 시 WINNER 출력
   * 랜덤 난이도 추가
   * 난이도 섞어서 20문제 출력, 난이도별 점수 다름
   * 게임 끝나고 점수 합산하여 최고기록 데이터베이스에 갱신, 더 낮은 점수는 갱신되지 않음

- 2) 오답노트 확인
   * 틀린 문제의 설명문, 답을 목록화하여 출력

- 3) 랭킹 확인
   * 아이디마다 저장된 점수를 내림차순으로 불러옴
   * 1등부터 출력
   * 등수, 아이디, 이름, 점수 순으로 출력

- 4) 로그아웃
   * 로그아웃 시 시작화면으로 돌아감



#### 산출문서
  - 요구사항 정의서
  - 테이블 명세서

---

## 1. 사용 기술
- 언어   
![Java](https://img.shields.io/badge/JAVA-007396?style=for-the-badge&logo=java&logoColor=white)

- DB   
![oracle](https://img.shields.io/badge/oracle-F80000.svg?style=for-the-badge&logo=oracle&logoColor=white)

- IDEs   
![Eclipse](https://img.shields.io/badge/Eclipse-FE7A16.svg?style=for-the-badge&logo=Eclipse&logoColor=white)
---


## 2. 흐름도 및 메뉴 구성도
### 서비스 흐름도   
 ![서비스흐름도](https://user-images.githubusercontent.com/107903374/206971733-e7a7c50f-b869-4bb0-aa5b-13946a4499bc.png)

---

## 3. 구현 화면
### Main
![image](https://user-images.githubusercontent.com/107903374/206979346-08fa6859-d474-4884-950e-1dd3ae66dc99.png)


### 점수 갱신
![image](https://user-images.githubusercontent.com/107903374/206979439-65553f42-54ce-48fe-90f8-2ad1af1f8706.png)


### 오답 노트 및 랭킹 확인
![image](https://user-images.githubusercontent.com/107903374/206979608-2161cbf1-9134-46b3-b85f-a0edd52cd1d6.png)



### 로그 아웃 및 전체 게임종료
![image](https://user-images.githubusercontent.com/107903374/206979883-5b586784-6e3d-47f6-9dc5-df10093e9658.png)

---

## 4. 팀원 소개
|  이름  | Github 주소 |
| :----: | :-----------: |
| 송영지 | [Github](https://github.com/icecandywell) |
| 한우규 | [Github](https://github.com/hwk7217) |
| 김지은 | [Github](https://github.com/jeevelyjeev) |
| 박승현 | [Github](https://github.com/shpark0219) |
