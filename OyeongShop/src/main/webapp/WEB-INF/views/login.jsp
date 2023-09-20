<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>OyeongShop</title>
<style>
body {
	margin: 0;
	padding: 0;
	font-family: Arial, sans-serif;
	/*width: 100%; height: 100%; */
}

#container {
	display: flex;
	justify-content: space-between;
	align-items: flex-start;
	padding: 20px;
}
#left{
	width: 25%;
}
#right{
	padding: 0 3em;
}

#loginform {
	max-width: 300px;
	margin: 0 auto;
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

#loginform input[type="button"] {
	width: 49%;
	color: black;
	border: none;
	padding: 10px;
	cursor: pointer;
}
</style>
</head>
<body>
	<jsp:include page="./common/header.jsp"></jsp:include>
	<div id="container">
		<div id="left">
			<!-- Left Content -->
			<jsp:include page="./common/sideNav.jsp"></jsp:include>
		</div>
		<div id="right">
			<!-- Right Content - 로그인 폼 -->
			<form id="loginform" action="" method="post">
				<label for="loginid">아이디</label> <input type="text" id="loginid"
					name="loginid" required><br> <br> <label
					for="loginpwd">비밀번호</label> <input type="password" id="loginpwd"
					name="loginpwd" required><br> <br> <input
					type="submit" value="로그인"> <label for="joinandsearchpwd">
					<input type="button" value="회원가입"> <input type="button"
					value="비밀번호 찾기">
				</label>
			</form>
		</div>
	</div>
	<jsp:include page="./common/footer.jsp"></jsp:include>
</body>
</html>
