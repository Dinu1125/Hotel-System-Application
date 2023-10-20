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
	  font-size:20px;
	  text-decoration: none;
	  font-family: Monospace;
	}
	
	li a:hover:not(.active) {
	  background-color:  red;
	}
	
	.active {
	  background-color: red;
	}
	.rooms{
	  width: 400px;
	  height: 310px;
	  background-color: white;
	  
	}
	.table{
	  width: 1500px;
	  padding-left: 200px;
	  padding-top: 150px;
	}
	h2{
	 font-family: Monospace;
	 padding-left: 10px;	
	}
	h3{
	 font-family: Monospace;
	 padding-left: 25px;
	 color: gray;
	 padding-top: 0px;
	}
	.button{
		font-family: Monospace;
		background-color: black;
		color: white;
		border-radius: 5px;
		width:100px;
		height: 35px;
	}
	.button:hover:not(.active) {
	  background-color:  red;
	  cursor:pointer;
	}
	h1{
		font-family: Monospace;
	}
	.inputClass{
		height:20px;	
		border-color:red;
		border-radius: 2px;
	}
	td{
		padding-left: 50px;
	}
	
</style>
</head>
<body>

<ul>
  <li><a href="Home.jsp" >Home</a></li>
  <li><a href="AddRooms.jsp">Rooms</a></li>
  <li><a href="CustomerSelect.jsp" class="active">Customers</a></li>
  <li><a href="Report.jsp">Booking Report</a></li>
  <li><a href="#contact">About Us</a></li>
</ul>
<br><br><br><br><br>
<form action="ReportServlert" method="post">
<center><div class="rooms">
					<table style="padding-right: 40px">
						<tr>
							<td colspan="3"><center><h1>Room Booking Report</h1></center></td>
						</tr>
					
						<tr>
							<td><input class="inputClass" type="text" placeholder="Enter Month :" size="40" name="month" ></td>
						</tr>
						<tr>
							<td>
							<br>
								  <input class="button"  type="submit" value="Search">
                                
							</td>
						</tr>
						
						
					</table>						
</div></center>
</form>
<br><br>
<center>
<table  style="background-color: white; width:800px;" border="1">
	<tr>
		<th>Room Number</th><th>Room Type</th><th>Arrival</th><th>Departure</th><th>Nights</th>
	</tr>
	<c:forEach var="Booking" items="${Booking}">
	<tr>
		
		<td>${Booking.roomNumber}</td><td>${Booking.roomType}</td><td>${Booking.arrival}</td><td>${Booking.departure}</td><td>${Booking.nights}</td>
		
	</tr>
	</c:forEach>						    
								
	
</table>
</center>


</body>
</html>