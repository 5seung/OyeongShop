<%@page import="com.sesac.oyeongshop.dto.UserDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<% 
//세션 정보확인
System.out.println(session);
System.out.println(session.getAttribute("user"));
%>
<html>
<head>
<title>OyeongShop</title>
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link
	href="https://fonts.googleapis.com/css2?family=Caveat:wght@700&display=swap"
	rel="stylesheet">
<style type="text/css">
header {
	padding: 2em;
	font-family: 'Caveat', monospace ;

}

a {
	text-decoration-line: none;
	color: black;
}

#shopName {
	text-align: center;
	font-size: 3em;
}

#header-button {
	text-align: right;
}

.gradient-btn {
	display: inline-block;
	padding: 1em 2em;
	border-radius: 0;
	color: black;
	margin: 1em 0.5em;
	font-weight: bold;
	font-size: 0.678rem;
	letter-spacing: 2px;
	text-transform: uppercase;
	text-decoration: none;
	background: linear-gradient(to right, rgba(#b2876f, 0) 25%,
		rgba(#b2876f, .8) 75%);
	background-position: 1% 50%;
	background-size: 400% 300%;
	border: 1px solid black; @ include transition; &: hover { color :
	#947D78;
	background-position: 99% 50%;
}
}
</style>
</head>
<body>

	<header>
		<div id="shopName">
			<a href="http://localhost:8090/oyeongshop/">OyeongShop</a>
		</div>
		<div id="header-button">
			<c:choose>
				<c:when test="${user eq null}"> 
					<a class="gradient-btn" href="http://localhost:8090/oyeongshop/login">login</a>
		        </c:when>
		        <c:otherwise>
					<span>${user.name} 님 환영합니다.</span>
					<a class="gradient-btn"
						href="http://localhost:8090/oyeongshop/logout">logout</a>
					<c:choose>
						<c:when test="${user.authority eq '관리자'}">
							<a class="gradient-btn"
							href="http://localhost:8090/oyeongshop/product-regist">상품등록</a>
						</c:when>
						<c:otherwise>
							<a class="gradient-btn" href="#">cart</a>
						</c:otherwise>
					</c:choose>
		        </c:otherwise>
			</c:choose>
		</div>
	</header>
</body>
</html>
