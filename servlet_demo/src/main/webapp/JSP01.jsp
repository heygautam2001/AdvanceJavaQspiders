<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Hello World</h1>
<h2>Declaration tag : </h2>

<%! int x = 23; String name = "Gautam"; %>

<h2>Expression tag : <%= x %> <%= name %> </h2>

<%
 int sum = 20+30;
out.println(sum);

int sub = sum -10;
out.println("sub "+sub);

%>


 </body>
</html>