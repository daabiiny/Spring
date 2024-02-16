<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../header.jsp" %>

<section>
	<div><h3>${dto.idx }. ${dto.title }</h3></div>
	<div>작성자 : ${dto.writer }</div>
	<div>작성일자 : <fmt:formatDate value="${dto.writeDate }" pattern="yyyy년 MM월 dd일 HH:mm:ss"/></div>
	<div><img src="${cpath }/upload/${dto.img }"></div>
	<div><pre>${dto.content }</pre></div>
	<div style="display: flex; justify-content: space-around;">
		<div></div>
		<div><a href="${cpath }/review/delete/${dto.idx}"><button>삭제</button></a></div>
	</div>
</section>

</body>
</html>