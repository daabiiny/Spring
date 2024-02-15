<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../header.jsp" %>

<section>
	<h3>정보 수정</h3>
	<form method="POST">
		<p><input type="text" name="userid" placeholder="아이디" value="${dto.userid }" required readonly></p>
		<p><input type="password" name="userpw" placeholder="비밀번호" required></p>
		<p><input type="text" name="username" placeholder="이름" value="${dto.username }" required></p>
		<p><input type="email" name="email" placeholder="이메일" value="${dto.email }" required></p>
		<p>
			<label><input type="radio" name="gender" value="남성" ${dto.gender == '남성' ? 'checked': ''} required>남성</label>
			<label><input type="radio" name="gender" value="여성" ${dto.gender == '여성' ? 'checked': ''} required>여성</label>
		</p>
		<p><input type="submit" value="수정"></p>	
	
	</form>
</section>

</body>
</html>