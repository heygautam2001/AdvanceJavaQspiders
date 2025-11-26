<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="model.entity.Movie" %>
	
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


	<form action="viewMovie" method="get">
		Enter the id : <input type="number" name="id"> <input
			type="submit" value="search">
	</form>

	<%
	Movie m = (Movie) request.getAttribute("movie");
	String msg = (String) request.getAttribute("msg");

	if (m != null) {
	%>

	<img alt="" src="fetchImage?id=<%=m.getId()%>" width="100">
	<h1>Name:<%=m.getName()%></h1>
	<h1>rating:<%=m.getRating()%> </h1>
	<h1>ReleaseDate : <%=m.getReleaseDate()%> </h1>
	
	
	<%
	}
	if (msg != null) {
	out.print("<h6>" + msg + "</h6>");
	}
	%>



</body>
</html>