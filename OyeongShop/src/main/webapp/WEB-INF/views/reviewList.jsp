<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<title>리뷰</title>
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
	min-height: 22em;
}

#left {
	width: 25%;
}

#right {
	width: 100%;
	padding: 0 3em;
}

#reviewList {
	margin-left: 25%;
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
	<div id="container">
		<div id="right">
			<!-- Right Content - 주문내역 폼 -->
			<div id="reviewList">
				<h3>Review</h3>
				<table border="1">
					<tr>
						<th>no</th>
						<th>content</th>
						<th>writer</th>
						<th>date</th>
						<th>modify/delete</th>
					</tr>
					
				<c:forEach var="review" items="${reviews}" varStatus="status">

					<tr>
						<td>${status.count}</td>
						<td>${review.content}</td>
						<td>${review.userId}</td>
						<td>${review.uploadDate}</td>
						<td>
							<c:if test="${sessionScope.user.userId eq review.userId}">
								<button id="modifyBtn" type="button" onclick="location.href = 'pwdCheck?reviewId=${review.reviewId}'">수정</button>
								<button id="deleteBtn" type="button" onclick="location.href = 'pwdCheckDel?reviewId=${review.reviewId}'">삭제</button>
							</c:if>
						</td>
					</tr>
					</c:forEach>

				</table>
				<button type="button"
					onclick="location.href = 'reviewWrite'">WRITE</button>
			</div>
		</div>
	</div>
</body>
</html>
