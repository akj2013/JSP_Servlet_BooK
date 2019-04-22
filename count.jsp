<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%! // 선언문 
    int global_cnt = 0;
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>선언문에 선언한 변수와 스크립트릿 변수의 성격 파악하기</title>
</head>
<body>
<% // 스크립트릿
	int local_cnt = 0; // 스크립트릿 변수는 _jspService() 메소드 내의 지역번수로 선언된다.
	out.print("<br> local_cnt : ");
	out.print(++local_cnt);
	out.print("<br> global_cnt : ");
	out.print(++global_cnt);
%>
<!-- 
서블릿은 첫 번째 요청인 경우에만 서블릿 클래스를 찾아 메모리에 로딩하여 인스턴스(객체)를 생성하고 이 후에 요청에 대해서는 서블릿 인스턴스를 다시 생성하지 않고
이미 메모리에 로딩된 서블릿으로부터 서비스만 받는다. 그렇기에 필드에 선언된 global_cnt는 새로고침을 여러 번 해도 이미 생성된 필드가 계속 사용되기에 이전의
값을 유지하고 있다가 1 증가시키기에 값이 계속 증가하고, _jspService()메소드 내의 지역변수로 선언된 local_cnt는 새로고침을 할 때마다 _jspService()
메소드가 호출되면서 새롭게 메모리 할당을 하면서 0으로 초기화한 후에 1 증가하기 때문에 항상 1만 출력됩니다.
 -->
</body>
</html>

