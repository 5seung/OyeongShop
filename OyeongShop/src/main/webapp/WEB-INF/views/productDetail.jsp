<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<html>
<head>
<title>OyeongShop</title>
<link href="resources/static/css/common.css" rel="stylesheet" type="text/css" />
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
div{
	padding: 0.5em 0;
}
#product_img {
	width: 28em;
	height: 32em;
	padding-right: 2em;
}

img {
	width: 100%;
	object-fit: cover;
}
.sub_img{
	width: 40em;
	padding: 1em;
}
.sub_img_cover{
	text-align: center;
}

#product_describe {
	padding: 1em;
	max-width: 30em;
}
.sub_title{
display:inline-block;
	width: 5em;
}
.my-btn {
	width: 45%;
	color: black;
	border: none;
	padding: 10px;
	cursor: pointer;
}
#review_table{
	width: 100%;
	text-align: center;
	margin-bottom: 2em;
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
			<input type="hidden" value="${product.mainImg}" name="mainImg">
			<input type="hidden" value="${product.name}" name="productName">
			<input type="hidden" value="${product.productId}" name="productId">
			<input type="hidden" value="${product.price}" name="price">
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
								<p><span class="sub_title">가격</span> ₩ <fmt:formatNumber value="${product.price}"/> </p>
								<div>
									<span class="sub_title">색상 </span> <select name="color">
										<option value="none">=== 선택 ===</option>
										<c:forEach var="detail" items="${product.detail}">
										<option value="${detail.color}">${detail.color}</option>
										</c:forEach>
									</select>
								</div>
								<div>
									<span class="sub_title">사이즈 </span> <select name="size">
										<option value="none">=== 선택 ===</option>
										<c:choose>
											<c:when test="${product.detail[0].sizeOption eq 'free'}">
											<option value="free">free</option>
											</c:when>
											<c:otherwise>
												<c:forEach var="detail" items="${product.detail}">
												<option value="${detail.sizeOption}">${detail.sizeOption}</option>
												</c:forEach>
											</c:otherwise>
										</c:choose>
									</select>
								</div>
								<div>
									<span class="sub_title">수량</span> <input name="quantity" id='result' value="1" readonly> <input
										type='button' onclick='count("plus")' value='+' /> <input
										type='button' onclick='count("minus")' value='-' />
								</div>
								<p>Total</p>
								<c:choose>
									<c:when test="${user.authority eq '관리자'}">
										<!-- 관리자 전용 버튼 -->
										<div>
											<button type="button" class="my-btn" onclick="location.href='/oyeongshop/product-regist';">수정하기</button>
											<button type="button" class="my-btn" onclick="location.href='/oyeongshop/product-delete.do?productNo=${product.productId}';">삭제하기</button>
										</div>
									</c:when>
									<c:otherwise>
										<button type="submit" class="my-btn">Buy Now</button>
									</c:otherwise>
								</c:choose>
								<p>review(<c:out value="${fn:length(reviews)}"></c:out>)</p>
							</div>
						</td>
					</tr>
					<c:if test="${not empty product.subImgs}">
					<tr>
						<td colspan="2">
						<br/><br/><br/>
						 	<h3>상세 이미지</h3>
						</td>
					</tr>
					</c:if>
					<c:forEach var="subImg" items="${product.subImgs}">
					<tr>
						<td colspan="2">
						<div class="sub_img_cover">
							<img alt="이미지를 불러올 수 없습니다." src="upload/${subImg.storedFileName}" class="sub_img">
						</div>
						</td>
					</tr>
					</c:forEach>
				</table>
			</form>
			<!-- 리뷰리스트 -->
			<br/><br/><br/>			
			<div id="reviewList">
				<h3>Review</h3>
				<table id="review_table">
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
						<c:choose>
							<c:when test="${sessionScope.user.userId eq review.userId}">
								<button id="modifyBtn" type="button" onclick="location.href = 'pwdCheck?reviewId=${review.reviewId}'">수정</button>
								<button id="deleteBtn" type="button" onclick="location.href = 'pwdCheckDel?reviewId=${review.reviewId}'">삭제</button>
							</c:when>
							<c:otherwise>
								<p>권한이 없습니다.</p>
							</c:otherwise>
						</c:choose>
						</td>
					</tr>
					</c:forEach>

				</table>
				<c:if test="${writeCheck}">
					<button type="button" class="my-btn"
						onclick="location.href = 'reviewWrite?productId=${product.productId}'">WRITE</button>
				</c:if>
			</div>
		</div>
	</div>
	<jsp:include page="./common/footer.jsp"></jsp:include>
</body>
</html>
