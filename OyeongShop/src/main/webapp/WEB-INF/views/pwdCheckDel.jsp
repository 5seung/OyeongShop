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
	min-height: 22em; 
}
#left{
	width: 25%;
}
#right{
	width: 100%;
	padding: 0 3em;
}

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

.my-btn {
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
			<!-- Right Content - 리뷰비밀번호 확인 폼 -->
			<form id="checkform" action="/oyeongshop/reviewDel.do"  method="GET">
				<h3>리뷰 삭제 페이지</h3>
				<input type="hidden" name="reviewId" value="${reviewId}">
				<label for="reviewPwd">비밀번호</label>
				<input type="text" id="reviewPwd" name="reviewPwd" required>
				<input type="submit" value="삭제">
				<br> <br> 
			</form>
		</div>
	</div>
	<jsp:include page="./common/footer.jsp"></jsp:include>
</body>
</html>
