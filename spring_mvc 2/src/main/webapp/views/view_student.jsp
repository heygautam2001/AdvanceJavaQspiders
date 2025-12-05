<%@page import="edu.qs.controller.Student"%>
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
	Student s = (Student) request.getAttribute("student");

	if (s != null) {
	%>

	<h1>
		Id : <%=s.getId()%>
	</h1>
	<h1>
		name : <%=s.getName()%>
	</h1>
	<h1>
		Email : <%=s.getEmail()%>
	</h1>
	<h1>
		Phone :<%=s.getPhone()%>
	</h1>
	<h1>
		DOB :<%=s.getDob()%>
	</h1>
	<h1>
		Gender : <%=s.getGender()%>
	</h1>
	<h1>
		country : <%=s.getCountry()%>
	</h1>

	<%
	for (String sk : s.getSkills()) {
		out.print("<h2>" + sk + "</h2>");
	}
	%>


	
	<%
}
%>


</body>
</html>