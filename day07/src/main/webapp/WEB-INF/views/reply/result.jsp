<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../header.jsp" %>

	
<section>
	<table border="1" cellpadding="10" cellspacing="0" style="width: 800px;">
		<thead>
		<tr>
			<th>번호</th>
			<th>제목</th>
			<th>선택1</th>
			<th>선택2</th>
		</tr>
	</thead>
	<tbody style="text-align: center;">
		<c:forEach var="dto" items="${list }">
			<tr>
				<td>${dto.idx }</td>
				<td>${dto.title }</td>
				<td>
					${dto.contentA }
					${dto.choice1Rate}%
					(${dto.choice1Count}명)
				</td>
				<td>
					${dto.contentB }
					${dto.choice2Rate}%
					(${dto.choice2Count}명)
				</td>
			</tr>
		</c:forEach>
	</tbody>
	</table>
</section>

</body>
</html>