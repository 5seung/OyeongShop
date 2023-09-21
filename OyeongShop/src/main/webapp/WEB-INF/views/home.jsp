<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
<title>OyeongShop</title>
<style type="text/css">
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
#title {
	text-align: center;
	margin-top: 10em;
}

table {
	text-align: center;
}

img {
	width: 100%;
	object-fit: cover;
}
</style>
</head>
<body>
	<jsp:include page="./common/header.jsp"></jsp:include>
	<div id="container">
		<div id="left">
			<jsp:include page="./common/sideNav.jsp"></jsp:include>
		</div>
		<div id="right">
			<table>
				<tr>
					<td>
						<div id="main_img1">
							<img alt="" src="resources/static/img/main1.png">
						</div>
					</td>
					<td>
						<div id="main_img2">
							<img alt="" src="resources/static/img/main2.png">
						</div>
					</td>
				</tr>
			</table>
			<h3 id="title">New Arrivals</h3>
			<table>
				<tr>
					<c:forEach items="${products}" var="product">
						<td>
							<div onclick="location.href='http://localhost:8090/oyeongshop/product-detail';">
								<img alt="" src="resources/static/img/sample1.png">
								<p><c:out value="${product.name}"></c:out></p>
								<p>₩ <fmt:formatNumber value="${product.price}"/> </p>
							</div>
						</td>
					</c:forEach>
				</tr>
			</table>
		</div>
	</div>
	<jsp:include page="./common/footer.jsp"></jsp:include>
</body>
</html>
