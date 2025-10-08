<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@page import="product_crud_task.Product" %>
    <%@page import="java.util.List" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%
String msg = (String)request.getAttribute("msg");
if(msg != null){
	out.println("<h6><mark>"+msg+"</mark></h6>");
}
%>


  <a href = "add_product.jsp">Add Products</a>
  <hr>
  
  <%
  
  List <Product> prods = (List<Product>)request.getAttribute("products");
  
  if(prods != null){
  
  %>
  
  <table border = "1">
      <tr>
      <th>ID</th>
      <th>Name</th>
      <th>Price</th>
      <th>Type</th>
      <th>Image</th>
      <th></th>
      <th></th>
      </tr>
      
      <%
      for(Product p : prods){
      %>
       
       <tr>
       <td><%= p.getId() %></td>
       <td><%= p.getName() %></td>
       <td><%= p.getPrice() %></td>
       <td><%= p.getType() %></td>
       <td> <img alt="image not found" src="prod_image?id=<%=p.getId() %>" height="50"> </td>
       
       <td>
       <a href="remove_prod?id=<%= p.getId()%>" onclick= "return comfirm('Are you want to delete this product?');">remove</a>
       </td>
       <td><a href="fetch_prod?id=<%=p.getId()%>">update</a></td>
       </tr>
       
        
       
      <% } %>
      
   </table>
   
   <% }
   else{
	   out.print("<>h2 No products addes</h2>");
   }
   %>
</body>
</html>