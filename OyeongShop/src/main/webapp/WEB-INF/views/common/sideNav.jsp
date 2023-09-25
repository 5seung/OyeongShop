<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>OyeongShop</title>
<style type="text/css">
nav {
	padding-left: 1em;
}
</style>
<script type="text/javascript">
$(function () {
    // 왼쪽메뉴 드롭다운
    $(".sub_menu ul.small_menu").hide();
    $(".sub_menu ul.big_menu").click(function () {
        $("ul", this).slideToggle(300);
    });
});
</script>
</head>
<body>
	<nav>
		<ul class="big_menu">
			<li>Shop<i class="arrow fas fa-angle-right"></i></li>
			<ul class="small_menu">
				<li><a href="http://localhost:8090/oyeongshop/product?category=All">All</a></li>
				<li><a href="http://localhost:8090/oyeongshop/product?category=Outer">Outer</a></li>
				<li><a href="http://localhost:8090/oyeongshop/product?category=Top">Top</a></li>
				<li><a href="http://localhost:8090/oyeongshop/product?category=Bottom">Bottom</a></li>
			</ul>
		</ul>
		<ul>
			<li><a href="http://localhost:8090/oyeongshop/my-page">Mypage</a></li>
			<li><a href="#">Order</a></li>
			<li><a href="#">Community</a></li>
			<li><a href="#">Instagram</a></li>
		</ul>
	</nav>
</body>
</html>
