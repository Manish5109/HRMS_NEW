<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Employee List</title>

<script src="js/jquery-3.2.1.min.js"></script>

<script type="text/javascript">
	$(document).ready(function() {
		$(".deleteBtn").click(function() {
			var value = confirm("Do you want to delete");
			if (value) {
				var x = $(this).data("id");
				var btn = $(this);
				$.ajax({
					method : "GET",
					url : "deleteReg",
					data : {
						"id" : x
					}
				}).done(function(json) {
					btn.parent().parent().remove();
					/*	$('#emp_table tbody').empty();
					$.each(json, function(i, item) {
						$('#emp_table tbody').last().append("<tr><td>"+item.id+"</td><td>"+item.fname+"</td><td>"+item.lname+"</td><td>"+item.salary+"</td><td>"+item.dob+"</td><td>"+item.doj+"</td><td>"+item.user+"</td><td>"+item.password+"</td><td><a href='editReg?id="+item.id+"'>EDIT</a></td><td><input type='button' name='delete' data-id='"+item.id+"' value='Delete' class='deleteBtn' /></td></tr>");
						
						console.log("record done");
					});
					 */
				});
			}

		});
	});
</script>
</head>
<body>
	<%@include file="/WEB-INF/view/logout.jsp"%>
	<table border="1" id="emp_table">
		<thead>
			<tr style="font-weight: bold">
				<td>ID</td>
				<td>FIRST Name</td>
				<td>LAST NAME</td>
				<td>SALARY</td>
				<td>DOB</td>
				<td>DOj</td>
				<td>USER</td>
				<td>PASSWORD</td>
				<td>UPDATE</td>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${list}" var="emp">

				<tr>
					<td><c:out value="${emp.id}" /></td>
					<td><c:out value="${emp.fname}" /></td>
					<td><c:out value="${emp.lname}" /></td>
					<td><c:out value="${emp.salary}" /></td>
					<td><c:out value="${emp.dob}" /></td>
					<td><c:out value="${emp.doj}" /></td>
					<td><c:out value="${emp.user}" /></td>
					<td><c:out value="${emp.password}" /></td>
					<td><a href="editReg?id=${emp.id}">EDIT</a></td>
					<!--  <td><a href="deleteReg?id=${emp.id}">DELETE</a></td>-->
					<td><input type="button" class="deleteBtn" name="delete"
						data-id="${emp.id}" value="Delete" /></td>
				</tr>

			</c:forEach>
		</tbody>
	</table>
</body>
</html>