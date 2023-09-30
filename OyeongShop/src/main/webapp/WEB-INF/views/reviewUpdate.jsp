<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>리뷰 수정 페이지</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
	<link href="resources/static/css/common.css" rel="stylesheet" type="text/css" />
<style>
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

#modifybtn {
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
		<div id="left">
			<!-- Left Content -->
			<jsp:include page="./common/sideNav.jsp"></jsp:include>
		</div>
		<div id="right">
			<!-- Right :: 리뷰작성 폼 -->
			<div id="reviewList">
 				<form action="/oyeongshop/reviewUpdate.do" method="GET" id="reviewUpdateform">
					<h3>리뷰 수정 페이지</h3>
					<input type="hidden" name="reviewId" value="${reviewId}">
					<label for="userId">리뷰 ID:</label>
					<input type="text" value="${sessionScope.user.userId}" id="userId" name="userId" readonly><br>
					<label for="reviewContent">내용:</label>
					<input type="text" value="${review.content}" id="reviewContent" name="content" rows="4" required><br><br>			
					<input type="submit" id="modifybtn" value="수정하기">
 				</form>
			</div>
		</div>
	</div>
	<jsp:include page="./common/footer.jsp"></jsp:include>
</body>
</html>
