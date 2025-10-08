<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<a href="product_dashboard">Product Dashboard</a>

<h1>Add the product details</h1>

<form action="add_product" method="post" enctype="multipart/form-data">
<input type="file" name="image"><br>
Name: <input type="text" name="name"><br>
Price: <input type="text" name="price"><br>

<select name="type">

<option value="electronics">Electronics</option>
<option value="sports">Sports</option>
<option value="fashion">Fashion</option>

</select><br>
<input type="submit">
</form>

<%

String msg = (String) request.getAttribute("msg");

if(msg != null){
	out.print("<h6><mark>"+msg+"</mark></h6>");
}

%>

</body>
</html>