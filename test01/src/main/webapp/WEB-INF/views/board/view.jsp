<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../header.jsp" %>

<section>
	<h2>${dto.idx }. ${dto.title }</h2>
	<div>작성자 : ${dto.writer }</div>
	<div>작성일자 : ${dto.writeDate }</div>
	<div><img src="${cpath }/upload/${dto.img}"></div>
	<pre>${dto.content }</pre>
	
	<div style="display: flex; justify-content: space-between; padding: 40px;">
	<div></div>
	<div>
		<a href="${cpath }/board/modify/${dto.idx}"><button>수정</button></a>
		<a href="${cpath }/board/delete/${dto.idx}"><button>삭제</button></a>
	</div>
	</div>
</section>

</body>
</html>