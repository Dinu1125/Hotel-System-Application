<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<style type="text/css">
	body {
	background-image: url("images/hotel2.jpg");
	background-size: 100%;
}

.start{
	background: rgb(0, 0, 0);
	background: rgba(0, 0, 0, 0.6); 
	transform:translate(110%,10%);
	width:550px;
	color: white;
	font-size:30px;
	padding-left: 100px;
	padding-right: 100px;
	padding-top: 40px;
	padding-bottom: 40px;
	
	

}
</style>

</head>
<body>
<br><br><br><br><br><br><br><br><br><br><br><br>
	<form action="AvlRoomsServlet" method="post">
		<input class="start" type="submit" value="Get Strated">
	</form>
</body>
</html>