<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<html>
<head>
<title>OyeongShop</title>
<style type="text/css">
footer{
	margin-top: 3em;
	padding: 2em 3em 5em 3em;
	background-color: rgb(250,250,250);
}
#shop-info-link{
	text-align: right;
	margin-bottom: 2em;
}
#shop-info{
 	display: flex;
	justify-content: space-between;
}
</style>
</head>
<body>
	<footer>
		<div id="shop-info-link">
			<a href="#">About Us</a> | 
			<a href="#">Agreement</a> | 
			<a href="#">Privacy Policy</a> | 
			<a href="#">Shop Guide</a>
		</div>
		<div id="shop-info">
			<div>
				Opening Hours. Monday to Friday 10am ~ 5pm.Weekends and Holidays Day off <br/> 
				Bank Info. 우리은행 1002-9108-70004 Account Holder 오영샵
			</div>
			<div>
				Company : 오영샵     Ceo : 김오영    Tel : 0708131578	E-mail : oyeong0920@sesac.com<br/>  
				Address : 07282 서울특별시 영등포구 선유로9길 30    Privacy Manager : 김오영<br/>
				copyright © 2023 오영샵. All rights reserved. <br/>
			</div>
		</div>

	</footer>
</body>
</html>
