<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false"%>
<%@include file="/WEB-INF/view/logout.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration Page</title>
</head>
<body>
	<form action="registrationSave" method="post">
		<c:if test="${emp != null}">
			<input type="hidden" name="editFlag" value="true">
		</c:if>
		<table border="1">
			<tr>
				<td>First Name</td>
				<td><input type="text" name="fname" value="${emp.fname}" /></td>
				<td>Last Name</td>
				<td><input type="text" name="lname" value="${emp.lname}" /></td>
			</tr>
			<tr>
				<td>Employee ID</td>
				<td><input type="text" name="id" id="id" value="${emp.id}" /></td>
				<td>Salary</td>
				<td><input type="text" name="salary" id="salary"
					value="${emp.salary}" /></td>
			</tr>
			<tr>
				<td>DOB</td>
				<td><input type="date" name="dob" id="dob" value="${emp.dob}" /></td>
				<td>DOJ</td>
				<td><input type="date" name="doj" id="doj" value="${emp.doj}" /></td>
			</tr>
			<tr>
				<td>User Name</td>
				<td><input type="text" name="uname" value="${emp.user}" /></td>
				<td>Password</td>
				<td><input type="password" name="pwd" value="${emp.password}" /></td>
			</tr>

			<tr>
				<td>Photo</td>
				<td><input type="file" name="photo" id="photo" /></td>
				<td><input type="reset" name="clear" value="Clear" /></td>
				<td><input type="submit" name="submit" value="Submit" /></td>
			</tr>
		</table>
	</form>
</body>
</html>