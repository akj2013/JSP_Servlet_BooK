<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ともだち</title>
<script type = "text/javascript" src="param.js"></script> <!-- 유효성 검사 param.js 파일을 포함시킨다. -->
</head>
<body>
	<form method = "get" action = "ParamServlet" name = "frm">
		아이디 : <input type = "text" name="id"><br>
		나 &nbsp 이 : <input type = "text" name = "age"><br>
		<input type = "submit" value = "전송을 클릭하면 ParamServlet 서블릿이 get 방식으로 요청됩니다." onclick = "return check()">
	</form>
</body>
</html>