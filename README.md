![header](https://capsule-render.vercel.app/api?type=transparent&height=100&text=나의%20역할%20:%20Java,%20Python,%20DB&fontColor=750bde&fontSize=50)
### 1. Java와 Python를 사용해 웹 서비스의 백엔드 기능 구현
  - 로그인, 로그아웃, 회원가입 등 기본 기능
  - 문의사항 및 답변 등록, 수정, 삭제
  - 병해충 분석, 정보 및 상세정보 페이지
  - 검색, 검색 결과 페이지, 페이징 기능
  - Spring에서 Flask 서버로 이미지를 전송하여 저장
  - Flask에서 Spring으로 분석 결과를 보낸 뒤, Spring에서 값에 따라 처리
### 2. DB 설계 및 구축, 데이터 수집 및 import
  - AI-Hub, 농사로 등 사이트에서 병해충 관련 데이터 수집
  - 웹 서비스에 제공할 수 있게 전처리

<!-- - 로그인, 검색, 문의사항, 농업일지 등 DB에서 원하는 정보를 select한 후, 페이지에 보여주는 기능
- 회원가입, 문의사항 등록, 농업 일지 등록 등 사용자가 입력한 값을 DB에 저장하는 기능
- 회원 정보 수정, 답변 수정 등 DB에 저장된 데이터 중, 조건에 맞는 데이터만 수정하는 기능
- 회원 탈퇴 및 삭제, 문의사항 및 농업 일지 삭제 등 사용자가 원하는 데이터만 삭제하는 기능
- 페이징 기능 -->


## 📜 프로젝트를 진행하며 얻은 것
- 학습한 기술
  - GitHub를 활용해 버전 관리 및 협업하는 방법
  - JSP 파일에서 Servlet 파일로 데이터를 보내고 원하는 방식으로 데이터를 처리한 후, 다시 JSP 파일로 값을 보내는 법
  - 데이터베이스 설계 및 구축을 통해 SQL문과 entity 관계에 대한 지식 습득
  - 많은 회의로 커뮤니케이션 기술 상승
  
  
- 어려웠던 부분, 오류 상황
  - 하루마다 프로젝트 전 후로 회의를 통해 팀원들과의 커뮤니케이션이 중요하다는 점
  
---

## 프로젝트를 진행한 이유
![image](https://user-images.githubusercontent.com/89984853/206596872-05bc048d-33f5-4cdd-a0cd-d0b3272d6084.png)
- AI 기술을 도입한 스마트팜 시스템의 관심이 높아짐에 따라 전 세계적으로 관련 기술 확보의 필요성이 생겼다. 그러나 농업에 대한 AI 기술 도입은 타 분야에 비해 요원한 것이 현실이다. 선진국에서는 작물 질병 관련 데이터를 확보 및 일부 공개하고 있으나 접근성 및 저작권 문제와 환경적인 차이로 국내 즉시 도입이 어렵다. 이에 우리 병해충 정보 분석 및 정보 서비스는 대한민국에서 재배하는 작물을 선정하여 작물의 병해충 피해 분석뿐만 아니라 정보 제공 및 관리하는 서비스를 제공하고자 한다.

---

## 프로젝트 소개

- 개발 기간 : 2022년 11월 2일 ~ 2022년 12월 12일
- 개발 인원 : 4명

#### 프로젝트 소개
![image](https://user-images.githubusercontent.com/89984853/206596956-3f56583a-d0dd-48b7-ad81-860ca5d88549.png)
  - 질병에 걸리거나 해충이 있는 등 훼손이 있는 고추 작물 이미지를 받아 어떤 병해충인지 분석해준 후 병해충명, 방제 방법 등 관련 정보를 제공하는 서비스
  - 간단한 메모 형태의 농업일지로 작물 및 화분 관리 기록을 남겨 관리할 수 있는 서비스
  - 농업 계획을 수월하게 세울 수 있도록 농작업 일정 달력을 통해 파종과 수확 일정 등 정보를 제공

#### 프로젝트 개발 목표 및 내용
#### 개발 목표
![image](https://user-images.githubusercontent.com/89984853/206597371-23e8aec2-02ec-42db-9371-610d992405d7.png)
  - 어떤 병해충인지 모를 때, 상담 혹은 문의 시간을 기다리지 않아도 사진만 업로드하면 빠르게 병해충 분석 및 정보 제공 서비스를 받을 수 있다.
  - 달력 메모 형태의 농업 일지 기능을 통해 효율적으로 농장 및 화분 관리를 할 수 있다.
  - 농작업 일정 달력을 통해 거름과 파종, 수확 등의 정보를 제공하여 농업 계획을 세울 수 있다.

#### 개발 내용
  - 데이터 수집 및 전처리 내용
![image](https://user-images.githubusercontent.com/89984853/206597147-372e956d-a1d2-4df8-b367-45c18868e4fb.png)
    - AI-Hub에서 고추의 정상, 탄저병, 흰가루병, 꽃노랑총채벌레, 담배가루이, 담배거세미나방, 담배나방, 도둑나방, 배추흰나비, 복숭아혹진딧물, 열대거세미나방 이미지를 각각 1300장씩 수집
    - 640x640 이미지 사이즈 조절
    - 병해충 부분 라벨링
  - Deep Learning
    - YOLO v7을 이용해 병해충의 유무 및 형태 감지를 한 다음 어떤 병해충인지 변수에 담아 Spring으로 전송
  - 웹페이지 기능 및 구현
    - Flask, Python, Java를 활용하여 Deep Learning 모델과 연동
    - HTML/CSS, Bootstrap, Java, JSP, JS, Pojo, MySQL, Spring 등을 활용한 웹사이트 제작
    - 분석하고자 하는 작물 이미지 업로드 후 Deep Learning 모델로 전송하는 페이지
    - 병해충 정보를 DB에서 불러와 병해충 정보를 보여주는 페이지
    - Main 페이지에서 농작업 일정을 달력으로 확인 가능
    - 농업 일지와 문의사항을 작성 및 관리하는 페이지

- 산출문서
  - 프로젝트 기획서(브레인스토밍, 아이디어 기획서)
  - WBS
  - 요구사항 정의서
  - DB 요구사항 분석서
  - 테이블 명세서
  - 화면 설계서
  - 빅데이터 분석서

---

## 1. 사용 기술
![image](https://user-images.githubusercontent.com/89984853/206597032-e2123135-8d96-48ac-9af5-bffbb36c3f62.png)

- 언어   
![Java](https://img.shields.io/badge/JAVA-007396?style=for-the-badge&logo=java&logoColor=white)
![Javascript](https://img.shields.io/badge/javascript-%23323330.svg?style=for-the-badge&logo=javascript&logoColor=%23F7DF1E)
![JSP](https://img.shields.io/badge/JSP-%2300599C.svg?style=for-the-badge&logoColor=white)
![Python](https://img.shields.io/badge/python-3670A0?style=for-the-badge&logo=python&logoColor=ffdd54)
![HTML5](https://img.shields.io/badge/html5-%23E34F26.svg?style=for-the-badge&logo=html5&logoColor=white)
![CSS3](https://img.shields.io/badge/css3-%231572B6.svg?style=for-the-badge&logo=css3&logoColor=white)

- DB   
![MySQL](https://img.shields.io/badge/mysql-%231572B0.svg?style=for-the-badge&logo=mysql&logoColor=white)

- Framworks   
![Spring](https://img.shields.io/badge/spring-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white)
![Anaconda](https://img.shields.io/badge/Anaconda-%2344A833.svg?style=for-the-badge&logo=anaconda&logoColor=white)
![Bootstrap](https://img.shields.io/badge/bootstrap-%23563D7C.svg?style=for-the-badge&logo=bootstrap&logoColor=white)
![Flask](https://img.shields.io/badge/flask-000000?style=for-the-badge&logo=flask&logoColor=white)

- IDEs   
![Eclipse](https://img.shields.io/badge/Eclipse-FE7A16.svg?style=for-the-badge&logo=Eclipse&logoColor=white)
![Jupyter Notebook](https://img.shields.io/badge/jupyter-%23FA0F00.svg?style=for-the-badge&logo=jupyter&logoColor=white)

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
