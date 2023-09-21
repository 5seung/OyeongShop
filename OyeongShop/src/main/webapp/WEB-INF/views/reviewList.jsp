<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<title>리뷰</title>
<style>
body {
	margin: 0;
	padding: 0;
	font-family: Arial, sans-serif;
}

#container {
	display: flex;
	justify-content: space-between;
	align-items: flex-start;
	padding: 20px;
	min-height: 22em;
}

#left {
	width: 25%;
}

#right {
	width: 100%;
	padding: 0 3em;
}

#reviewList {
	margin-left: 25%;
}

#writebtn {
	color: black;
	border: none;
	padding: 10px;
	cursor: pointer;
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
			<!-- Right Content - 주문내역 폼 -->
			<div id="reviewList">
				<h3>Review</h3>
				<table border="1">
					<tr>
						<th>no</th>
						<th>content</th>
						<!-- <th>상품 이미지</th> -->
						<th>writer</th>
						<th>date</th>
						<th>modify/delete</th>
					</tr>
					<%
						// 여기에 데이터베이스에서 상품 정보를 가져오는 Java 코드를 작성합니다.
						// 이 코드는 데이터베이스 연결, 쿼리 실행 등을 수행해야 합니다.

						// 예시 데이터
						int[] num = { 1, 2, 3 };
						String[] content = { "니트가 예뻐요", "사이즈가 조금 커요.", "부드러워서 좋아요." };
						/* 		            String[] imageUrls = {"이미지1.jpg", "이미지2.jpg", "이미지3.jpg"};  */
						String[] writer = { "na567", "oh135", "kim1234" };
						String[] date = { "M", "S", "L" };
						String[] modifyDel = { "수정", "삭제", "수정" };

						for (int i = 0; i < num.length; i++) {
					%>
					<tr>
						<td><%=num[i]%></td>
						<td><%=content[i]%></td>
						<%-- <td><img src="<%= imageUrls[i] %>" alt="<%= productNames[i] %> 이미지" width="100"></td> --%>
						<td><%=writer[i]%></td>
						<td><%=date[i]%></td>
						<td><%=modifyDel[i]%></td>
						<!-- 이 자리에 수정/삭제 버튼 생겨야함! -->
					</tr>
					<%
						}
					%>

				</table>
				<button type="button"
					onclick="location.href = 'http://localhost:8090/oyeongshop/reviewWrite'">WRITE</button>
			</div>
		</div>
	</div>
	<jsp:include page="./common/footer.jsp"></jsp:include>
</body>
</html>
