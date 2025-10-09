<%@page import="product_crud_task.Product"%>
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
Product p = (Product)request.getAttribute("product");
%>
<form action="update_product" method="post" enctype="multipart/form-data">

Change image: <input type="file" name="image"><br>

<input type="hidden" name = "id" value="<%=p.getId()%>">
<input type="text" name = "name" value="<%=p.getName()%>">
<input type="text" name = "price" value="<%=p.getPrice()%>">

 <select name="type">
 <option value="electronics" <%=p.getType().equals("electronics")? "selected" : "" %>>Electronics</option>
 <option value="sports" <%=p.getType().equals("sports")? "selected" : "" %>>sports</option>
 <option value="fashion" <%=p.getType().equals("fashion")? "selected" : "" %>>fashion</option>
 
 </select><br>
<input type="submit">

</form>
</body>
</html>