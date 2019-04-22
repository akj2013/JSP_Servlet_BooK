<%@ page import = "java.text.SimpleDateFormat" %><!-- 지시자(directive) -->
<%@ page import = "java.util.*" %> <!-- 지시자(directive) -->

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>오늘 날짜 출력하기(지시자)</title>
</head>
<body>
<% // 스크립트릿
Calendar date = Calendar.getInstance(); // Calendar 클래스로 오늘 날짜를 얻어오기 위해서는 static 메소드인 getInstance()를 호출해야 한다.
SimpleDateFormat today = new SimpleDateFormat("yyyy년 MM월 dd일");
SimpleDateFormat now = new SimpleDateFormat("hh시 mm분 ss초");
%>
오늘은 <b> <%= today.format(date.getTime()) %></b> 입니다. <br> 
<!--  지금 시각은 <b> <%= now.format(date.getTime()) %></b> 입니다.-->
<!-- SimpleDateFormat 객체의 format() 메소드는 객체 생성하면서 정해준 형태로 날짜를 문자열 형식으로 변환해 주는 메소드입니다.
이 메소드를 사용할 때 주의할 점은 Calendar 객체를 직접 기술하지 못한다는 점입니다. 그래서 getTime() 메소드로 Calendar 형을 Date 형으로 변환한 후에 사용해야 합니다. -->
</body>
</html>