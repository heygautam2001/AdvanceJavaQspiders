<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% 
String exception = (String)request.getAttribute("message");

if(exception != null){
	
	out.print(exception);
	
	
	
}

%>
</body>
</html>