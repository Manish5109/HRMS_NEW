<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Employee Login</title>
</head>
<body>
	<form action="login" method="post">
		<table border="1">
			<tr>
				<td>User Name</td>
				<td><input type="text" name="uname" /></td>
			</tr>

			<tr>
				<td>Password</td>
				<td><input type="password" name="pwd" /></td>
			</tr>
			<tr>
				<td><input type="reset" name="reset" value="Clear" /></td>
				<td><input type="submit" name="submit" value="Submit" /></td>
			</tr>
		</table>
	</form>
	<form action="registrationSave" method="post">
		<table>
			<tr>
				
				<td><input type="submit" name="submit" value="Create User" /></td>
			</tr>
		</table>
	</form>
</body>
</html>