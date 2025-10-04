
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%! 
// Declaration tag => decalare static & non-static member
// we cannot send the response from declaration tag
// we cannot write bussiness logic


static String v1 = "static variable";
 String v2 = "non-static variable";
 
 public static String m1(){
	 return "static method m1()";
 }
 
 public String m2(){
	 return "non-static method m1()";
 }
 
 static{
	 System.out.println("Static block initializers");
 }
 
 {
	 System.out.println("Non-Static block initializers");
 }

%>

<% 
// scsriplet tags => local varible
// we can send mjultipole record from scriptlet tag
// Bussiness logic


String v3 = "local variabke";

out.print(v1+"<br>");
out.print(v2+"<br>");
out.print(v3+"<br>");
out.print(m1()+"<br>");
out.print(m2()+"<br>");



%> 

<hr>

<h1><%= v1 %></h1>
<h1><%= v2 %></h1>
<h1><%= v3 %></h1>
<h1><%= m1() %></h1>
<h1><%= m2() %></h1>

<hr>

<h1>1.LifeCycle of jsp ----> 7 stages</h1>

<h2>1.Translation stages --> converts the jsp file into a Generic-servlet file</h2>
<h2>2.Compilation---> checks the syntax and semantics</h2>
<h2>3.Loading</h2>
<h2>4.Instantiation</h2>
<h2>5.Initialization (invoking the init() method)</h2>
<h2>6.Override/implements the service method</h2>
<h2>7.Destroy the servlet</h2>




</body>
</html>