<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%=JspFactory.getDefaultFactory().getEngineInfo().getSpecificationVersion()%>
<html>
<head>
<title>OyeongShop</title>
<link href="resources/static/css/common.css" rel="stylesheet" type="text/css" />
<link href="resources/static/css/productRegist.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="resources/static/js/productRegist.js"></script>
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
				<form action="/oyeongshop/product-regist.do" method="post"
					enctype="multipart/form-data">
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
						<span class="title">매입가</span> <input type="text"
							name="productionCost">
					</div>
					<br />
					<div>
						<span class="title">판매가</span> <input type="text" name="price">
					</div>
					<br />
					<div>
						<span class="title">상세내용</span> <input type="text"
							name="productContent">
					</div>
					<br />
					<fieldset>
						<div>
							<span class="title">색상</span> <input type="text" name="color">
						</div>
						<br />
						<div>
							<span class="title">사이즈</span> <select name="sizeOption">
								<option value="free">free</option>
								<option value="small">S</option>
								<option value="medium">M</option>
								<option value="large">L</option>
							</select>
						</div>
						<br />
						<div>
							<span class="title">재고</span> <input type="text" name="stock">
						</div>
					</fieldset>
					<div>
						<span class="title">상품 이미지(메인)</span> <input type="file"  accept="image/*"
							name="mainImgFile" onchange="setThumbnail(event);">
						<div id="image_container"></div>

					</div>
					<br />
					<div>
						<span class="title">상품 이미지(상세)</span> <input type="file"  accept="image/*"
							name="subImgFile" onchange="setThumbnail2(event);" multiple/>
							
						<div id="image_container2"></div>
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
