<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
<title>OyeongShop</title>
<link href="resources/static/css/common.css" rel="stylesheet" type="text/css" />
<style type="text/css">
table {
	text-align: center;
}
td{
	padding: 1em;
}
#product_img {
	width: 24em;
	height: 30em;
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
			<h2><c:out value="${category}"></c:out></h2>
			<table>
			<c:forEach var="idx" begin="0" end="9" step="3">
				<tr>
					<c:forEach items="${products}" var="product" begin="${idx}" end="${idx+2}">
						<td>
							<div onclick="location.href='http://localhost:8090/oyeongshop/product-detail?productNo=${product.productId}';">
								<div id="img_cover">
									<img id="product_img" alt="" src="upload/${product.mainImg}">
								</div>
								<p><c:out value="${product.name}"></c:out></p>
								<p>₩ <fmt:formatNumber value="${product.price}"/> </p>
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
