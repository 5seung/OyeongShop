<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <title>리뷰 작성 페이지</title>
    <style>
        body {
            margin: 0;
            padding: 0;
            font-family: Arial, sans-serif;
        }

        #header {
            background-color: #333;
            color: #fff;
            text-align: center;
            padding: 10px;
        }

        #container {
            display: flex;
            justify-content: space-between;
            align-items: flex-start;
            padding: 20px;
        }

        #left {
            flex: 1;
            background-color: #f0f0f0;
            padding: 10px;
        }

        #right {
            flex: 3;
            background-color: #fff;
            padding: 10px;
        }

        #bottom {
            background-color: #333;
            color: #fff;
            text-align: center;
            padding: 10px;
        }

        #reviewList {
            max-width: 100%;
            margin: 0 auto;
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
    <div id="header">
        <h1>웹 페이지</h1>
    </div>
    <div id="container">
        <div id="left">
            <!-- Left Content -->
            <!-- 여기에 좌측 컨텐츠를 추가하세요. -->
        </div>
        <div id="right">
            <!-- Right Content - 주문내역 폼 -->
			<div id="reviewList">
			    <h1>리뷰 작성 페이지</h1>
			    <form action="/oyeongshop/reviewWrite.do" method="GET">
			        <label for="reviewId">리뷰 ID:</label>
			        <input type="text" id="userId" name="userId" readonly>
			        
			        <label for="reviewContent">내용:</label>
			        <input type="text" id="reviewContent" name="reviewContent" rows="4" required></textarea>
			        
			        <button type="submit">리뷰 작성</button>
			    </form>
       	 	</div>
        </div>
    </div>
    <div id="bottom">
        <p>© 2023 웹 페이지</p>
    </div>
</body>
</html>
