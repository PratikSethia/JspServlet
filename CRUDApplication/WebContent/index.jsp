<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 
 <%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center>
	<form method="post" action="EmployeeServlet">
		<table>
			
			<tr>
				<td>Name</td>
				<td><input type="text" name="employeeName"> </td>
			</tr>
			<tr>
				<td>Contact</td>
				<td><input type="text" name="employeeContact"> </td>
			</tr>
			<tr>
				<td>Address</td>
				<td><input type="text" name="employeeAddress"> </td>
			</tr>
			<tr>
				<td><input type="submit" value="Save" name="button" > </td>
				<td><input type="submit" value="Show Details"  name ="button"> </td>
			</tr>
		</table>
	

	</form>
	
	
	
</center>
</body>
</html>