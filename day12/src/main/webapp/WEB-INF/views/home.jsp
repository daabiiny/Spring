<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="cpath" value="${pageContext.request.contextPath }"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>day12</title>
<link type="text/css" rel="stylesheet" href="${cpath }/resources/css/style.css">
<script src="${cpath }/resources/js/script.js"></script>
</head>
<body>

<h1>day12</h1>
<hr>

<div id="modal" class="hidden">
	<div class="content">
		<form id="addForm">
			<h3>일정 추가하기</h3>	
			<p><input type="text" name="memo" placeholder="메모" required></p>
			<p><input type="date" name="sDate" required></p>
			<p>
				<input type="submit" value="등록">
				<input id="close" type="button" value="돌아가기">
			</p>
		</form>
	</div>
	<div class="overlay"></div>
</div>

<div class="buttons">
	<button id="open">일정추가</button>
</div>

<div id="root">
	<div class="menu">
		<div class="item selected">정다빈</div>
		<div class="item">이경용</div>
		<div class="item">왕제은</div>
		<div class="item">옥창혁</div>
		<div class="item">한동근</div>
		<div class="item">박재영</div>
		<div class="item">신유진</div>
		<div class="item">황상기</div>
		<div class="item">정승호</div>
		<div class="item">이동훈</div>
	</div>
	<div class="content">
		<div class="item selected">1</div>
		<div class="item">2</div>
		<div class="item">3</div>
		<div class="item">4</div>
		<div class="item">5</div>
		<div class="item">6</div>
		<div class="item">7</div>
		<div class="item">8</div>
		<div class="item">9</div>
		<div class="item">10</div>
	</div>
</div>

<script>
	// 데이터 불러오기
	
	// 이벤트 대상
	const menuItems = document.querySelectorAll('.menu > .item')
	const contentItems = document.querySelectorAll('.content > .item')

	// Access to fetch at 'http://192.168.112.32:8080/day12/schedules' from origin 
	// 'http://localhost:8080' has been blocked by CORS policy
	// Cross Origin Resource Sharing (CORS): 교차 출처 자원 공유
	// 모든 사이트에서 내 자료를 퍼가는데에 허용 (남의 데이터를 허락없이 들고온다는 개념!) 
	// Controller에서 @CrossOrigin 어노테이션을 걸어준다
	
	menuItems.forEach(menuItemsHandler)
</script>
<script>
	// 데이터 추가하기
	const modal = document.getElementById('modal')
	const open = document.getElementById('open')
	const close = document.getElementById('close')
	const overlay = document.querySelector('#modal > div.overlay')
	const addform = document.getElementById('addForm')
	
	open.onclick = event => modal.classList.remove('hidden')
	close.onclick = event => modal.classList.add('hidden')
	overlay.onclick = event => modal.classList.add('hidden')
	
	addForm.onsubmit = submitHandler
	
	window.onload = e => {
		const event = new Event('click')
		document.querySelector('.menu > .item').dispatchEvent(event)
	}
</script>

</body>
</html>