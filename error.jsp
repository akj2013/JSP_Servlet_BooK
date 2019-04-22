<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%--현재 페이지가 에러 페이지임을 설정한다. --%>
<%@ page isErrorPage = "true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>에러 발생 페이지와 에러 페이지 만들기</title>
</head>
<body>
다음과 같은 에러가 발생하였습니다.
<%= exception.getMessage() %>
</body>
</html>