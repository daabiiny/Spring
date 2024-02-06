<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../header.jsp" %>

<section>
	<table border="1" cellspacing="0" cellpadding="10">
		<c:forEach var="dto" items="${list }">
			<tr>
				<td>${dto.idx }</td>
				<td>
					<a href="${cpath }/survey/view/${dto.idx}">${dto.title }</a>
				</td>
				<td>${dto.writer }</td>
			</tr>
		</c:forEach>
	</table>
</section>


</body>
</html>