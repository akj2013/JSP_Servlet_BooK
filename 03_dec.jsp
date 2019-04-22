<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%! // 선언문
    String str = "안녕하세요!!"; // str읜 JSP 문서 전체에서 사용 가능한 변수입니다.
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
<title>선언문에 변수 선언과 메소드 정의하기</title>
</head>
<body>
<% // 스크립트릿
	out.print(str+"<br>"); 
	out.print(a+"의 절대값 : " + abs(a)+"<br>");
	out.print(b+"의 절대값 : " + abs(b)+"<br>");
%>
</body>
</html>