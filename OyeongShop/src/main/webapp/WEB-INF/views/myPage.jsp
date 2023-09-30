<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>OyeongShop</title>
<link href="resources/static/css/common.css" rel="stylesheet" type="text/css" />
<style>
#mypage {
	width: 30em;
	padding-left: 25%
}

#btnorderlist, #btnprofile {
	width: 50%;
	color: black;
	border: 0;
	padding: 10px;
	cursor: pointer;
}

h5 {
	margin-bottom: 50px;
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
			<!-- Right Content - MyPage 폼 -->
			<div id="mypage">
				<h2>MY PAGE</h2>
				<button type="button"
					onclick="location.href='http://localhost:8090/oyeongshop/order-list';"
					id="btnorderlist" name="orderlist">ORDER 주문내역 조회</button>
				<h5>고객님께서 주문하신 상품의 주문내역을 확인하실 수 있습니다.</h5>
				<!-- 이거 누르면 비밀번호 확인 창 뜨게! -->
				<button type="button" onclick="location.href='http://localhost:8090/oyeongshop/profile';" id="btnprofile"
					name="profile">PROFILE 회원 정보</button>
				<h5>
					회원이신 고객님의 개인정보를 관리하는 공간입니다.<br> 개인정보를 최신 정보로 유지하시면 보다 간편히 쇼핑을
					즐기실 수 있습니다.
				</h5>
			</div>
		</div>
	</div>
	<jsp:include page="./common/footer.jsp"></jsp:include>
</body>
</html>
