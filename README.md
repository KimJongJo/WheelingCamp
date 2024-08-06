# Wheeling Camp
```
차박 용품 대여/판매 웹 어플리케이션 프로젝트, 
Wheeling Camp의 프로젝트 레포지토리입니다.

가능한 새로운 기술을 접목시켜보고자 구상한 차박 관련 정보 제공 및 차량/물품 구매/대여 사이트입니다.
적극적으로 React 와 같은 새로운 프레임워크를 사용했고 추가적으로
Open AI, Kakao Map, Login(Kakao, Google, Naver), Naver Clova OCR, I'm Port 를 포함하는 API 등
다양한 API를 활용하였습니다.

기본적인 Spring Boot 를 기반으로 Oracle Cloud DB와 Mybatis 를 이용하여 쇼핑몰의 필수적인 기능
(구매 / 판매 / 상품 관리 / 회원 관리 결제등..)이 가능하고 각 기능에 대하여 CRUD 가능하도록 설계했습니다.

인원 : 6명
프로젝트 기간 : 2024/05/20 ~ 2024/06/27
맡은 역할 : 소셜로그인(카카오, 구글), 아이디/비밀번호 찾기, 장바구니/관심상품, 1:1 채팅(웹 소켓), 게시글 작성, 상품 리뷰
```
---

Table
![image](https://github.com/user-attachments/assets/8d182ff8-61bb-49e3-9ad4-500c895406f2)


<details>
<summary>
개발 환경
</summary>

  
| Environment | Detail |
| --- | --- |
| 환경 | Windows, Linux |
| 언어 | Java, Javascript, HTML5, CSS3, jQuery, Oracle SQL |
| 프레임워크 / 라이브러리|  Bootstrap5, Spring Boot, React.js, MUI, Rechart, Material React Table V2, Node.js |
| 데이터베이스 | Oracle XE, Oracle Cloud, Mybatis | 
| 툴 | Spring Tools 4, Spline 3D, DBeaver, Postman |
| WAS | Apache Tomcat, AWS, Vercel |
| API | Kakao Mobility, Kakao Map, Open AI, Clova OCR, Login(Kakao, Google, Naver) |
| 협업 | Github, Notion, ERD Cloud, Draw.io, Figma |

  
</details>


### 소셜 로그인
![image](https://github.com/user-attachments/assets/4b6f9bb0-d72b-48fe-b53c-e22862d53bca)
소셜로그인을 할 때 이미 가입을 한 경우와 소셜로그인으로 첫 로그인인 경우를 나누어서 로그인 또는 회원가입을 시켜줍니다. <br>
회원가입을 하기 전에 사용하려는 이메일로 이미 일반 회원가입을 한 경우에는 이메일 중복검사로 인해 회원가입을 못하게 막습니다.<br>
이메일 중복검사를 통과했을 때 필수가 되는 정보들을 추가로 입력 받을 수 있도록 페이지 이동을 시켜주고 정보를 입력 받은 뒤 가입 시켜줍니다.

<hr>

### 아이디/비밀번호 찾기
![image](https://github.com/user-attachments/assets/d788f6ca-8035-4884-8bec-d33bcff7bfe1)
회원 이모티콘을 클릭 하게 되면 로그인을 할 수 있는 모달창이 나타납니다. <br>
아이디 찾기와 비밀번호 찾기 텍스트를 클릭하면 진행 할 수 있는 모달창으로 넘어갑니다.<br>
아이디를 찾을 때 작성한 이름과 본인인증에서 사용했던 정보를 검색해서 회원 테이블에 해당하는 회원이 존재하는지 확인합니다.<br>
일반 회원가입으로 가입한 회원인 경우 아이디를 보여주고 소셜로그인을 통해서 가입한 회원은 어떤 방식으로 로그인 했는지 알려줍니다.<br><br>
비밀번호 찾기도 입력한 회원 정보가 테이블에 존재하는지 먼저 확인을 하고 비밀번호 찾기를 눌렀을 때 새 비밀번호를 설정할 수 있는 추가 입력창이 나타납니다.<br>
비밀번호 변경은 일반 회원가입으로 가입한 회원만 가능합니다.

<hr>

### 장바구니, 관싱상품

![image](https://github.com/user-attachments/assets/b59673c9-ac26-4689-b427-f43fef211ab0)

WheelingCamp는 상품 대여와 동시에 캠핑 용품을 판매까지 하기 때문에 대여상품과, 구매상품의 장바구니를 따로 구현했습니다. <br>
필요에 따라 장바구니 안에 있는 상품을 모두 비울 수 있게 선택한 상품을 삭제하는 기능과 선택할 때마다 아래에 있는 결제 금액을 계산해서 나타나게 했습니다.<br>
관심상품에서는 장바구니에 추가할 수 있도록 담기 버튼을 만들었고, 캠핑 용품을 담을 때는 대여 장바구니 또는 구매 장바구니에 담을 수 있도록 했습니다.

<hr>

### 1:1문의
![image](https://github.com/user-attachments/assets/6e3e8d7b-e1ca-4aa1-8de9-e5532a9d2ef0)


1:1 문의는 웹소켓을 이용하여 실시간 채팅으로 구현했습니다.<br>
사용자가 로그인을 함과 동싱 핸드 셰이크 요청을 보내 양방향 통신을 가능하게 해서 실시간으로 메세지를 받을 수 있게 했습니다.<br>
1:1문의이기 때문에 사용자 시점에서는 채팅 목록이 보이지 않고 관리자와 대화할 수 있는 채팅방 하나만 보입니다. <br>
채팅방이 닫혀 있는 경우 메세지가 도착했을 때 실시간으로 알림을 띄워줍니다. <br><br>
관리자 시점에서는 채팅목록에서 대화하고 있는 채팅방임을 표시하기 위해 말풍선 안에 색을 채워넣어 구분했습니다.<br>
대화하고 있는 방에서 문의가 오면 바로 읽음 처리를 하고 대화를 하고 있지 않은 방에서 문의가 오면 새로고침 해 읽지 않은 문의를 채팅목록의 최상단으로 올려 최신 상태를 유지해주었습니다.
<hr>


