<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../header.jsp" %>

<section>
	<h3>회원가입</h3>
	<form method="POST">
		<p><input type="text" name="userid" placeholder="아이디" autofocus required></p>
		<p><input type="password" name="userpw" placeholder="비밀번호" required></p>
		<p><input type="text" name="username" placeholder="이름" required></p>
		<p><input type="submit" value="가입"></p>
	</form>
</section>

</body>
</html>