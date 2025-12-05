<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<form action="view_student_data" method="post">

		id : <input type="number" name="id"><br>
		name : <input type="text" name="name"><br> 
		email : <input type="email" name="email"><br> 
		phone : <input type="tel" name="phone"><br>
		dob : <input type="date" name="dob"><br> 
		gender : <br>
	    <input type="radio" name="gender">male
		<input type="radio" name="gender">female
		<input type="radio" name="gender">other
		
		<br>
		<select name="country">

			<option value="India">India</option>
			<option value="USA">USA</option>
			<option value="Russia">Russia</option>

        </select> <br> 
        
		skills: <br>
		
		<input type="checkbox" name="skills" value="SQL"> SQL
		<input type="checkbox" name="skills" value="Java"> JAVA
		<input type="checkbox" name="skills" value="Adv Java"> Advance JAVA
		<input type="checkbox" name="skills" value="Web Teh"> WebTech
		
		<input type="submit">





	</form>

</body>
</html>