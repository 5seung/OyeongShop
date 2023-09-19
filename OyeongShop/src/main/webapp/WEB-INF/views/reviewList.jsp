<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <title>리뷰</title>
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
		    <h3>Review</h3>
		    <table border="1">
		        <tr>
		        	<th>no</th>
		     	    <th>content</th>
<!-- 		        <th>상품 이미지</th> -->
		            <th>writer</th>
		            <th>date</th>
		            <th>modify/delete</th>
		        </tr>
		        <%
		            // 여기에 데이터베이스에서 상품 정보를 가져오는 Java 코드를 작성합니다.
		            // 이 코드는 데이터베이스 연결, 쿼리 실행 등을 수행해야 합니다.
		            
		            // 예시 데이터
		            int[] num = {1, 2, 3};
		            String[] content = {"니트가 예뻐요", "사이즈가 조금 커요.", "부드러워서 좋아요."};
/* 		            String[] imageUrls = {"이미지1.jpg", "이미지2.jpg", "이미지3.jpg"};  */
		            String[] writer = {"na567", "oh135", "kim1234"};
		            String[] date = {"M", "S", "L"};
		            String[] modifyDel = {"수정", "삭제", "수정"};
		
		            for (int i = 0; i < num.length; i++) {
		        %>
		        <tr>
		     	    <td><%= num[i] %></td>
		        	<td><%= content[i] %></td>
		            <%-- <td><img src="<%= imageUrls[i] %>" alt="<%= productNames[i] %> 이미지" width="100"></td> --%>
		            <td><%= writer[i] %></td>
		            <td><%= date[i] %></td>
		            <td><%= modifyDel[i] %></td>	<!-- 이 자리에 수정/삭제 버튼 생겨야함! -->
		        </tr>
		        <%
		            }
		        %>
		        
		    </table>
			    <div class="container mt-5">
		   		<button id="writebtn" type="button" data-toggle="modal" data-target="#myModal">write</button>
			<!-- 모달 창 -->
			        <div class="modal" id="myModal">
			            <div class="modal-dialog">
			                <div class="modal-content">
			                    <!-- 모달 헤더 -->
			                    <div class="modal-header">
			                        <h4 class="modal-title">리뷰 작성하기</h4>
			                        <button type="button" class="close" data-dismiss="modal">&times;</button>
			                    </div>
			
			                    <!-- 모달 본문 -->
			                    <div class="modal-body">
			                        <!-- 아이디 출력 폼 -->
			                        <div class="form-group">
			                            <label for="userId">아이디:</label>
			                            <input type="text" class="form-control" id="userId" readonly>
			                        </div>
			
			                        <!-- 내용 입력 폼 -->
			                        <div class="form-group">			<!-- db에 들어간 내용 가져와야함 -->
			                            <label for="content">내용:</label>
			                            <textarea class="form-control" id="content"></textarea>
			                        </div>
			                    </div>
			
			                    <!-- 모달 푸터 -->
			                    <div class="modal-footer">
			                        <!-- 저장 버튼 -->
			                        <button type="button" class="btn btn-primary" data-dismiss="modal" onclick="saveData()">작성하기</button>
			                    </div>
			                </div>
			            </div>
			        </div>
				</div> <!-- 모달창 <div class="container mt-5"> 닫는거 -->
			    <!-- Bootstrap JS 및 jQuery 스크립트를 사용하기 위한 링크 -->
			    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
			    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
			    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
			
			    <script>
			        // 모달에서 입력한 데이터 저장하는 함수
			        function saveData() {
			            var userId = document.getElementById("userId").value;
			            var content = document.getElementById("content").value;
			
			            // 여기에서 데이터 처리 또는 저장 로직을 추가할 수 있습니다.
			            // 예를 들어, AJAX 요청을 통해 서버로 데이터를 전송하는 등의 작업을 수행할 수 있습니다.
			            
			            // 모달 닫기
			            $("#myModal").modal("hide");
			        }
			    </script>
       	 	</div>
        </div>
    </div>
    <div id="bottom">
        <p>© 2023 웹 페이지</p>
    </div>
</body>
</html>
