<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>마이페이지-주문내역</title>
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

        #orderlist {
            max-width: 100%;
            margin: 0 auto;
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
			<div id="orderlist">
		    <h1>주문 내역</h1>
		    <table border="1">
		        <tr>
		        	<th>주문일자</th>
		     	    <th>주문번호</th>
<!-- 		        <th>상품 이미지</th> -->
		            <th>상품명</th>
		            <th>가격</th>
		            <th>색상</th>
		            <th>사이즈</th>
		            <th>수량</th>
		            <th>주문처리상태</th>
		        </tr>
		        <%
		            // 여기에 데이터베이스에서 상품 정보를 가져오는 Java 코드를 작성합니다.
		            // 이 코드는 데이터베이스 연결, 쿼리 실행 등을 수행해야 합니다.
		            
		            // 예시 데이터
		            String[] orderDate = {"2023-09-17", "2023-09-18", "2023-09-19"};
		            int[] orderNum = {1, 2, 3};
		            String[] productNames = {"ㅇㅇ니트", "ㅇㅇ팬츠", "ㅇㅇ가디건"};
		           /*  String[] imageUrls = {"이미지1.jpg", "이미지2.jpg", "이미지3.jpg"}; */
		            int[] prices = {10000, 20000, 30000};
		            String[] color = {"skyblue", "ivory", "gray"};
		            String[] size = {"M", "S", "L"};
		            String[] orderQuantity = {"1", "2", "1"};
		            String[] orderState = {"결제완료", "결제완료", "결제완료"};
		
		            for (int i = 0; i < orderNum.length; i++) {
		        %>
		        <tr>
		     	    <td><%= orderDate[i] %></td>
		        	<td><%= orderNum[i] %></td>
		        	<td><%= productNames[i] %></td>
		            <%-- <td><img src="<%= imageUrls[i] %>" alt="<%= productNames[i] %> 이미지" width="100"></td> --%>
		            <td><%= prices[i] %></td>
		            <td><%= color[i] %></td>
		            <td><%= size[i] %></td>
		            <td><%= orderQuantity[i] %></td>
		            <td><%= orderState[i] %></td>
		        </tr>
		        <%
		            }
		        %>
		    </table>
       	 	</div>
        </div>
    </div>
    <div id="bottom">
        <p>© 2023 웹 페이지</p>
    </div>
</body>
</html>
