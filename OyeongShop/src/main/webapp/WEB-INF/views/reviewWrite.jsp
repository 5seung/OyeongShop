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

#reviewList {
	max-width: 100%;
	margin: 0 auto;
}

#writebtn {
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
			<!-- Right :: 리뷰작성 폼 -->
			<div id="reviewList">
				<h3>리뷰 작성 페이지</h3>
				<form action="/oyeongshop/reviewWrite.do" method="GET">
					<label for="userId">리뷰 ID:</label>
					<input type="text" id="userId" name="userId" readonly>
					<label for="reviewContent">내용:</label>
					<input type="text" id="reviewContent" name="reviewContent" rows="4" required>
					<button type="submit">리뷰 작성</button>
				</form>
			</div>
		</div>
	</div>
	<jsp:include page="./common/footer.jsp"></jsp:include>
</body>
</html>
