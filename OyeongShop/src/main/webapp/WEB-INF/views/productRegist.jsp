<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<html>
<head>
<title>OyeongShop</title>
<style type="text/css">
#container {
	text-align: center;
}

.title {
	display: inline-block;
	width: 10em;
}

input {
	width: 15em;
}
</style>
</head>
<body>
<jsp:include page="./common/header.jsp"></jsp:include>
	<div id="container">
		<h3>상품등록</h3>
		<form action="">
			<div>
				<span class="title">카테고리</span> <input type="text"><br />
			</div>
			<br />
			<div>
				<span class="title">상품 이름</span> <input type="text">
			</div>
			<br />
			<div>
				<span class="title">색상</span> <input type="text">
			</div>
			<br />
			<div>
				<span class="title">사이즈</span> <input type="text">
			</div>
			<br />
			<div>
				<span class="title">가격</span> <input type="text">
			</div>
			<br />
			<div>
				<span class="title">상세내용</span> <input type="text">
			</div>
			<br />
			<div>
				<span class="title">재고</span> <input type="text">
			</div>
			<br />
			<div>
				<span class="title">상품 이미지(메인)</span> <input type="file">
			</div>
			<br />
			<div>
				<span class="title">상품 이미지(상세)</span> <input type="file">
			</div>
			<br />
			<button type="button">등록하기</button>
		</form>
	</div>
	<jsp:include page="./common/footer.jsp"></jsp:include>
</body>
</html>
