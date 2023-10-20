<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<style>
body {
	background-image: url("images/hotel2.jpg");
	background-size: 100%;
}

.rooms {
	width: 1000px;
	height: 380px;
	background-color: black;
	margin-left: auto;
	margin-right: auto;
	padding: 10px;
	
}

.table {
	width: 100%;
	padding-top: 150px;
	text-align: center;
}

h2, h1 {
	font-family: Monospace;
	padding-left: 10px;
	text-align: center;
}

h3 {
	font-family: Monospace;
	padding-left: 25px;
	color: gray;
	padding-top: 0px;
}

.button {
	font-family: Monospace;
	background-color: black;
	color: white;
	border-radius: 5px;
	width: 100px;
	height: 40px;
}

.button:hover:not(.active) {
	background-color: red;
	cursor: pointer;
}

input {
	height: 30px;
	border-color: red;
	width: 500px;

}
</style>

<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>
	<table class="table">
	
		<tr>
			<td id="personal">
				
					<br> <br> <br> <br> <br>
					
					<div class="rooms">
					<div class="progress">
								<div class="progress-bar progress-bar-success"
									role="progressbar" style="width: 35%">PERSONAL INFO</div>
								<div class="progress-bar progress-bar-success"
									role="progressbar" style="width: 35%">BOOKING INFO</div>
								<div class="progress-bar progress-bar-success" role="progressbar"
									style="width: 30%">PAYMENTS</div>
							</div>		
							
							<input type="hidden" value="<%=request.getParameter("roomType") %>" name="roomType">				
						<table class="table">																		
							<tr>
							</tr>
							<tr>
								<td colspan="3">
									<h1>Payment Details</h1>
								</td>
							</tr>
							<tr>
								<td>Room Type : <%=request.getParameter("roomType") %></td>
							</tr>
							<tr>
								<td>Number of nights :<%=request.getParameter("nights") %></td>
							</tr>
							<tr>
								<td style="font-size: 30px">$${price}</td>

							</tr>
						
							<tr>
								
								<form action="Home.jsp" method="post">
								<td>
								<input class="button" type="submit" id="submit"
									value="OK">
									</td>
								</form>
							</tr>

						</table>
					</div>
				
			</td>

		</tr>
	</table>



</body>
</html>

