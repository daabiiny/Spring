<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../header.jsp" %>

<section style="text-align: center;">
	<h2>${dto.title }</h2>
	<form method="POST">
		<div style="width: 980px; display: flex; justify-content: space-between; text-align: center;">
			<div>
				<p><img src="${cpath }/upload/${dto.imageA}" width="400px"></p>
				<p>
					<label><input type="radio" name="choice" value="1" required>${dto.contentA }</label>
				</p>
			</div>
			<div>
				<p><img src="${cpath }/upload/${dto.imageB}" width="400px"></p>
				<label><input type="radio" name="choice" value="2" required>${dto.contentB }</label>
			</div>
		</div>
		<p><input type="submit" value="설문완료"></p>
	</form>
</section>

</body>
</html>