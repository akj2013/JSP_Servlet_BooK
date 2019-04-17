<!-- JSP : Java Server Page의 줄임말로 자바로 서버 페이지를 작성하기 위한 언어입니다. HTML과 JSP 태그(스크립트릿)로 구성되어 화면을 작성하는 데 유리한 웹 프로그래밍 기술입니다. 
서버 페이지는 웹 서버에서 실행되는 페이지를 말하며 요청에 필요한 페이지를 위한 로직이나 데이터베이스와의 연동을 위해 필요한 것들을 포함합니다. -->

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- 이 태그는 해당 페이지 내에 사용되는 전반적인 환경을 결정해주는 태그입니다. 이 페이지에서 사용하는 언어가 자바이며 이 페이지가 html 문서이며 한글 인코딩을 UTF-8로 처리하겠다는 의미입니다. -->

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body> <!-- 스크립트릿, Scriptlet -->
	<% 
		int num1 = 20;
		int num2 = 10;
		int add = num1 + num2;
	%>
	<%=num1 %> + <%=num2 %> = <%=add %> <!-- 표현식, expression -->
</body>
</html>
