<%@page import="com.db.DBConnect"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%-- <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> --%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>index page</title>


<%@include file="component/allcss.jsp"%>

<style type="text/css">
.paint-card {
	box-shadow: 0 0 10px 0 rgba(0, 0, 0, 0.3);
}
</style>

</head>
<body>
	<%@include file="component/navbar.jsp"%>
	
	<% Connection conn = DBConnect.getConn(); 
	out.print(conn);
	
	%>
	
	<div id="carouselExampleIndicators" class="carousel slide"
		data-bs-ride="carousel">
		<div class="carousel-indicators">
			<button type="button" data-bs-target="#carouselExampleIndicators"
				data-bs-slide-to="0" class="active" aria-current="true"
				aria-label="Slide 1"></button>
			<button type="button" data-bs-target="#carouselExampleIndicators"
				data-bs-slide-to="1" aria-label="Slide 2"></button>
			<button type="button" data-bs-target="#carouselExampleIndicators"
				data-bs-slide-to="2" aria-label="Slide 3"></button>
			<button type="button" data-bs-target="#carouselExampleIndicators"
				data-bs-slide-to="3" aria-label="Slide 4"></button>
			<button type="button" data-bs-target="#carouselExampleIndicators"
				data-bs-slide-to="4" aria-label="Slide 5"></button>
		</div>
		<div class="carousel-inner">
			<div class="carousel-item active">
				<img src="img/hospital1.jpg" class="d-block w-100" alt="..."
					height="600px">
			</div>
			<div class="carousel-item">
				<img src="img/hospital3.jpg" class="d-block w-100" alt="..."
					height="600px">
			</div>
			<div class="carousel-item">
				<img src="img/hospital4.jpg" class="d-block w-100" alt="..."
					height="600px">
			</div>
			<div class="carousel-item">
				<img src="img/hospital2.jpg" class="d-block w-100" alt="..."
					height="600px">
			</div>
			<div class="carousel-item">
				<img src="img/hospital5.jpg" class="d-block w-100" alt="..."
					height="600px">
			</div>
		</div>
		<button class="carousel-control-prev" type="button"
			data-bs-target="#carouselExampleIndicators" data-bs-slide="prev">
			<span class="carousel-control-prev-icon" aria-hidden="true"></span> <span
				class="visually-hidden">Previous</span>
		</button>
		<button class="carousel-control-next" type="button"
			data-bs-target="#carouselExampleIndicators" data-bs-slide="next">
			<span class="carousel-control-next-icon" aria-hidden="true"></span> <span
				class="visually-hidden">Next</span>
		</button>
	</div>


	<!-- Another section is doctors and services  -->
	<!--  -->

	<div class="container p-3">
		<p class="text-center fs-2">Key features of our hospital</p>

		<div class="row">
			<div class="col-md-8 p-5">
				<div class="row">
					<div class="col-md-6">
						<div class="card paint-card">
							<div class="card-body">
								<p class="fs-5">100% safety</p>
								<p>lorem20 ispsum dollar set amit , cinsecuter adipiscinfg
									slit volumptattemn invteryt</p>
							</div>
						</div>
					</div>


					

					<div class="col-md-6">
						<div class="card paint-card">
							<div class="card-body">
								<p class="fs-5">Clean Enviroment</p>
								<p>lorem20 ispsum dollar set amit , cinsecuter adipiscinfg
									slit volumptattemn invteryt</p>
							</div>
						</div>
					</div>

					<div class="col-md-6 mt-2">
						<div class="card paint-card">
							<div class="card-body">
								<p class="fs-5">Friendly Doctors</p>
								<p>lorem20 ispsum dollar set amit , cinsecuter adipiscinfg
									slit volumptattemn invteryt</p>
							</div>
						</div>
					</div>

					<div class="col-md-6 mt-2">
						<div class="card paint-card">
							<div class="card-body">
								<p class="fs-5">Medical Research</p>
								<p>lorem20 ispsum dollar set amit , cinsecuter adipiscinfg
									slit volumptattemn invteryt</p>
							</div>
						</div>
					</div>



				</div>
			</div>


			<div class="col-md-4 mt-12">
				<img alt="" src="img/doctor1.jpg" height="450px" width="370px">
			</div>

		</div>

	</div>

	<hr>
	
	<!-- Team sections -->

	<div class="container-p2">
		<p class="text-center fs-2">Our Team</p>

		<div class="row">
			<div class="col-md-3">
				<div class="card paint-card">
					<div class="card-body text-center">
						<img alt="" src="img/doctor2.jpg" width="250px" height="300px">
						<p class="fw-bold fs-5">Samuni Simi</p>
						<p class="fs-7">(CEO & Chairman)</p>
					</div>
				</div>
			</div>
			
			<div class="col-md-3">
				<div class="card paint-card">
					<div class="card-body text-center">
						<img alt="" src="img/doctor3.jpg" width="250px" height="300px">
						<p class="fw-bold fs-5">Owen Shaw</p>
						<p class="fs-7">(Chief doctor)</p>
					</div>
				</div>
			</div>
			
			<div class="col-md-3">
				<div class="card paint-card">
					<div class="card-body text-center">
						<img alt="" src="img/doctor4.jpg" width="250px" height="300px">
						<p class="fw-bold fs-5">Devika Rawat</p>
						<p class="fs-7">(Chief doctor)</p>
					</div>
				</div>
			</div>
			
			<div class="col-md-3">
				<div class="card paint-card">
					<div class="card-body text-center">
						<img alt="" src="img/doctor5.jpg" width="250px" height="300px">
						<p class="fw-bold fs-5">Garvit Dabas</p>
						<p class="fs-7">(Chief doctor)</p>
					</div>
				</div>
			</div>
			
		</div>


	</div><br>






	<%@include file="component/footer.jsp"%>
</body>
</html>