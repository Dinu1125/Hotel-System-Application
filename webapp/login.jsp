<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>

<link rel="stylesheet" type="text/css" href="Styles/signin.css">
<script type="text/javascript" src="js/login.js"></script>
<style>
body {
	background-image: url("images/hotel2.jpg");
	background-size: 100%;
}
</style>
</head>
<body>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	
	<table class="table" width="30%" border="0">
		<tr>
			<td>

				<center>
					<div class="login">
						<img src="logos/userred.png" class="ulogo">


						<table>
							<form method="POST" action="loginServlet">
								<tr>
									<td><center>
											<h1 class="logintext">Login</h1>
										</center></td>
								</tr>

								<!--email-->
								<tr>
									<td><label class="logintext" for="fname">User ID</lable></td>
								</tr>
								<tr>
									<td><input class="inputlogin" placeholder="User ID"
										type="text" name="userID" size="50" required><br>
									<div class="error" id="mail"></div></td>
								</tr>

								<!--password-->
								<tr>
									<td><label class="logintext" for="pwd">Password</lable></td>
								</tr>
							<tr>
								<td><input class="inputlogin" type="password"
									placeholder="Password" id="password" name="password" size="50"
									required><br>
								<div class="error" id="pas"></div>
									<br></td>
							</tr>


							<tr>
								<td><center>
										<input class="button" name="btn_submit" type="submit"
											value="Login">
									</center></td>
							</tr>


							</form>
						</table>

					</div>
				</center>
			</td>
		</tr>
	</table>

</body>
</html>