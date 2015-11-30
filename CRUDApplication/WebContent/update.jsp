<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<center>
		<form action="EmployeeServlet" method="post">
			<table>
				<tr>
					<td>EmployeeID</td>
					<td><input value="${employee.employeeId}" name="employeeId"  disabled="disabled"/> </td>
				</tr>
				<tr>
					<td>Employee Name</td>
					<td><input value="${employee.employeeName}" name="employeeName"/> </td>
				</tr>
				<tr>
					<td>Employee Contact</td>
					<td><input value="${employee.employeeContact}" name="employeeContact"/> </td>
				</tr>
				<tr>
					<td>Employee Address</td>
					<td><input value="${employee.employeeAddress}" name="employeeAddress"/> </td>
				</tr>
				<tr>
					<td colspan="2"><input type="submit" value="Update" name="button" > </td>
				</tr>
			</table>
		</form>
	</center>
</body>
</html>