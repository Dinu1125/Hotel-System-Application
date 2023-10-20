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
	height: 500px;
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
				<form method="POST" action="CustomerAddservlert">
					<br> <br> <br> <br> <br> 
					<input type="hidden" value="<%=request.getParameter("roomType") %>" name="roomType"/>
				
					<label hidden id ="room"></label>
					<div class="rooms">
						<div class="progress">
							<div class="progress-bar progress-bar-success" role="progressbar"
								style="width: 35%">PERSONAL INFO</div>
							<div class="progress-bar progress-bar-warning" role="progressbar"
								style="width: 35%">BOOKING INFO</div>
							<div class="progress-bar progress-bar-danger" role="progressbar"
								style="width: 30%">PAYMENTS</div>
						</div>
						<table class="table">
							<tr>
							</tr>
							<tr>
								<td colspan="3">
									<h1>Personal Details</h1>
								</td>
							</tr>
							<tr>
								<td><input class="input" type="text"
									placeholder="First Name" id="fname" name="fname" size="50"
									required></td>
							</tr>
							<tr>
								<td><input class="input" type="text"
									placeholder="Last Name" id="lname" name="lname" size="50"
									required></td>
							</tr>
							<tr>
								<td><input class="input" type="text" placeholder="Email"
									id="email" name="email" size="50" required></td>
							</tr>
							<tr>
								<td><input class="input" type="number" placeholder="phone"
									id="phone" name="phone" size="50" required></td>

							</tr>

							<tr>
								<td><input class="input" type="text" placeholder="Address"
									id="address" name="address" size="50" required></td>
							</tr>
							<tr>
								<td><input class="input" type="number"
									placeholder="NIC (Without 'V' latter)" id="nic" name="nic"
									required></td>
							</tr>
							<tr>
								<td><input class="button" type="submit" id="submit"
									value="Next"></td>
							</tr>
							

						</table>
					</div>
				</form>
			</td>

		</tr>
	</table>


</body>
</html>

