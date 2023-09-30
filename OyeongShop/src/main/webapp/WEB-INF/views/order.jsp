<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<html>
<head>
<title>OyeongShop</title>
<link href="resources/static/css/common.css" rel="stylesheet" type="text/css" />
</head>
<body>
	<jsp:include page="./common/header.jsp"></jsp:include>
	<div id="container">
		<div id="left">
			<!-- Left Content -->
			<jsp:include page="./common/sideNav.jsp"></jsp:include>
		</div>
		<div id="right">
			<!-- right :: 주문페이지 -->
			<h2>Order</h2>
			<form action="/oyeongshop/order-success">
				<h3>[주문정보]</h3>
				<table>
					<tr>
						<td>이미지</td>
						<td>상품명</td>
						<td>판매가</td>
						<td>수량</td>
						<td>옵션(색상/사이즈)</td>
						<td>합계</td>
					</tr>
					<tr>
						<td><img alt="이미지" src=""></td>
						<td>스퀘어 디테 팬츠(2c)</td>
						<td>₩49,400</td>
						<td>1</td>
						<td>베이지/s</td>
						<td>₩49,400</td>
					</tr>
				</table>
				<h3>[배송정보]</</h3>
				<table>
					<tr>
						<td>배송지 선택</td>
						<td></td>
					
					</tr>
					<tr>
						<td>받으시는 분</td>
						<td></td>
						
					</tr>
					<tr>
						<td>주소</td>
						<td></td>
						
					</tr>
					<tr>
						<td>휴대전화</td>
						<td></td>
						
					</tr>
					<tr>
						<td>이메일</td>
						<td></td>
						
					</tr>
					<tr>
						<td>배송메세지</td>
						<td></td>
						
					</tr>
				</table>
			<button type="submit" class="my-btn">결제하기</button>
			</form>
		</div>
	</div>
	<jsp:include page="./common/footer.jsp"></jsp:include>
</body>
</html>
