<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update Movie</title>
</head>
<body>

	<form action="updateMovie" method="post">
		Enter Movie Id:<input type="number" name="id"><br> New
		Name:<input type="text" name="name"><br> New Rating:<input
			type="number" name="rating"><br> New Release Date: <input
			type="date" name="dor"><br> 
			<input type="submit" value="Update Movie"><br>
	</form>
	<hr>

	<%
	String msg = (String) request.getAttribute("msg");
	if (msg != null) {
	%>
	<h3><%=msg%></h3>

	<%
	}
	%>


</body>
</html>