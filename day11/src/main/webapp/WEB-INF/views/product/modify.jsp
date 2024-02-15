<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../header.jsp" %>

<section>
<h1>상품 수정</h1>
<hr>
	<form method="POST" enctype="multipart/form-data">
		<p><input type="text" name="productName" placeholder="상품명" value="${dto.productName }"></p>
		<p><input type="file" name="upload" placeholder="사진" value="${dto.productImage }"></p>
		<p><input type="number" name="price" placeholder="가격" value="${dto.price }"></p>
		<p><input type="number" name="amount" placeholder="수량" value="${dto.amount }"></p>
		<p><input type="submit" value="수정완료"></p>
	</form>
</section>

</body>
</html>