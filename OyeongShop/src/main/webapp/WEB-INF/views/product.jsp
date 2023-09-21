<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
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
					<td>
						<div onclick="location.href='http://localhost:8090/oyeongshop/product-detail';">
							<img alt="" src="resources/static/img/sample1.png">
							<p>스퀘어 디테 팬츠(2c)</p>
							<p>₩49,400</p>
						</div>
					</td>
					<td><img alt="" src="resources/static/img/sample2.png">
						<p>워터 터틀 울 티(6c)</p>
						<p>₩49,400</p></td>
					<td><img alt="" src="resources/static/img/sample3.png">
						<p>숄더 리본 블라우스</p>
						<p>₩49,400</p></td>
				</tr>
			</table>
		</div>
	</div>
	<jsp:include page="./common/footer.jsp"></jsp:include>
</body>
</html>
