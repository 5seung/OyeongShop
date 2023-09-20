<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<html>
<head>
<title>OyeongShop</title>
<style type="text/css">
table {
	text-align: center;
}

img {
	width: 100%;
	object-fit: cover;
}
</style>
</head>
<body>
	<h2>Outer</h2>
	<table>
		<tr>
			<td><img alt="" src="resources/static/img/sample1.png">
				<p>스퀘어 디테 팬츠(2c)</p>
				<p>₩49,400</p></td>
			<td><img alt="" src="resources/static/img/sample2.png">
				<p>워터 터틀 울 티(6c)</p>
				<p>₩49,400</p></td>
			<td><img alt="" src="resources/static/img/sample3.png">
				<p>숄더 리본 블라우스</p>
				<p>₩49,400</p></td>
		</tr>
	</table>
	<jsp:include page="./common/footer.jsp"></jsp:include>
</body>
</html>
