<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<html>
<head>
<title>OyeongShop</title>
<link href="resources/static/css/common.css" rel="stylesheet" type="text/css" />
<style>
#orderlist {
	max-width: 90%;
	text-align: center;
}
#order-success{
	min-height: 16em;;
	text-align: center;
}
input[type=text] {
	margin: 1em 0;
	border: 0;
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
			<form id="orderlist" action="/oyeongshop/orderList.do" method="GET">
				<div id="order-success">
					<h2>결제 완료</h2>
					<P>[주문일자] <input type="text" name="orderDate" value="${order.orderDate}" readonly></P>
					<P>[주문번호] <input type="text" name="orderId" value="${order.orderId}" readonly></P>
					<P><input type="text" name="userId" value="${order.userId}" readonly="readonly"> 고객님의 주문이 완료되었습니다.</P>
					
				</div>
					<div>
						<button type="submit" class="my-btn">주문내역 보기</button>
						<button type="button" onclick="location.href='/oyeongshop/';" class="my-btn">메인으로</button>
					</div>
			</form>
		</div>
	</div>
	<jsp:include page="./common/footer.jsp"></jsp:include>
</body>
</html>
