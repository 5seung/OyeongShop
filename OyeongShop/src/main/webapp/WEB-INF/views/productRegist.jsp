<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%= JspFactory.getDefaultFactory().getEngineInfo().getSpecificationVersion() %>
<html>
<head>
<title>OyeongShop</title>
<style type="text/css">
#container {
	display: flex;
	justify-content: space-between;
	align-items: flex-start;
	padding: 20px;
}

#left {
	width: 25%;
}

#right {
	width: 100%;
	padding: 0 3em;
}

#product-regist-form {
	width: 35em;
	margin-left: 24%; 
}

.title {
	display: inline-block;
	width: 10em;
}

input {
	width: 15em;
}
select{
	width: 15em;
}
</style>
</head>
<body>
	<jsp:include page="./common/header.jsp"></jsp:include>
	<div id="container">
		<div id="left">
			<jsp:include page="./common/sideNav.jsp"></jsp:include>
		</div>
		<div id="right">
			<div id="product-regist-form">
				<h2>상품등록</h2>
				<form action="/oyeongshop/product-regist.do" method="post" enctype="multipart/form-data">
					<div>
						<span class="title">카테고리</span> <select name="category">
										<option value="Outer">Outer</option>
										<option value="Top">Top</option>
										<option value="Bottom">Bottom</option>
									</select>
					</div>
					<br />
					<div>
						<span class="title">상품 이름</span> <input type="text" name="name">
					</div>
					<br />
					<div>
						<span class="title">매입가</span> <input type="text" name="productionCost">
					</div>
					<br />
					<div>
						<span class="title">판매가</span> <input type="text" name="price">
					</div>
					<br />
					<div>
						<span class="title">상세내용</span> <input type="text" name="productContent">
					</div>
					<br />
					<div>
						<span class="title">색상</span> <input type="text">
					</div>
					<br />
					<div>
						<span class="title">사이즈</span> <input type="text">
					</div>
					<br />
					<div>
						<span class="title">재고</span> <input type="text">
					</div>
					<br />
					<div>
						<span class="title">상품 이미지(메인)</span> <input type="file" name="mainImgFile">
					</div>
					<br />
					<div>
						<span class="title">상품 이미지(상세)</span> <input type="file">
					</div>
					<br />
					<button type="submit">등록하기</button>
				</form>
			</div>
		</div>
	</div>
	<jsp:include page="./common/footer.jsp"></jsp:include>
</body>
</html>
