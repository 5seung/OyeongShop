<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
<title>OyeongShop</title>
<link href="resources/static/css/common.css" rel="stylesheet" type="text/css" />
<style type="text/css">
#title {
	text-align: center;
	margin-top: 6em;
}

table {
	text-align: center;
}
td{
	padding-bottom: 3em;
}
img {
	width: 100%;
	object-fit: cover;
}
#product_img {
	width: 22em;
	height: 28em;
	padding: 1em
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
			<c:forEach var="idx" begin="0" end="9" step="3">
				<tr>
					<c:forEach items="${products}" var="product" begin="${idx}" end="${idx+2}">
						<td>
							<div id="" onclick="location.href='http://localhost:8090/oyeongshop/product-detail?productNo=${product.productId}';">
								<img id="product_img" alt="" src="upload/${product.mainImg}">
								<p><c:out value="${product.name}"></c:out></p>
								<p>₩ <fmt:formatNumber value="${product.price}"/></p>
								
							</div>
						</td>
					</c:forEach>
				</tr>
			</c:forEach>
			</table>
		</div>
	</div>
	<jsp:include page="./common/footer.jsp"></jsp:include>
</body>
</html>
