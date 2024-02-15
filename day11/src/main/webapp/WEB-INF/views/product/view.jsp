<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../header.jsp" %>

<section>
	<form method="POST">
	<h2>${dto.idx}. ${dto.productName } ( ${dto.price }원 )</h2>
	<h3>재고 : ${dto.amount }개</h3>
	<p><img src="${cpath }/upload/${dto.productImage}" width="400px"></p>
	<p></p>
	</form>
	<div style="display: flex; justify-content: space-between; margin: 50px;">
		<div></div>
		<div>
			<a href="${cpath }/product/modify/${dto.idx}"><button>수량변경</button></a>
			<a href="${cpath }/product/delete/${dto.idx}"><button>상품삭제</button></a>
		</div>
	</div>	
</section>

</body>
</html>