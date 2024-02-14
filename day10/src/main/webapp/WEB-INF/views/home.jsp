<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="cpath" value="${pageContext.request.contextPath }"/>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	table {
		border: 2px solid black;
		border-collapse: collapse;
	}
	td {
		padding: 5px 10px;
		border: 1px solid grey;
	}

</style>
</head>
<body>

<h1>day10</h1>
<hr>

<ul>
	<li><a href="ex01">ex01 - ajax(1, 정수반환)</a></li>
	<li><a href="ex02">ex02 - ajax(2, 문자열 반환)</a></li>
	<li><a href="ex03">ex03 - ajax(3, Map 반환)</a></li>
	<li><a href="ex04">ex04 - ajax(4, LIST&lt;DTO> 반환)</a></li>
</ul>

<div id="root"></div>

<script>
	let url = 'https://apis.data.go.kr/6260000/BusanRainfalldepthInfoService/getRainfallInfo'
	
	const param = {
			serviceKey: 'xIi2xer0YCKS8xCDwZRMYqra1GizNXGZVov2yhjwfctp02IU1bubA18cLhTwUfxsenjFqg2UylLvZvz%2F4tRovQ%3D%3D',
			pageNo: '1',
			numofRows: '25',
			resultType: 'json',
	}
	
	url += '?'
	for(let key in param){
		url += key + '=' + param[key] + '&'
	}
	
	// 다른 서버에 AJAX 요청하기!
	fetch(url)						// 지정한 주소로 요청을 보낸다
		.then(resp => resp.json())	// 요청이후 돌아오는 응답을 JSON 객체로 변환한다
		.then(json => {				// 변환된 JSON객체를 이용하여, { } 출력 내부 코드를 수행한다
			
// 			console.log(json.getRainfallInfo.body.items.item)
			const arr = json.getRainfallInfo.body.items.item.map(e => {
				const ob = {}
				ob.clientName = e.clientName
				ob.level6 = e.level6
				return ob
			})
// 			console.log(arr)
			const tr1 = document.createElement('tr')	// 지역이름을 배치할 첫번째 줄
			const tr2 = document.createElement('tr')	// level6의 값을 배치할 두번쨰 줄
			
			for(let i in arr){
				const td1 = document.createElement('td')
				td1.innerText = arr[i].clientName
				tr1.appendChild(td1)
				
				const td2 = document.createElement('td')
				td2.innerText = arr[i].level6
				tr2.appendChild(td2)
			}
			const table = document.createElement('table')
			table.appendChild(tr1)
			table.appendChild(tr2)
			
			const root = document.getElementById('root')
			root.appendChild(table)
		})
	
</script>

</body>
</html>