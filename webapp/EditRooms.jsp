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
	  height: 250px;
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
  <li><a href="Home.jsp">Home</a></li>
  <li><a href="AddRooms.jsp" > Add Rooms</a></li>
  <li><a href="SelectEdit.jsp" class="active">Edit Rooms</a></li>
  <li style="float:right"><a  href="#about">Log out</a></li>
</ul>
<br><br><br>
<form action="UpdateRoomServlert" method="post">

<c:forEach var="Rooms" items="${Rooms}">
<center><div class="rooms">
					<table>
						<tr>
							<td colspan="3"><center><h1>Edit Rooms</h1></center></td>
						</tr>
					
						<tr>
							<td><input class="inputClass" type="text" placeholder="Room Number" name="roomID" value="${Rooms.roomID}" size="40"	required></td>
						</tr>
						<tr>
							<td>
								
								  <label style="font-family: monospace;font-size: 16px;">Room Type:</label>
								  <select class="inputClass" name="roomType">
								    <option value="Single">Single</option>
								    <option  value="Double">Double</option>
								    <option value="Deulxe">Deulxe</option>
								  </select>
								 
							</td>
							
						</tr>
						<tr>
							<td>
								
								  <label style="font-family: monospace;font-size: 16px;">Room Availability:</label>
								  <select class="inputClass" name="status">
								    <option value="available">Available</option>
								    <option  value="unavailable">Unavailable</option>
								  </select>
								  <br><br>
								  <input class="button" type="submit" value="UPDATE">
                                
							</td>
							
						</tr>
					</table>						
</div></center>
</c:forEach>
</form>
</body>
</html>