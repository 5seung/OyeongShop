<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>OyeongShop</title>
<link href="resources/static/css/common.css" rel="stylesheet" type="text/css" />
<style>
#loginform {
	padding-left: 25%;
	width: 22em;
}

#loginform label {
	display: block;
	margin-bottom: 10px;
}

#loginform input[type="text"], #loginform input[type="password"] {
	width: 100%;
	padding: 8px;
	margin-bottom: 10px;
	border: 1px solid #ccc;
}

#loginform input[type="submit"] {
	width: 100%;
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
	<jsp:include page="./common/header.jsp"></jsp:include>
	<div id="container">
	<!-- Left Content -->
		<div id="left">
			<jsp:include page="./common/sideNav.jsp"></jsp:include>
		</div>
	<!-- Right Content :: 로그인 폼 -->
		<div id="right">
			<form id="loginform" action="/oyeongshop/login.do"  method="post">
				<label for="loginid">아이디</label> <input type="text" id="loginid" name="userId" required>
				<br> <br> 
				<label for="loginpwd">비밀번호</label> <input type="password" id="loginpwd" name="password" required>
				<br> <br> 
				<input type="submit" value="로그인"> 
				<label for="joinandsearchpwd">
					<button type="button" onclick="location.href='http://localhost:8090/oyeongshop/join';" class="my-btn">회원가입</button>
					<button type="button" onclick="" class="my-btn">비밀번호 찾기</button>
				</label>
			</form>
		</div>
	</div>
	<jsp:include page="./common/footer.jsp"></jsp:include>
</body>
</html>
