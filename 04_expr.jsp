<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%! // 선언문
    String str = "안녕하세요!!";
    int a = 5, b = -5;
    public int abs(int n) {
    	if(n<0) {
    		n = -n;
    	}
    	return n;
    }
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>표현식(expression)의 사용 예</title>
</head>
<body>
<%= str %><br> <!-- 표현식 -->
<%= a %> 의 절대값 : <%= abs(a) %><br> <!-- 표현식 -->
<%= b %> 의 절대값 : <%= abs(b) %><br> <!-- 표현식 -->

<% // 스크립트릿
out.print(str);
out.write("<br> \r \n");
out.print(a);
out.write(" 절대값 : ");
out.print(abs(a));
out.write("<br> \r \n");
out.print(b);
out.write(" 절대값 : ");
out.print(abs(b));
out.write("<br> \r \n");
%>
</body>
</html>