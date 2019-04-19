<!-- 체크 박스가 있는 폼 양식을 갖는다. [전송] 버튼을 클릭하면 서블릿으로 다중 선택된 값이 전송되고 서블릿에서 선택된 값을 받아 처리한다. -->

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>관심분야 다중 선택하기</title>
</head>
<body>
<h2>악세사리</h2>
관심분야를 선택하세요.<hr>
<form method="get" action = "CheckboxServlet">
	<input type = "checkbox" name = "item" value = "신발"> 신발
	<input type = "checkbox" name = "item" value = "가방"> 가방
	<input type = "checkbox" name = "item" value = "벨트"> 벨트<br>
	<input type = "checkbox" name = "item" value = "모자"> 모자
	<input type = "checkbox" name = "item" value = "시계"> 시계
	<input type = "checkbox" name = "item" value = "쥬얼리"> 쥬얼리<br>
	<input type = "submit" value = "전송">
</form>
</body>
</html>