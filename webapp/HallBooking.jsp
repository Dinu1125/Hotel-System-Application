<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<style>
body {
	background-image: url("images/hotel2.jpg");
}

.rooms {
	width: 1000px;
	height: 550px;
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
<script type="text/javascript">
function codeAddress() {
	document.getElementById("room").innerHTML = localStorage.getItem("serialNumber");
	
	
}
window.onload = codeAddress;

</script>
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
				<form method="POST" action="HallBookingServlert">
					<br> <br> <br> <br> <br>


					<div class="rooms">
						<div class="progress">
							<div class="progress-bar progress-bar-success" role="progressbar"
								style="width: 35%">PERSONAL INFO</div>
							<div class="progress-bar progress-bar-success" role="progressbar"
								style="width: 35%">BOOKING INFO</div>
							<div class="progress-bar progress-bar-warning" role="progressbar"
								style="width: 30%">PAYMENTS</div>
						</div>
						<table class="table">
							<tr>
							</tr>
							<tr>
								<td colspan="3">
									<h1>Booking Details</h1>
									<h2>Hall Type - <label ><%=request.getParameter("hallType") %></label></h2>
								</td>
							</tr>	
							<tr>
						
								<tr>
								<td><input class="input" type="number" placeholder="Number of Guests"
									id="nights" name="guests" size="50" required></td>

							</tr>						
							<tr>
								<td><input class="input" placeholder="Date"
									 type="text" onfocus="(this.type='date')"
									name="date" required></td>
							</tr>
							<tr>
								<td><input class="input" placeholder="Time"
									type="datetime" onfocus="(this.type='time')"
									name="time" required></td>
							</tr>

							<tr>
								<td><input class="input" type="number" placeholder="Number of hours"
									 name="hours" size="50" required></td>

							</tr>
						

							<tr>
								<td><input class="button" type="submit" id="submit"
									value="Next"></td>
							</tr>
							<tr>
							<input type="hidden" value="<%=request.getParameter("hallType") %>" name="hallType">
						
							<input type="hidden" value="<%=request.getParameter("nic") %>" name="nic"/>
						</table>
					</div>
				</form>
			</td>

		</tr>
	</table>



</body>
</html>

