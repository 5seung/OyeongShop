<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
<title>OyeongShop</title>
<script type="text/javascript">
	function count(type) {
		// 결과를 표시할 element
		const resultElement = document.getElementById('result');

		// 현재 화면에 표시된 값
		let number = resultElement.innerText;

		// 더하기/빼기
		if (type === 'plus') {
			number = parseInt(number) + 1;
		} else if (type === 'minus') {
			number = parseInt(number) - 1;
		}

		// 결과 출력
		resultElement.innerText = number;
	}
</script>
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
div{
	padding: 0.5em 0;
}
#product_img {
	width: 28em;
	padding-right: 2em;
}

img {
	width: 100%;
	object-fit: cover;
}

#product_describe {
	padding: 1em;
	max-width: 30em;
}
.my-btn {
	width: 49%;
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
			<form action="/oyeongshop/order">
			<input type="hidden" value="${sessionScope.user.userId}" name="userId">
				<table>
					<tr>
						<td>
							<div id="product_img">
								<img alt="" src="upload/${product.mainImg}">
							</div>
						</td>
						<td>
							<div id="product_describe">
								<h3><c:out value="${product.name}"></c:out></h3>
								<div><c:out value="${product.productContent}"></c:out></div>
								<p><span>가격 ₩ </span><fmt:formatNumber value="${product.price}"/> </p>
								<div>
									<span>색상 </span> <select name="color">
										<option value="none">=== 선택 ===</option>
										<option value="cream">크림</option>
										<option value="black">블랙</option>
									</select>
								</div>
								<div>
									<span>사이즈 </span> <select name="size">
										<option value="none">=== 선택 ===</option>
										<option value="small">s</option>
										<option value="large">L</option>
									</select>
								</div>
								<div>
									<span>수량</span> <input name="quantity" id='result' value="1" readonly> <input
										type='button' onclick='count("plus")' value='+' /> <input
										type='button' onclick='count("minus")' value='-' />
								</div>
								<p>Total</p>
								<c:choose>
									<c:when test="${user.authority eq '관리자'}">
										<!-- 관리자 전용 버튼 -->
										<div>
											<button type="button" class="my-btn" onclick="location.href='http://localhost:8090/oyeongshop/product-regist';">수정하기</button>
											<button type="button" class="my-btn" onclick="location.href='http://localhost:8090/oyeongshop/product-delete.do?productNo=${product.productId}';">삭제하기</button>
										</div>
									</c:when>
									<c:otherwise>
										<button type="submit" class="my-btn">Buy Now</button>
									</c:otherwise>
								</c:choose>
								<p>review(0)</p>
							</div>
						</td>
					</tr>
				</table>
			</form>
			<!-- 리뷰리스트 -->
			<div id="reviewList">
				<h3>Review</h3>
				<table border="1">
					<tr>
						<th>no</th>
						<th>content</th>
						<th>writer</th>
						<th>date</th>
						<th>modify/delete</th>
					</tr>
					
					<c:forEach var="review" items="${reviews}" varStatus="status">
					<tr>
						<td>${status.count}</td>
						<td>${review.content}</td>
						<td>${review.userId}</td>
						<td>${review.uploadDate}</td>
						<td>
							<c:if test="${sessionScope.user.userId eq review.userId}">
								<button id="modifyBtn" type="button" onclick="location.href = 'pwdCheck?reviewId=${review.reviewId}'">수정</button>
								<button id="deleteBtn" type="button" onclick="location.href = 'pwdCheckDel?reviewId=${review.reviewId}'">삭제</button>
							</c:if>
						</td>
					</tr>
					</c:forEach>

				</table>
				<button type="button"
					onclick="location.href = 'reviewWrite?productId=${product.productId}'">WRITE</button>
			</div>
		</div>
	</div>
	<jsp:include page="./common/footer.jsp"></jsp:include>
</body>
</html>
