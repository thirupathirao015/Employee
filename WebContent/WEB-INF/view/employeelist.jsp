<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>List Employee</h1>
<a href="addemp">Add Employee</a>

<c:if test="${!empty employee}">
	<table border="2">
		<tr>
			<th>Employee ID</th>
			<th>Employee Name</th>
			<th>Employee salary</th>
			<th>Added Date</th>
		</tr>

		 <c:forEach items="${employee}" var="employee">
			<tr>
				  <td><c:out value="${employee.empid}"/></td>  
				 <td><c:out value="${employee.ename}"/></td> 
				 <td><c:out value="${employee.salary}"/></td> 
				<td><c:out value="${employee.addeddate}"/></td>  
			</tr>
		</c:forEach> 
	</table>
</c:if> 
</body>
</html>