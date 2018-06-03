<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Employee Profile Save</title>
</head>
<body>
<form action="saveProfile" method="post">
	<table border ="1">
		<tr>
			<td>Employee ID :</td>
			<td> <input type="text" name="empid" id="empid"/></td>
			<td>Employee Name : </td>
			<td><input type="text" name="empname" id="empname"/></td>
		</tr>
		<tr>
			<td>Department ID : </td>
			<td><input type="text" name="deptid" id="deptid"/></td>
			<td>Department Name:</td>
			<td><input type="text" name="deptname" id="deptname"/></td>
		</tr>
		<tr>
			<td>Employee Type :</td>
			<td><select>
			<option>Parmanent</option>
			<option>Contract</option>
			</select></td>
			<td>Designation : </td>
			<td><input type="text" name="designation" id="designation"/></td>
		</tr>
		<tr>
			<td>City : </td>
			<td><select>
			<option value="101">Gurgaon</option>
			<option value="102">Noida</option>
			<option value="103">New Delhi</option>
			</select></td>
			<td>Branch ID : </td>
			<td><input type="text" name="branchid" id="branchid"/></td>
		</tr>
		<tr>
			<td>Branch Name : </td>	
			<td><select>
			<option value="Tower A">Tower A</option>
			<option value="Tower B">Tower B</option>
			<option value="Tower C">Tower C</option>
			<option value="Tower D">Tower D</option>
			</select></td>
			<td>Department ID: </td>
			<td><input type="text" name="deptid" id="deptid"/></td>
		</tr>
		<tr>
				<td>Department Name : </td>
				<td><input type="text" name="deptname" id="deptname"/></td>
				<td>Date Of Birth : </td>
				<td><input type="date" name="dob" id="dob"/></td>
		</tr>
		<tr>
			<td>Date Of Joining : </td>
			<td><input type="date" name="doj" id="doj"/></td>
			<td>Govt ID Type : </td>
			<td><select>
			<option>Adhar Card</option>
			<option>Passport</option>
			<option>Voter ID</option>
			<option>PAN Card</option>
			<option>Driving Licence</option>
			</select></td>
		</tr>
		<tr>
			<td>Govt ID No: </td>
			<td><input type="text" name="govtidno" id="govtidno"/></td>
			<td><input type="radio" name="gender"  value ="male" id="male"/> Male</td>
			<td><input type="radio" name="gender" value ="female" id="female"/> Female</td>
	</tr>
	<tr>
		<td><input type="submit" name="submit" value="Submit" /></td>
		<td><input type="reset" name="clear" value="clear" /></td>
	</tr>
</table>
</form>
</body>
</html>