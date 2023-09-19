<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>웹 페이지</title>
    <style>
        body {
            margin: 0;
            padding: 0;
            font-family: Arial, sans-serif;
        }

        #header {
            background-color: #333;
            color: #fff;
            text-align: center;
            padding: 10px;
        }

        #container {
            display: flex;
            justify-content: space-between;
            align-items: flex-start;
            padding: 20px;
        }

        #left {
            flex: 1;
            background-color: #f0f0f0;
            padding: 10px;
        }

        #right {
            flex: 3;
            background-color: #fff;
            padding: 10px;
        }

        #bottom {
            background-color: #333;
            color: #fff;
            text-align: center;
            padding: 10px;
        }

        #joinform {
            max-width: 300px;
            margin: 0 auto;
        }

        #joinform label {
            display: block;
            margin-bottom: 10px;
        }

        #joinform input[type="text"],
        #joinform input[type="password"],
        #joinform input[type="email"] {
            width: 100%;
            padding: 8px;
            margin-bottom: 10px;
            border: 1px solid #ccc;
        }

        #joinform input[type="button"] {
            background-color: #333;
            color: #fff;
            border: none;
            padding: 10px;
            cursor: pointer;
            margin-bottom: 10px;
        }
    </style>
</head>
<body>
    <div id="header">
        <h1>웹 페이지</h1>
    </div>
    <div id="container">
        <div id="left">
            <!-- Left Content -->
            <!-- 여기에 좌측 컨텐츠를 추가하세요. -->
        </div>
        <div id="right">
            <!-- Right Content - 회원가입 폼 -->
            
            <form id="joinform" action="login.htm" method="post">
	            <h2>회원가입</h2>
                <label for="userid">아이디</label>
                <input type="text" id="userid" name="userid" required><br>

                <label for="pwd">비밀번호</label>
                <input type="password" id="pwd" name="pwd" required><br>
                
                <label for="pwdcheck">비밀번호확인</label>
                <input type="password" id="pwdcheck" name="pwdcheck" required><br>
                
                <label for="username">사용자 이름</label>
                <input type="text" id="username" name="username" required><br>
			
				<label for="address">주소</label>
				<input type="text" id="sample6_postcode" placeholder="우편번호">
				<input type="button" onclick="sample6_execDaumPostcode()" value="우편번호 찾기"><br>
				<input type="text" id="sample6_address" placeholder="주소"><br>
				<input type="text" id="sample6_detailAddress" placeholder="상세주소">
				<input type="text" id="sample6_extraAddress" placeholder="참고항목">

                <label for="phone">전화번호</label>
                <input type="text" id="phone" name="phone" required><br>
                
                <label for="email">이메일</label>
                <input type="email" id="email" name="email" required><br>
                <input type="button" value="회원가입">
                <!-- button누르면 모달창 띄우기 정말 가입하시겠습니까? 띄우고 가입하기/취소하기 버튼 두개 생성해서 가입하기 누르면  데이터 넘어가야함-->
            </form>
        </div>
    </div>
    <div id="bottom">
        <p>© 2023 웹 페이지</p>
    </div>
    
<!--     <script type="text/javascript">
	function login(){
		if(document.home.userid.value==""){
			alert("아이디를 입력해주세요");
		}else if(document.home.pwd.value==""){
			alert("비밀번호을 입력해주세요");
			document.writeform.pwd.focus();
		}else{
			document.writeform.submit(); //전송
		}
	}
	</script> -->
   

<script src="//t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js"></script>
<script>
    function sample6_execDaumPostcode() {
        new daum.Postcode({
            oncomplete: function(data) {
                // 팝업에서 검색결과 항목을 클릭했을때 실행할 코드를 작성하는 부분.

                // 각 주소의 노출 규칙에 따라 주소를 조합한다.
                // 내려오는 변수가 값이 없는 경우엔 공백('')값을 가지므로, 이를 참고하여 분기 한다.
                var addr = ''; // 주소 변수
                var extraAddr = ''; // 참고항목 변수

                //사용자가 선택한 주소 타입에 따라 해당 주소 값을 가져온다.
                if (data.userSelectedType === 'R') { // 사용자가 도로명 주소를 선택했을 경우
                    addr = data.roadAddress;
                } else { // 사용자가 지번 주소를 선택했을 경우(J)
                    addr = data.jibunAddress;
                }

                // 사용자가 선택한 주소가 도로명 타입일때 참고항목을 조합한다.
                if(data.userSelectedType === 'R'){
                    // 법정동명이 있을 경우 추가한다. (법정리는 제외)
                    // 법정동의 경우 마지막 문자가 "동/로/가"로 끝난다.
                    if(data.bname !== '' && /[동|로|가]$/g.test(data.bname)){
                        extraAddr += data.bname;
                    }
                    // 건물명이 있고, 공동주택일 경우 추가한다.
                    if(data.buildingName !== '' && data.apartment === 'Y'){
                        extraAddr += (extraAddr !== '' ? ', ' + data.buildingName : data.buildingName);
                    }
                    // 표시할 참고항목이 있을 경우, 괄호까지 추가한 최종 문자열을 만든다.
                    if(extraAddr !== ''){
                        extraAddr = ' (' + extraAddr + ')';
                    }
                    // 조합된 참고항목을 해당 필드에 넣는다.
                    document.getElementById("sample6_extraAddress").value = extraAddr;
                
                } else {
                    document.getElementById("sample6_extraAddress").value = '';
                }

                // 우편번호와 주소 정보를 해당 필드에 넣는다.
                document.getElementById('sample6_postcode').value = data.zonecode;
                document.getElementById("sample6_address").value = addr;
                // 커서를 상세주소 필드로 이동한다.
                document.getElementById("sample6_detailAddress").focus();
            }
        }).open();
    }
</script>
</body>
</html>
