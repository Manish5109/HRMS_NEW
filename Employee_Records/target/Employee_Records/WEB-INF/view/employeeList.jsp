<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Employee Detail</title>
</head>
<body>
	<table border="1">
	<tr  style="font-weight:bold">
		<td>Sequence</td>
		<td>Name</td>
    	<td>ID</td>
    	<td>Salary</td>
    	<td>Contact</td>
    	<td>Address</td>
    </tr>
  <c:forEach items="${list}" var="emp">

				<tr>
					<td><c:out value="${emp.sequence}" /></td>
					<td><c:out value="${emp.name}" /></td>
					<td><c:out value="${emp.id}" /></td>
					<td><c:out value="${emp.salary}" /></td>
					<td><c:out value="${emp.contact}" /></td>
					<td><c:out value="${emp.address}" /></td>
				</tr>
			</c:forEach>
		</table>
</body>
</html>