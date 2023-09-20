<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<html>
<head>
<title>OyeongShop</title>
<style type="text/css">
#right{
	text-align: center;
}
</style>
</head>
<body>
	<jsp:include page="./common/header.jsp"></jsp:include>
	<div id="right">
		<h3>결제 완료</h3>
		<P>[주문일자] 2023-09-20</P>
		<P>[주문번호] 0192081</P>
		<P>김유저 고객님의 주문이 완료되었습니다.</P>
		<div>
			<button>주문내역 보기</button>
			<button type="button" onclick="location.href='http://localhost:8090/oyeongshop/';">메인으로</button>
		</div>
	</div>
	<jsp:include page="./common/footer.jsp"></jsp:include>
</body>
</html>
