## **👚OyeongShop.ver1 (오영샵)**
- spring기반 웹개발 학습을 위한 여성의류 쇼핑몰 프로젝트 입니다.
- 친숙한 비즈니스 로직과 이해하기 쉬운 사이트 플로우, 다양한 학습자료 등의 학습 적합성을 고려한 프로젝트 입니다.
- 개발 기간 : 23.9.13 ~ 23.9.27<br>
- 참여 인원 : 2명 (동갑기코딩친구)<br>
      
    |<img src="https://avatars.githubusercontent.com/u/126163816?s=400&v=4" width="140" height="160"/><br/>BE 오승언 (팀장) <br/><a href="https://github.com/5seung">GitHub</a>|<img src="https://avatars.githubusercontent.com/u/144882233?v=4" width="140" height="160"/><br/>BE 김나영 <br/><a href="https://github.com/nayonez">GitHub</a>|
    |:---:|:---:|
    | <strong>주요 역할</strong> <br> &middot; 전체 프로젝트 관리 <br> &middot; 회원 및 상품 파트 <br> &middot; 프론트 디자인 | <strong>주요 역할</strong> <br> &middot; 리뷰 파트 <br/> &middot; 프론트 디자인 |

<br/>

##  🛠 기술스택

### **[Front-end]**
![HTML5](https://img.shields.io/badge/html5-%23E34F26.svg?style=for-the-badge&logo=html5&logoColor=white)
![CSS3](https://img.shields.io/badge/css3-%231572B6.svg?style=for-the-badge&logo=css3&logoColor=white)
![JavaScript](https://img.shields.io/badge/javascript-%23323330.svg?style=for-the-badge&logo=javascript&logoColor=%23F7DF1E)
![Bootstrap](https://img.shields.io/badge/bootstrap-%238511FA.svg?style=for-the-badge&logo=bootstrap&logoColor=white)


### **[Back-end]**   
![Java](https://img.shields.io/badge/java8-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![Spring](https://img.shields.io/badge/spring-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white)

### **[DB]**
![Oracle](https://img.shields.io/badge/Oracle-F80000?style=for-the-badge&logo=oracle&logoColor=white)

### **[Tool & Environment]**
![eclipse_ide](https://img.shields.io/badge/eclipse_ide-%2C2255.svg?style=for-the-badge&logo=eclipseide&logoColor=white)

<br/>

## 💻 ERD
- [📌ERD 링크](https://www.erdcloud.com/d/vwKwCAP5Y26J2y59E)
- Table 7

![image](https://github.com/5seung/OyeongShop/assets/126163816/eb9fd4a3-edd3-44df-a961-eb494402bf98)

<br/>

## 📍 주요 기능
### 유저(회원) 권한

<details>
<summary>상품</summary>
  
- 카테고리별 상품 조회
- 상품 목록조회
- 상품 정보 상세보기
- 찜하기(위시리스트 담기)
- 장바구니 담기
  
</details>

<details>
<summary>회원(마이페이지)</summary>
  
- 위시리스트 조회
  
</details>

<details>
<summary>주문/결제</summary>
  
- 단일상품 주문
    

</details>
<details>
<summary>리뷰</summary>
 
- 리뷰 작성  
  + 자신이 구매한 상품만 리뷰 생성 가능
  + 리뷰 이미지는 선택적으로 첨부 가능
  + 리뷰 이미지는 AWS S3 에 저장
    
- 리뷰 조회  
   + 상품별 리뷰 조회 (상품 상세보기 페이지 하단)  
   + 내가 작성한 리뷰 (마이페이지)
  
- 리뷰 삭제  
  + 구매자 본인만 삭제 가능
  
</details>


### 관리자 권한
<details>
<summary>상품</summary>
  
- 상품 등록  
  + 상품 이미지는 1장 이상 필수 입력
  
- 상품 삭제
  
</details>



### 기능 영상 






<br/>

## 💫 프로젝트 회고
<details>
<summary> 🌈 좋았던 점 </summary>
<br/>

**첫 팀장 역할 수행**

- 팀원이 한명밖에 없었지만, 팀장으로서 프로젝트를 주도적으로 이끌어본 첫 경험이 뜻 깊었다.

**Spring Framework에 대한 이해도 상승**

- [당근 프로젝트](https://github.com/5seung/SpringCarrotMarket) 진행시 파악하지 못했던, spring legacy project의 설정들과 파일 구조를 이해할 수 있었다. 또한 로그인관련 기능을 구현하면서, 스프링 인터셉터에 대한 추가적인 학습을 통해 Servlet의 Filter, Dispatcher Servlet 등을 익힐 수 있었다.

</details>
<details>
<summary> 🌧️ 아쉬웠던 점 </summary>
<br/>
      
**부족한 핵심 기능**

- 프로젝트 진행 기간이 짧고, 팀원이 적어 쇼핑몰의 핵심 기능을 제대로 구현하지 못했다. 
다음에 프로젝트를 진행한다면, 해당 프로젝트를 개선하여 핵심 기능을 추가하고 특히 장바구니 기능을 온전하게 구현해보고 싶다.

**기록의 아쉬움**

- 같은 어려움이 발생한 것을 깨닫고, 구현 시 어려웠던 점, 배운 점 등을 꼼꼼히 기록하고 싶었다. 하지만 기록이 습관화되지 않았고, 차일피일 미루다보니 이번 프로젝트에서도 기록을 거의 남기지 못했다. 다음에는 구체적인 방법을 고민하여 알찬 학습일지를 작성하고 싶다.

**미숙한 Git 사용**

- 항상 팀원으로 프로젝트를 받아서 보내기만 했었기 때문에 일부 사용하는 기능만 알고 사용했다. 이번 프로젝트는 팀장으로 git에서 주체적으로 확장된 범위에서 사용해야했고, 추가적으로 팀원에게 git을 가르쳐줘야 했기 때문에 얇팍한 지식이 밑천을 드러냈다.
결국 이번 프로젝트는 git 사용의 어려움을 극복하지 못하고 git을 사용한 버전관리를 포기했다.
git에 대한 지식을 보충해서 다음에는 git을 활용하여 버전관리를 해야겠다.

</details>

</br>

## 🚀 정보
- 청년취업사관학교 새싹 영등포 SW캠퍼스<br>
  - 백엔드 구축을 위한 클라우드 기술 활용 개발자 과정(JAVA 기반)
- Sesac 🌱 mini Project
