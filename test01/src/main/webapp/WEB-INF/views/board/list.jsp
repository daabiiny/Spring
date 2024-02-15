<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../header.jsp" %>

<style>
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

</style>

<section>

<h3>게시판 목록</h3>
	<table border="1" cellpadding="10" cellspacing="0">
		<thead>
			<tr>
				<th>번호</th>
				<th>제목</th>
				<th>작성자</th>
				<th>날짜</th>
			</tr>
		</thead>
	 	<tbody>
		 	<c:forEach var="dto" items="${list }">
				<tr>
					<td>${dto.idx }</td>			
					<td><a href="${cpath}/board/view/${dto.idx}">${dto.title }</a></td>			
					<td>${dto.writer }</td>
					<td>${dto.writeDate }</td>			
				</tr>
		 	</c:forEach>
	 	</tbody>
	</table>
	<div style="display: flex; justify-content: space-between; padding: 40px;">
		<div></div>
		<div><a href="${cpath }/board/write"><button>새 글 작성</button></a></div>
	</div>

</section>
</body>
</html>