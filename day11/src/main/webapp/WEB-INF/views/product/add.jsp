<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../header.jsp" %>

<section>
	<h1>상품 추가</h1>
	<hr>
	
	<form method="POST" enctype="multipart/form-data">
		<p><input type="text" name="productName" placeholder="상품명" required autofocus></p>
		<p><input type="file" name="upload" placeholder="사진" required></p>
		<p><input type="number" name="price" placeholder="가격" required></p>
		<p><input type="number" name="amount" placeholder="수량" required></p>
		<p><input type="submit" value="등록"></p>
	</form>
</section>

</body>
</html>