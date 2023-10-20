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
<form action="ViewCustomerServlert" method="post">
<center><div class="rooms">
					<table>
						<tr>
							<td colspan="3"><center><h1>Search Customer Details</h1></center></td>
						</tr>
					
						<tr>
							<td><input class="inputClass" type="text" placeholder="Enter NIC Number (Without V Latter)" size="40" name="nic" required></td>
						</tr>
						<tr>
							<td>
							<br>
								  <input class="button" type="submit" value="Search">
                                
							</td>
						</tr>
						</form>
						<c:forEach var="customer" items="${customer}">
						
						<tr><td><br>Name - ${customer.fname} ${customer.lname}</td></tr>
						
						<tr><td>Address - ${customer.address}</td></tr>
						<tr><td>Phone - ${customer.phone}</td></tr>
						</c:forEach>
					</table>						
</div></center>

</body>
</html>