<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
 <form action="addMovie" method = "post" enctype = "multipart/form-data">
 
 upload image : <input type = "file" name ="image"><br>
 
 Name : <input type = "text" name = "name"><br>
 
 rating : 
 <select name = "rating">
 
 <option value = "1">1</option>
 <option value = "2">2</option>
 <option value = "3">3</option>
 <option value = "4">4</option>
 <option value = "5">5</option>
 

 </select><br>
 
 release Date : <input type = "date" name = "dor"><br>
 
 <input type="submit" value = "add movie">
 
 <% 
 
 String msg = (String)request.getAttribute("msg");
 if(msg != null){
	 out.print("<h6>"+msg+"</h6>");
 }
 
 %>
 
 
 </form>
</body>
</html>