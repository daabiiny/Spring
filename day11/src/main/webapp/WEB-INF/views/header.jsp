<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<c:set var="cpath" value="${pageContext.request.contextPath }"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>POS</title>

<style>
	header, section {
		width: 900px;
		margin: auto;
	}
</style>
</head>
<body>

<header>
	<h1 style="text-align: center;"><a href="${cpath }">GS25</a></h1>
	<nav>
			<ul style="display: flex; padding: 0; list-style: none; justify-content: space-around;">
				<li><a href="${cpath }/product/list">상품목록</a></li>
				<li><a href="${cpath }/sales/list">매출목록</a></li>
			</ul>
	</nav>
</header>


</body>
</html>