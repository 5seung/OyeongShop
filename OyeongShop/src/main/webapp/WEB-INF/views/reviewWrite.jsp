<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<title>리뷰 작성 페이지</title>
<style>
body {
	margin: 0;
	padding: 0;
	font-family: Arial, sans-serif;
}

#container {
	display: flex;
	justify-content: space-between;
	align-items: flex-start;
	padding: 20px;
}

#left {
	width: 25%;
}

#right {
	width: 100%;
	padding: 0 3em;
}

#reviewWriteform {
	padding-left: 25%;
	width: 50%
}

#userId label, #reviewContent label, #reviewPwd label{
	display: block;
	margin-bottom: 10px;
}

#reviewWriteform input[type="text"], #reviewWriteform input[type="password"] {
	width: 100%;
	padding: 8px;
	margin-bottom: 10px;
	border: 1px solid #ccc;
}

#writebtn {
	width: 100%;
	background-color: #333;
	color: #fff;
	border: none;
	padding: 10px;
	cursor: pointer;
	margin-bottom: 10px;
}

/* #reviewList {

	max-width: 100%;
	margin: 0 auto;
} */

/*  {
	color: black;
	border: none;
	padding: 10px;
	cursor: pointer;
} */
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
			<!-- Right :: 리뷰작성 폼 -->
			<div id="reviewList">
			<form action="/oyeongshop/reviewWrite.do" method="GET" id="reviewWriteform">
				<h3>리뷰 작성 페이지</h3>
					<label for="userId">리뷰 ID:</label>
					<input type="text" value="${sessionScope.user.userId}" id="userId" name="userId" readonly><br>
					<label for="reviewContent">내용:</label>
					<input type="text" id="reviewContent" name="reviewContent" rows="4" required><br><br>
					<label for="reviewPwd">비밀번호:</label>
					<input type="password" id="reviewPwd" name="reviewPwd" required>
					<input type="text" value="${param.productId}" name="productId" hidden="">
					<button type="submit" id="writeBtn">리뷰 작성</button>
				</form>
			</div>
		</div>
	</div>
	<jsp:include page="./common/footer.jsp"></jsp:include>
</body>
</html>
