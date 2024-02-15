<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../header.jsp" %>

<section>
	<h3>새글 작성</h3>
	<form method="POST" enctype="multipart/form-data">
		<p><input type="text" name="title" placeholder="제목" autofocus required></p>
		<p><input type="text" name="writer" value="${login.userid }" readonly></p>
		<div><textarea name="content" placeholder="내용"
		style="resize: none; width: 600px; height: 300px;"></textarea></div>
		<p><input type="file" name="upload" placeholder="사진첨부" required></p>
		<p><input type="submit" value="작성"></p>
	</form>
</section>

</body>
</html>