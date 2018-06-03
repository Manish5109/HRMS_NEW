<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Study and Testing</title>
</head>
<body>
	<form action="study_save">
		<table border="1">
			<tr>
				<td>Enter ID</td>
				<td><input type="text" name="id" /></td>
			</tr>
			<tr>
				<td>Enter Date</td>
				<td><input type="date" name="udate" /></td>
			</tr>
			<tr>
				<td>Enter Timestamp</td>
				<td><input type="date" name="udatetime" id="datetime" /></td>
			</tr>
			<tr>
				<td>Enter Text</td>
				<td><input type="text" name="text" /></td>
			</tr>
			<tr>
				<td><input type="reset" name="clear" value="clear" /></td>
				<td><input type="submit" name="submit" value="submit" /></td>
			</tr>
		</table>
	</form>
</body>
</html>