<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<c:set var="cpath" value="${pageContext.request.contextPath }"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>test4A</title>
<style>
	header, section {
		width: 900px;
		margin: auto;
	}
	a {
		text-decoration: none;
	}
</style>
</head>
<body>

<header>
	<h1 style="text-align: center;"><a href="${cpath }">다빈이네 리뷰리뷰 (❁´◡`❁)</a></h1>
	<div id="login">
		<c:if test="${not empty login }">
			${login.userid }님 로그인 중
			<a href="${cpath }/account/logout"><button>로그아웃</button></a>
		</c:if>
	</div>
	<nav>
		<ul style="display: flex; padding: 0; list-style: none; justify-content: space-around;">
			<li><a href="${cpath }/account/login">로그인</a></li>
			<li><a href="${cpath }/account/join">회원가입</a></li>
			<li><a href="${cpath }/review/write">리뷰작성</a></li>
			<li><a href="${cpath }/review/list">리뷰목록</a></li>
		</ul>
	</nav>
</header>

</body>
</html>