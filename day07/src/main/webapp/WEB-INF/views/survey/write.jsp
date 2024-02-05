<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../header.jsp" %>

<section>
	<h3>새 설문 등록</h3>
	<form method="POST" enctype="multipart/form-data">
		<p><input type="text" name="title" placeholder="제목" required autofocus></p>
		<p><input type="text" name="writer" value="${login.userid }" readonly></p>
		<p><input type="file" name="imageA" value="첫번째 이미지" required></p>
		<p><input type="text" name="contentA" placeholder="첫번째 질문" required></p>
		<p><input type="file" name="imageB" value="두번째 이미지" required></p>
		<p><input type="text" name="contentA" placeholder="두번째 질문" required></p>
		<p><input type="submit" value="글 등록"></p>
	</form>
</section>


</body>
</html>