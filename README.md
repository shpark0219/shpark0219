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

#### 화면 흐름도
![image](https://user-images.githubusercontent.com/107903374/206971733-e7a7c50f-b869-4bb0-aa5b-13946a4499bc.png)

#### 산출문서
  - 요구사항 정의서
  - 테이블 명세서

---

## 1. 사용 기술
- 언어   
![Java](https://img.shields.io/badge/JAVA-007396?style=for-the-badge&logo=java&logoColor=white)

- DB   
![oracle](https://img.shields.io/badge/oracle-%dd3333.svg?style=for-the-badge&logo=oracle&logoColor=white)

- IDEs   
![Eclipse](https://img.shields.io/badge/Eclipse-FE7A16.svg?style=for-the-badge&logo=Eclipse&logoColor=white)
---

## 2. ER Diagram
![ERD_최종](https://user-images.githubusercontent.com/89984853/205807925-1f1c668c-7ad7-4529-9ba8-31907bd4210a.png)

---

## 3. 흐름도 및 메뉴 구성도
### 서비스 흐름도   
 ![서비스흐름도](https://user-images.githubusercontent.com/89984853/205875333-3cc6fb37-1955-4836-9a7d-3076ca681349.png)


### 메뉴 구성도 
![메뉴 구성도](https://user-images.githubusercontent.com/89984853/205875352-b49542b2-1dea-4f89-aafc-3469fb6f85a0.png)


---

## 4. 프로젝트 일정
![알쓸농잡 프로젝트 일정](https://user-images.githubusercontent.com/89984853/206611775-ee0bebe5-9026-46c3-b9dc-820165369374.png)


---

## 5. 구현 화면
### Main
![image](https://user-images.githubusercontent.com/89984853/206602363-271d7bbc-3425-491b-8b1e-e4b4580f3541.png)
![image](https://user-images.githubusercontent.com/89984853/206600885-28a6a0f4-87a5-40f6-a77a-c7d4ab8711ca.png)



### 로그인   
![image](https://user-images.githubusercontent.com/89984853/206601072-b864cbcd-2f13-450f-a5c4-cd4b85a46f56.png)



### 회원가입   
![image](https://user-images.githubusercontent.com/89984853/206601118-a1134b98-3da7-4bf0-883a-e3f69c81af0c.png)


### 병해충 분석
![image](https://user-images.githubusercontent.com/89984853/206601183-eb40c287-cbc0-4e33-ac10-2eea9187efbf.png)


### 병해충 정보
![image](https://user-images.githubusercontent.com/89984853/206601735-7f1370a3-6225-4bfc-9f22-409e58e46d72.png)
![image](https://user-images.githubusercontent.com/89984853/206601806-41e5d36b-0899-4902-9a07-8dbddfb9b0a4.png)



### 질병 및 해충 상세 정보
![image](https://user-images.githubusercontent.com/89984853/206602912-82ebc857-6666-427c-bd8e-653d908fd764.png)
![image](https://user-images.githubusercontent.com/89984853/206602938-d668739d-c5f0-41cb-b4ae-6a73c3af924f.png)
![image](https://user-images.githubusercontent.com/89984853/206603193-b9e760ab-abbb-42ef-b604-0210f873c0f7.png)


### 농업일지
![image](https://user-images.githubusercontent.com/89984853/206603409-f6e5d90f-5760-443f-a4a6-54a5fc897585.png)
#### 달력을 클릭하면 뜨는 입력창과 일정을 클릭하면 뜨는 삭제 알림창
![image](https://user-images.githubusercontent.com/89984853/206603443-c337ba4a-1fdb-46c4-b224-c54776c86c49.png)
![image](https://user-images.githubusercontent.com/89984853/206603511-966b54b7-4384-47b5-a634-bec2caffb02a.png)


### 마이페이지   
#### 회원 정보 수정
![image](https://user-images.githubusercontent.com/89984853/206603679-ff563cc5-5266-4690-9915-914016bb00c9.png)

#### 활동 내역
![image](https://user-images.githubusercontent.com/89984853/206603828-23f06415-612b-4693-8e49-b330a1495e8e.png)



### 검색 결과   
#### 검색 내용이 없을 때
![image](https://user-images.githubusercontent.com/89984853/206604525-c4cc4bb5-0e37-4cad-9659-dbde26a9cccc.png)

#### 검색 내용이 있을 때
![image](https://user-images.githubusercontent.com/89984853/206604646-56f5632b-8819-4448-ab13-856f5c43b9d2.png)
#### 페이징
![image](https://user-images.githubusercontent.com/89984853/206604729-5c1ebc9c-8a30-4c8e-a52a-9516ef1fe7f9.png)



### 문의사항
![image](https://user-images.githubusercontent.com/89984853/206606110-3abccb81-9c8e-4b07-9045-23419daacdc4.png)
#### 문의사항 글쓰기
![image](https://user-images.githubusercontent.com/89984853/206605153-dc834e7f-6f8b-4ce8-a0ff-58c2b0cf1db1.png)
#### 관리자로 로그인 시 보이는 문의사항 페이지
![image](https://user-images.githubusercontent.com/89984853/206605318-3f2ae894-b47e-40ff-b15d-f70e16a7b96f.png)
#### 댓글 등록창
![image](https://user-images.githubusercontent.com/89984853/206605624-f0630954-65b7-4b12-a432-b2f955182953.png)


### 공지사항   
![image](https://user-images.githubusercontent.com/89984853/206605109-f7e2ce75-1ba5-42ed-85cf-2636b5d355d1.png)



### 회원정보 관리
![image](https://user-images.githubusercontent.com/89984853/206605804-6c14f1ee-f4fc-4667-9d68-41dd7dd27b55.png)


---

## 6. 팀원 소개
|  이름  | Github 주소 |
| :----: | :-----------: |
| 송영지 | [Github](https://github.com/icecandywell) |
| 김도연 | [Github](https://github.com/kdn00) |
| 김동현 | [Github](https://github.com/JamesKimberly) |
| 박승현 | [Github](https://github.com/shpark0219) |
