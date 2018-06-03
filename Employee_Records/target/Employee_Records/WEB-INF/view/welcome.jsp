<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Employee</title>
</head>
<body>
	<form action="registration">
		<table border="1">
			<tr>
				<td>Create Employee Records</td>
				<td><input type="submit" name="submit" value="Create" /></td>
			</tr>
		</table>
	</form>
		<form action="employeeList" method="post">
		<table border="1">
			<tr>
				<td>Show Employee Records</td>
				<td><input type="submit" name="submit" value="Show" /></td>
			</tr>
		</table>
	</form>
</body>
</html>