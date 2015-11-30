<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>

<body>
	<center>
		<h2>${message}</h2>
		<h1>List of Employees</h1> 
		<form method="get" action="EmployeeServlet">
			<table>
				<tr>
					<td>***</td>
					<td>Employee Id</td>
					<td>Employee Name</td>
					<td>Employee Contact</td>
					<td>Employee Address</td>
				</tr>
				<c:forEach var="employee" items="${employees}">
					<tr>
						<td><input type="checkbox" name="delete" value="${employee.employeeId}">
						<td>${employee.employeeId}</td>
						<td>${employee.employeeName}</td>
						<td>${employee.employeeContact}</td>
						<td >${employee.employeeAddress}</td>
					</tr>
				</c:forEach>
					<tr>
						<td><input type="submit" value="Delete" name ="button"></td>
						<td colspan="2"><input type="submit" value="Add" name ="button" />  </td>
						<td colspan="2"><input type="submit" value="Update" name ="button" />  </td>
					</tr>
			</table>
		</form>
	
	</center>
</body>
</html>