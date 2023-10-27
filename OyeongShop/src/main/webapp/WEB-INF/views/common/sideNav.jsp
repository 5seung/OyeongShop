<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>OyeongShop</title>
<link href="resources/static/css/sideNav.css" rel="stylesheet"
	type="text/css" />
<style type="text/css">
nav {
	padding-left: 1em;
}
</style>
<script>
	//사이드바 목록 리스트 토글 기능
	function sideList() {
		let positionList = document.querySelector(".Toggle");
		positionList.classList.toggle("active");
	}
</script>
</head>
<body>
	<nav>
		<div class="ToggleBtn" onclick="sideList();">
			Shop<i class="arrow fas fa-angle-right"></i>
		</div>
		<div class="Toggle" onclick="sideList();">
			<ul type="disc">
				<li><a class="list" href="/oyeongshop/product?category=All">All</a></li>
				<li><a class="list" href="/oyeongshop/product?category=Outer">Outer</a></li>
				<li><a class="list" href="/oyeongshop/product?category=Top">Top</a></li>
				<li><a class="list" href="/oyeongshop/product?category=Bottom">Bottom</a></li>
			</ul>
		</div>
		<div class="ToggleBtn">
			<a href="/oyeongshop/my-page">Mypage</a>
		</div>
		<div class="ToggleBtn">
			<a href="/oyeongshop/orderList.do">Order</a>
		</div>
		<div class="ToggleBtn">
			<a href="/oyeongshop/reviewList">Community</a>
		</div>
		<div class="ToggleBtn">
			<a href="#">Instagram</a>
		</div>
	</nav>
</body>
</html>
