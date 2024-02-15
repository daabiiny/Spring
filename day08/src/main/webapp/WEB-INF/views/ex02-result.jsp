<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>결과</h1>
<hr>

<h3>${name }님은 ${age }살이고, ${adult }입니다.</h3>

<p><a href="${pageContext.request.contextPath }/ex02"><button>다시 입력</button></a></p>

</body>
</html>