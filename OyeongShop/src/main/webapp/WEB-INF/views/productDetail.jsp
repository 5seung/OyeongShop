<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
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
				<table>
					<tr>
						<td>
							<div id="product_img">
								<img alt="" src="resources/static/img/sample1.png">
							</div>
						</td>
						<td>
							<div id="product_describe">
								<h3>스퀘어 디테 팬츠(2c)</h3>
								<div>탄탄한 두께감으로 초겨울까지 착용할 수 있는 카고팬츠입니다. 전면의 큰 스퀘어 포켓과 카고 포켓,
									그리고 백 포켓까지 사각진 포켓 디테일들이 매력적으로 다가오는 제품입니다. 힙하지만 데일리하게 착용할 수 있는
									제품이며, 은은한 크림 색상과 진한 네이비 색상으로 깔끔하게 코디할 수 있는 코튼팬츠입니다. 기장이 긴편이라 밑단으로
									갈수록 살짝 좁아지는 스트레이트핏을 보여주며 여유있게 나온 허리와 힙 사이즈로 골반에 살짝 걸쳐 착용해주어도 멋스럽게
									코디할 수 있습니다.</div>
								<p><span>가격</span> ₩49,400</p>
								<div>
									<span>색상 </span> <select name="color">
										<option value="none">=== 선택 ===</option>
										<option value="#">크림</option>
										<option value="#">블랙</option>
									</select>
								</div>
								<div>
									<span>사이즈 </span> <select name="size">
										<option value="none">=== 선택 ===</option>
										<option value="#">s</option>
										<option value="#">L</option>
									</select>
								</div>
								<div>
									<span>수량</span> <span id='result'>0</span> <input
										type='button' onclick='count("plus")' value='+' /> <input
										type='button' onclick='count("minus")' value='-' />
								</div>
								<p>Total</p>
								<button type="submit" class="my-btn">Buy Now</button>
								<!-- 관리자 전용 버튼 -->
								<div>
									<button type="button" class="my-btn" onclick="location.href='http://localhost:8090/oyeongshop/#';">수정하기</button>
									<button type="button" class="my-btn" onclick="location.href='http://localhost:8090/oyeongshop/#';">삭제하기</button>
								</div>
								<p>review(0)</p>
							</div>
						</td>
					</tr>
				</table>
			</form>
		</div>
	</div>
	<jsp:include page="./common/footer.jsp"></jsp:include>
</body>
</html>
