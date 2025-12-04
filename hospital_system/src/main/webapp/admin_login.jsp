<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>doctor login page</title>
<%@include file="component/allcss.jsp"%>

<style>
.login {
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

	<div class="login">

		<div class="container">

			<h2>Admin Login</h2>
			<form action="doclogin" method="post">
				<input type="email" name="email" placeholder="Email" required /> <input
					type="password" name="password" placeholder="Password" required />
				<button type="submit">Login</button>
			</form>


			<div class="signup">
				Don't have an account? <a href="signup.jsp">Sign up</a>
			</div>
		</div>
	</div>




	<%@include file="component/footer.jsp"%>

</body>
</html>