<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
<title>OyeongShop</title>
<link href="resources/static/css/common.css" rel="stylesheet" type="text/css" />
<style>
#orderlist {
	max-width: 100%;
	min-height: 18em;
}
td{
	text-align: center;
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
			<!-- Right Content - 주문내역 폼 -->
			<div id="orderlist">
				<h2>주문 내역</h2>
				<table border="1">
					<tr>
						<th>주문번호</th>
						<th>받는 사람</th>
						<!--<th>상품 이미지</th> -->
						<th>우편번호</th>
						<th>주소</th>
						<th>상세주소</th>
						<th>연락처</th>
						<th>주문처리상태</th>
						<th>주문일자</th>
						<th>주문수량</th>
						<th>색상</th>
						<th>사이즈</th>
						<th>주문 가격(원)</th>
					</tr>
					
					<c:forEach var="order" items="${myorders}" varStatus="status">
						<tr>
							<td>${order.orderId}</td>
							<td>${order.receiveName}</td>
							<td>${order.zonecode}</td>
							<td>${order.address} ${order.addressDetail}</td>
							<td>${order.addressExtra}</td>
							<td>${order.receivePhone}</td>
							<td>${order.orderState}</td>
							<td><fmt:formatDate value="${order.orderDate}" dateStyle="short"/></td>
							<td>${order.orderdetail.orderQuantity}</td>
							<td>${order.orderdetail.orderColor}</td>
							<td>${order.orderdetail.orderSize}</td>
							<td>${order.orderdetail.price}</td>
						</tr>
					</c:forEach>
				</table>
			</div>
		</div>
	</div>
	<jsp:include page="./common/footer.jsp"></jsp:include>
</body>
</html>
