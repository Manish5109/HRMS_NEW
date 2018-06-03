<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration Form</title>
</head>
<body>
	${msg}
	<form action="regSubmit" method="post">
		<table border="1">
			<tr>
				<td>Employee Name</td>
				<td><input type="text" name="empName" id="empName" /></td>
			</tr>
			<tr>
				<td>Employee ID</td>
				<td><input type="text" name="empId" id="empId" /></td>
			</tr>
			<tr>
				<td>Employee Salary</td>
				<td><input type="text" name="empSalary" id="empSalary" /></td>
			</tr>
			<tr>
				<td>Employee Contact</td>
				<td><input type="text" name="empContact" id="empContact" /></td>
			</tr>
			<tr>
				<td>Employee Address</td>
				<td><input type="text" name="empAddress" id="empAddress" /></td>
			</tr>

			<tr>
				<td><input type="reset" name="reset" value="Rest" /></td>
				<td><input type="submit" name="reset" value="Submit" /></td>
			</tr>
		</table>
	</form>
</body>
</html>