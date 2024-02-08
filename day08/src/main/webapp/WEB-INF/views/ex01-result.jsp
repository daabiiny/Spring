<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h3>정답은</h3>

${n1 }
${operator }
${n2 }
=
${answer }

<p><a href="${pageContext.request.contextPath }/ex01"><button>다시 입력</button></a></p>

</body>
</html>