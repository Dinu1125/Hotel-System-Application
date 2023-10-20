<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.1/jquery.min.js"></script>

<style>
body {
	background-image: url("images/hotel2.jpg");
	background-size: 100%;
}

ul {
	list-style-type: none;
	margin: 0;
	padding: 0;
	overflow: hidden;
	background-color: #333;
}

li {
	float: left;
}

li a {
	display: block;
	color: white;
	text-align: center;
	padding: 18px 22px;
	font-size: 20px;
	text-decoration: none;
	font-family: Monospace;
}

li a:hover:not(.active) {
	background-color: red;
}

.active {
	background-color: red;
}

.rooms {
	width: 400px;
	height: 400px;
	background-color: white;
}

.table {
	width: 1500px;
	padding-left: 200px;
	padding-top: 80px;
}

h2 {
	font-family: Monospace;
	padding-left: 10px;
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
	padding: 10px;
	border-radius: 5px;
	width: 393.5px;
}

.button:hover:not(.active) {
	background-color: red;
	cursor: pointer;
}

.table2 {
	width: 1200px;
	padding-left: 420px;
	padding-top: 100px;
}
</style>

</head>
<body>

	<ul>
		<li><a href="Home.jsp" class="active">Home</a></li>
		<li><a href="AddRooms.jsp">Rooms</a></li>
		<li><a href="CustomerSelect.jsp">Customers</a></li>
		<li><a href="Report.jsp">Booking Report</a></li>
		<li><a href="#contact">About Us</a></li>
		
		<li style="float: right"><a href="#about">Log out</a></li>
	</ul>

	<table class="table">
		<tr>
			<td>
				<div class="rooms">
					<table>
						<tr>
							<td colspan="3"><img src="images/room_single.jpg"
								width="393px" height="200px"></td>
						</tr>

						<tr>
							<td><h2>Single Room</h2></td>


						</tr>
						<tr>
							<td style="width: 130px;"><h3>From $99</h3></td>
							<td style="width: 160px;"><h3>Single bed</h3></td>
							<td><h3>15m2</h3></td>
						</tr>

						<tr>
							<td colspan="3">
							<form action="customerform.jsp" method="post">
								<input type="hidden" id="roomType" name="roomType" value="Single">
								<input type="submit" class="button" value="Book Now">
							</form>
							</td>
						</tr>
						<tr>
							<td
								style="padding-left: 10px; color: black; font-family: monospace;">Available
								${AvlSingleRooms}</td>
						</tr>
					</table>
				</div>

			</td>
			<td>
				<div class="rooms">
					<table>
						<tr>
							<td colspan="3"><img src="images/room_double.jpg"
								width="393px" height="200px"></td>
						</tr>

						<tr>
							<td><h2>Double Room</h2></td>
						</tr>
						<tr>
							<td style="width: 130px;"><h3>From $149</h3></td>
							<td style="width: 160px;"><h3>Queen-size bed</h3></td>
							<td><h3>25m2</h3></td>
						</tr>
						<%-- <%
						String x = "Double Room";
						session.setAttribute("single", x);
						%> --%>
						<tr>
							<td colspan="3">
							<form action="customerform.jsp" method="post">
								<input type="hidden" id="roomType" name="roomType" value="Double">
								<input type="submit" class="button" value="Book Now">
							</form>
							</td>
						</tr>
						<tr>
							<td
								style="padding-left: 10px; color: black; font-family: monospace;">Available
								${AvlDoubleRooms}</td>
						</tr>
					</table>
				</div>

			</td>
			<td>
				<div class="rooms">
					<table>
						<tr>
							<td colspan="3"><img src="images/room_deluxe.jpg"
								width="393px" height="200px"></td>
						</tr>

						<tr>
							<td><h2>Deluxe Room</h2></td>
						</tr>
						<tr>
							<td style="width: 130px;"><h3>From $199</h3></td>
							<td style="width: 160px;"><h3>King-size bed</h3></td>
							<td><h3>40m2</h3></td>
						</tr>
						<tr>
							<td colspan="3">
							<form action="customerform.jsp" method="post">
								<input type="hidden" id="roomType" name="roomType" value="Deluxe">
								<input type="submit" class="button" value="Book Now">
							</form>
							</td>
						</tr>
						<tr>
							<td
								style="padding-left: 10px; color: black; font-family: monospace;">Available
								${AvlDeluxeRooms}</td>
						</tr>
					</table>
				</div>

			</td>
	</table>
	<table class="table2">
		<tr>
			<td>
				<div class="rooms">
					<table>
						<tr>
							<td colspan="3"><img src="images/hall1.jpg" width="393px"
								height="200px"></td>
						</tr>

						<tr>
							<td colspan="3"><h2>Deewan Banquet Hall</h2></td>
						</tr>
						<tr>
							<td style="width: 160px;"><h3>Per Hour-$15000</h3></td>
							<td style="width: 150px;"><h3>500 Peoples</h3></td>
							<td><h3>A/C</h3></td>
						</tr>
						<tr>
							<td colspan="3"><form action="customerform2.jsp" method="post">
								<input type="hidden" value="Deewan Banquet Hall" name="hallType">
								<input type="submit" class="button" value="Book Now">
							</form></td>
						</tr>

					</table>
				</div>

			</td>

			<td style="padding-left: 30px">
				<div class="rooms">
					<table>
						<tr>
							<td colspan="3"><img src="images/hall2.jpg" width="393px"
								height="200px"></td>
						</tr>

						<tr>
							<td colspan="3"><h2>Louvre Banquet Hall</h2></td>
						</tr>
						<tr>
							<td style="width: 160px;"><h3>Per Hour-$1000</h3></td>
							<td style="width: 150px;"><h3>300 peoples</h3></td>
							<td><h3>A/C</h3></td>
						</tr>
						<tr>
							<td colspan="3">
							<form action="customerform2.jsp" method="post">
								<input type="hidden" value="Louvre Banquet Hall" name="hallType">
								<input type="submit" class="button" value=" Book Now">
							</form>
							</td>
						</tr>

					</table>
				</div>

			</td>
	</table>
	
</body>
</html>