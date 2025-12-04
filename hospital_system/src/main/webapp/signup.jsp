<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>signup page</title>
<%@include file="component/allcss.jsp"%>

<style>
.signup {
	font-family: Arial, sans-serif;
	background: #f3f3f3;
	display: flex;
	justify-content: center;
	align-items: center;
	height: 100vh;
	flex-direction: column;
}

.container {
	font-family: Arial, sans-serif;
	background: #f3f3f3;
	display: flex;
	justify-content: center;
	align-items: center;
	height: 400px;
	flex-direction: column;
	background: #fff;
	padding: 30px;
	border-radius: 12px;
	width: 400px;
	box-shadow: 0 4px 10px rgba(0, 0, 0, 0.1);
}

h2 {
	text-align: center;
	margin-bottom: 20px;
}

input {
	width: 100%;
	padding: 12px;
	margin: 10px 0;
	border: 1px solid #ccc;
	border-radius: 8px;
}

button {
	width: 100%;
	padding: 12px;
	background: #007bff;
	color: white;
	border: none;
	border-radius: 8px;
	cursor: pointer;
	font-size: 16px;
}

button:hover {
	background: #0056b3;
}

.signup {
	text-align: center;
	margin-top: 15px;
	font-size: 14px;
}

.signup a {
	color: #007bff;
	text-decoration: none;
}

.signup a:hover {
	text-decoration: underline;
}
</style>

</head>
<body>
	<%@include file="component/navbar.jsp"%>

	<div class="signup">

		<div class="container">

			<h2>SignUp</h2>

			<c:if test="${not empty sucMsg}">
				<p class="text-center text-success fs-3">${sucMsg}</p>
				<c:remove var="sucMsg" scope = "session"/>
			</c:if>

			<c:if test="${not empty errMsg}">
				<p class="text-center text-danger fs-3">${errMsg}</p>
				<c:remove var="errMsg" scope="session" />
			</c:if>



			<form action="user_register" method="post">
				<input type="text" name="fullname" placeholder="Full Name" required />
				<input type="email" name="email" placeholder="Email" required /> <input
					type="password" name="password" placeholder="Password" required />
				<button type="submit">Register</button>
			</form>

		</div>
	</div>


</body>
</html>