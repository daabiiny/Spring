<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="cpath" value="${pageContext.request.contextPath }"/>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>mcdonald-list.jsp</title>
</head>
<body>

<h1>mcdonald-list.jsp</h1>
<hr>

<p>
<a href="${cpath }/mcdonald/add"><button>메뉴추가</button></a>
</p>

<c:forEach var="dto" items="${list }">
	<div>${dto.idx }</div>
	<div>
		<a href="${cpath }/view/${dto.idx}">
		<img src="${cpath }/resources/image/${dto.imgName}" height="100"></a>
		</div>
	<div>${dto.name }</div>
	<div>${dto.price }원</div>
</c:forEach>



</body>
</html>