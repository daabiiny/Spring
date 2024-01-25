<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>mcdonald-add.jsp</h1>
<hr>

<form method="POST">
	<p>
		<label><input type="radio" name="category" value="버거" required>버거</label>
		<label><input type="radio" name="category" value="음료" required>음료</label>
	</p>
	<p><input type="text" name="name" placeholder="이름" required></p>
	<p><input type="number" name="price" placeholder="가격" required></p>
	<p><input type="text" name="imgName" placeholder="사진" required></p>
	<p><textarea name="memo" placeholder="상품 상세 설명" required></textarea></p>
	<p><input type="submit" value="확인"></p>


</form>

</body>
</html>