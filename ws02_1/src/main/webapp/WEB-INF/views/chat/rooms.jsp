<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="cpath" value="${pageContext.request.contextPath }"/>  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>접속자 방 목록</title>
</head>
<body>

<h1><a href="${cpath }">${username }의 접속 중인 친구들</a></h1>
<hr>

<ul>
	<c:forEach var="user" items="${userList }">
		<li><a href="${cpath }/chat/room?roomId=${user}">${user }</a></li>
	</c:forEach>
</ul>

</body>
</html>