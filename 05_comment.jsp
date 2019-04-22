<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>HTML 주석문과 JSP 주석문의 차이점</title>
</head>
<body>
<!-- HTML 주석문이다. -->
<%-- JSP 주석문이다. --%>
<% String name = "Angel"; 
// 스크립트릿은 JSP 페이지에 자바 코드를 기술하기 위해 만들어진 태그이므로 자바에서 지원되는 모든 기능이 가능합니다.
/* 주석문 역시 자바에서 사용하던 형태 그대로 사용할 수 있습니다.
		*/
%>
Hello <%= name%>

<!-- 
브라우저에 출력된 실행 결과를 보면 HTML 주석문과 JSP 주석문 둘다 나타나지 않습니다.
하지만 브라우저에서 [소스보기]를 하면 HTML 주석문을 확인할 수 있습니다. HTML 주석문은 웹 컨테이너가 서블릿 클래스를 만들면서
out 객체에 의해 문자열 형태로 클라이언트에 출력되기 때문입니다.
JSP 주석문은 [소스보기]를 해도 JSP 주석문이 있던 부분이 빈 공간으로 처리되어 볼 수 없습니다. 개발자가 JSP 페이지를 직접 열었을 때만
볼 수 있습니다. JSP가 Servlet으로 변환될 자바 클래스 소스 파일을 열어보아도 JSP 전용 주석문의 내용은 Servlet 코드로 변환되지 않았음을 확인할 수 있습니다.
 -->
</body>
</html>