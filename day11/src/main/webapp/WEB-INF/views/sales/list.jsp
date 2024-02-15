<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../header.jsp" %>

<section>
	<table border="1" cellspacing="0" cellpadding="10">
		<thead>
		<tr>
			<th>번호</th>
			<th>매출일자</th>
			<th></th>
			<th>상품수량</th>
		</tr>
		</thead>
		<tbody>
		<c:forEach var="dto" items="${list }">
			<tr>
				<td>${dto.idx }</td>
				<td>
					<a href="${cpath }/product/view/${dto.idx}">${dto.productName }</a>
				</td>
				<td>${dto.price }원</td>
				<td>${dto.amount }개</td>
			</tr>
		</c:forEach>
		</tbody>
	</table>
	<div style="display: flex; justify-content: space-between; margin: 50px;">
		<div></div>
		<div><a href="${cpath }/sales/add"><button>매출등록</button></a></div>
	</div>
</section>

</body>
</html>