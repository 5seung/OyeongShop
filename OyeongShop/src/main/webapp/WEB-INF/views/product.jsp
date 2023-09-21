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
	min-height: 22em; 
}
#left{
	width: 25%;
}
#right{
	width: 100%;
	padding: 0 3em;
}
table {
	text-align: center;
}
td{
	padding: 1em;
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
			<!-- Left Content -->
			<jsp:include page="./common/sideNav.jsp"></jsp:include>
		</div>
		<div id="right">
			<h2>Outer</h2>
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
