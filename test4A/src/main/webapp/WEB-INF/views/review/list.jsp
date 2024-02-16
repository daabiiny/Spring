<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../header.jsp" %>

<style>
	table {
		width: 850px;
		padding: 0;
	}
	thead > tr > th {
		background-color: hotpink;
		padding: 10px;
		color: white;
	}
	thead>tr>th:nth-child(1) {
		width: 10%;
	}
	thead>tr>th:nth-child(2) {
		width: 60%;
	}
	thead>tr>th:nth-child(3) {
		width: 10%;
	}
	thead>tr>th:nth-child(4) {
		width: 20%;
	}
	
	tbody > tr > td {
		padding: 10px;
		text-align: center;
	}
	
</style>

<section>
	<table>
		<thead>
			<tr>
				<th>번호</th>
				<th>제목</th>
				<th>작성자</th>
				<th>작성일자</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="dto" items="${list }">
				<tr>
					<td>${dto.idx }</td>				
					<td><a href="${cpath }/review/view/${dto.idx}">${dto.title }</a></td>				
					<td>${dto.writer }</td>				
					<td><fmt:formatDate value="${dto.writeDate }" pattern="yyyy년 MM월 dd일"/></td>				
				</tr>
			</c:forEach>
		</tbody>
	</table>
</section>

</body>
</html>