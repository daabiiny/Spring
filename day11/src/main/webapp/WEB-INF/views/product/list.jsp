<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../header.jsp" %>

<style>
	table {
		border-collapse: collapse;
		width: 800px;
		margin: 20px auto;
	}
	
	td, th {
		padding: 10px;
	}
	
	thead>tr {
		background-color: silver;
	}
	
	tbody>tr {
		border-bottom: 1px solid grey;
	}
	
	tbody>tr:hover {
		background-color: #eee;
	}
	
	thead>tr>th:nth-child(1) {
		width: 10%;
	}
	
	thead>tr>th:nth-child(2) {
		width: 50%;
	}
	
	thead>tr>th:nth-child(3) {
		width: 10%;
	}
	
	thead>tr>th:nth-child(4) {
		width: 15%;
	}
	
	tbody>tr>td {
		text-align: center;
	}
	
	tbody>tr>td:nth-child(2) {
		text-align: left;
	}
</style>

<section>
	<table border="1" cellspacing="0" cellpadding="10">
		<thead>
		<tr>
			<th>번호</th>
			<th>상품명</th>
			<th>상품가격</th>
			<th>상품수량</th>
		</tr>
		</thead>
		<tbody>
		<c:forEach var="dto" items="${list }">
			<tr>
				<td>${dto.idx }</td>
				<td>
					<a href="${cpath }/product/view/${dto.idx}">${dto.productName }</a>
				</td>
				<td>${dto.price }원</td>
				<td>${dto.amount }개</td>
			</tr>
		</c:forEach>
		</tbody>
	</table>
	<div style="display: flex; justify-content: space-between; margin: 50px;">
		<div></div>
		<div><a href="${cpath }/product/add"><button>상품추가</button></a></div>
	</div>
</section>


</body>
</html>