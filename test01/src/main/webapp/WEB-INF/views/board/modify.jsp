<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../header.jsp" %>

<section>
	<h3>글 수정</h3>
	<form method="POST" enctype="multipart/form-data">
		<p><input type="text" name="title" value="${dto.title }"></p>
		<p><input type="hidden" name="idx" value="${dto.idx }"></p>
		<p><input type="text" name="writer" value="${login.userid }" readonly></p>
		<div><textarea name="content" placeholder="내용"
		style="resize: none; width: 600px; height: 300px;">${dto.content }</textarea></div>
		<p><input type="file" name="upload" placeholder="사진첨부" value="${dto.img }"></p>
		<p><input type="submit" value="수정"></p>
	</form>
</section>

</body>
</html>