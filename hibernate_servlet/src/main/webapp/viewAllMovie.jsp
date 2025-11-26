<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="model.entity.Movie" %>
<%@ page import="java.util.*" %>
    
<!DOCTYPE html>
<html>
<head>
<title>All Movies</title>
</head>
<body>
<h2>All Movies</h2>

<table border="1" cellpadding="10">
    <tr>
        <th>ID</th>
        <th>Title</th>
        <th>image</th>
        <th>Rating</th>
    </tr>

    <%
    List<Movie> movies = (List<Movie>)request.getAttribute("movies");
    for(Movie m : movies) {
    	
%>
        <tr>
            <td><%= m.getId() %></td>
            <td><%= m.getName() %></td>
            <td><img alt="" src="fetchImage?id=<%=m.getId()%>" width="100"></td>
            <td><%= m.getRating() %></td>
        </tr>
<%
    	}
    
%>
    
    
</table>

</body>
</html>