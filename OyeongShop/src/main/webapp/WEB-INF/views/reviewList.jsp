<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>OyeongShop</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<link href="resources/static/css/common.css" rel="stylesheet"
	type="text/css" />
<style>
#reviewList {
	margin: 0 auto;
}
table {
	margin-top: 2em;
	width: 90%;
	text-align: center;
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
	<!-- Right Content :: 리뷰 리스트 -->
		<div id="right">
			<div id="reviewList">
				<h2>Review</h2>
				<table border="1">
					<tr>
						<th>no</th>
						<th>content</th>
						<th>writer</th>
						<th>date</th>
						<th>show product</th>
						<th>modify / delete</th>
					</tr>
					
					<c:forEach var="review" items="${reviews}" varStatus="status">
						<tr>
							<td>${status.count}</td>
							<td>${review.content}</td>
							<td>${review.userId}</td>
							<td>${review.uploadDate}</td>
							<td><button type="button" onclick="location.href='/oyeongshop/product-detail?productNo=${review.productId}';">상품보러가기</button></td>
							<td><c:if
									test="${sessionScope.user.userId eq review.userId}">
									<button id="modifyBtn" class="my-btn" type="button"
										onclick="location.href = 'pwdCheck?reviewId=${review.reviewId}'">수정</button>
									<button id="deleteBtn" class="my-btn" type="button"
										onclick="location.href = 'pwdCheckDel?reviewId=${review.reviewId}'">삭제</button>
								</c:if></td>
						</tr>
					</c:forEach>
				</table>
			</div>
		</div>
	</div>
	<jsp:include page="./common/footer.jsp"></jsp:include>
</body>
</html>
