<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<html>
<head>
<title>OyeongShop</title>
<style type="text/css">
#title {
	text-align: center;
	margin-top: 10em;
}

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
	<table>
		<tr>
			<td>
				<div id="main_img1">
					<img alt="" src="resources/static/img/main1.png">
				</div>
			</td>
			<td>
				<div id="main_img2">
					<img alt="" src="resources/static/img/main2.png">
				</div>
			</td>
		</tr>
	</table>
	<h3 id="title">New Arrivals</h3>
	<table>
		<tr>
			<td>
				<div>
					<img alt="" src="resources/static/img/sample1.png">
				</div>
				<p>스퀘어 디테 팬츠(2c)</p>
				<p>₩49,400</p>
			</td>
			<td>
				<div>
					<img alt="" src="resources/static/img/sample2.png">
				</div>
				<p>워터 터틀 울 티(6c)</p>
				<p>₩49,400</p>
			</td>
			<td>
				<div>
					<img alt="" src="resources/static/img/sample3.png">
				</div>
				<p>숄더 리본 블라우스</p>
				<p>₩49,400</p>
			</td>
		</tr>
	</table>
</body>
</html>
