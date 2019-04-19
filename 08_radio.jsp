<!-- 라디오 버튼과 <textarea> 태그가 있는 폼 양식을 갖는다. [전송] 버튼을 클릭하면 서블릿으로 선택된 값이 전송되고 서블릿에서 선택된 값을 받아 처리한다. -->

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form method="get" action="RadioServlet">
	<label for="gender">성별 : </label>
	<input type="radio" id = "gender" name = "gender" value = "남자" checked> 남자
	<input type="radio" id = "gender" name = "gender" value = "여자" > 여자 <br><br>
	<label for = "chk_mail"> 메일 정보 수신 여부</label>
	<input type = "radio" id = "chk_mail" name = "chk_mail" value = "yes" checked> 수신 
	<input type = "radio" id = "chk_mail" name = "chk_mail" value = "no"> 거부 <br><br>
	<label for = "content"> 간단한 가입 인사를 적어주세요.</label>
	<textarea id = "content" name = "content" rows="3"	cols="35"></textarea><br>
	<input type = "submit" value="전송">
</form>
</body>
</html>