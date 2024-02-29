<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="cpath" value="${pageContext.request.contextPath }"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>day13</title>
<link type="text/css" rel="stylesheet" href="${cpath }/resources/css/style.css">
<style>

</style>
<script src="${cpath }/resources/js/function.js"></script>
<script>
	const cpath = '${cpath}'
	const urls = [
		'http://192.168.112.32:8080/day13/schedules',
		'http://192.168.112.25:8080/day13/schedules',
		'http://192.168.112.13:8080/day13/schedules',
		'http://192.168.112.37:8080/day13/schedules',
		'http://192.168.112.20:8080/day13/schedules',
		'http://192.168.112.14:8080/day13/schedules',
		'http://192.168.112.16:8080/day13/schedules',
		'http://192.168.112.36:8080/day13/schedules',
		'http://192.168.112.23:8080/day13/schedules',
		'http://192.168.112.35:8080/day13/schedules',
		'http://192.168.112.18:8080/day13/schedules',
		'http://192.168.112.24:8080/day13/schedules',
	]
</script>

</head>
<body>

<h1>day13</h1>
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
		<div class="item">황민정</div>
		<div class="item">최현웅</div>
	</div>
	<div class="content">
		<img src="${cpath }/resources/image/수지1.jpg" height="500px">
	</div>
</div>

<script>

// 	콜백안에 콜백안에 중첩되면 복잡하니까, return을 써서 밖으로 꺼내고 다시 씀
// 	promise가 뜸! promise는 이렇게 할거다.. 같은 서약문 같은거!
//	비동기 함수 promise니까 await를 써서 호출하고, await를 호출하기 위해 상위에 async를 붙여줌
//  문서가 모두 불러지면 특정요소를 호출하여 이벤트를 연결하는 함수

// 개념적으론 메인함수		
function loadHandler(){
	// 상단 메뉴를 클릭했을 때 스타일 옮겨가는 내용
	const itemList = document.querySelectorAll('.menu > .item')	// 이벤트 대상
	itemList.forEach(element => element.addEventListener('click', itemListClickHandler))
	
	// 상단 메뉴를 클릭했을 때 fetch로 데이터 불러와서 div#root > div.content에 내용 띄우기
	itemList.forEach(element => element.addEventListener('click', menuClickHandler)) 
	
	// 열기/닫기 버튼에 모달 작동 연결하기
	const modal = document.getElementById('modal')
	const btns = [
		document.getElementById('open'),
		document.getElementById('close'),
		document.querySelector('div.overlay'),
	]
	btns.forEach(b => b.onclick = event => modal.classList.toggle('hidden'))
	
	// form을 제출하면 자신의 서버에 POST로 등록하기
	const form = document.forms[0]	// 이벤트 대상
	form.onsubmit = submitHandler

}
	window.addEventListener('DOMContentLoaded', loadHandler)
	
</script>


</body>
</html>