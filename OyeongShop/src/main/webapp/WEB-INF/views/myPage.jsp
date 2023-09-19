<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>마이 페이지</title>
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

        #mypage {
            max-width: 700px;
            margin: 0 auto;
        }

        #btnorderlist, #btnprofile {
        	width: 50%;
            color: black;
            border: 0;
            padding:10px;
            cursor: pointer;
        }

        h5 {
        	margin-bottom: 50px;
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
            <!-- Right Content - MyPage 폼 -->
            <div id="mypage">
	            <h2>MY PAGE</h2>
	            <button type="button" onclick="location.href='';" id="btnorderlist" name="orderlist">ORDER 주문내역 조회</button>
				<h5>고객님께서 주문하신 상품의 주문내역을 확인하실 수 있습니다.</h5>
				<!-- 이거 누르면 비밀번호 확인 창 뜨게! -->
				<button type="button" onclick="location.href='';" id="btnprofile" name="profile">PROFILE 회원 정보</button>
				<h5>회원이신 고객님의 개인정보를 관리하는 공간입니다.<br>
				개인정보를 최신 정보로 유지하시면 보다 간편히 쇼핑을 즐기실 수 있습니다.</h5>
            </div>
        </div>
    </div>
    <div id="bottom">
        <p>© 2023 웹 페이지</p>
    </div>
</body>
</html>