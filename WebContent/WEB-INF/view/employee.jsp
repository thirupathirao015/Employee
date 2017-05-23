<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Add employee</h1>

<a href="listemp">Show All Employee</a>

<form:form modelAttribute="employee" action="saveemployee" method="post" commandName="employee">
<table>

  <tr>
       <td> <form:label path="ename">Employee name:<font color="red"><form:errors path="ename" /></font></form:label></td>
 </tr>
 <tr>
          <td><form:input path="ename" /></td>
         
 </tr>
	
	<tr>
	     <td><form:label path="salary">employee salary:</form:label><br></td>
	</tr>
	<tr>
	<td><form:input path="salary"/></td>
	</tr>
	<tr>
    <td><input type="submit" value="submit"></td>
    </tr>
</table>
</form:form>

<%-- <form:form modelAttribute="employee" method="POST" action="saveemployee">
	<form:label path="Ename">employee Name:</form:label>
	<form:input path="Ename" />
	<br />
	<form:label path="salary">employee salary:</form:label>
	<form:textarea path="salary" />
	<br />
	<input type="submit" value="Save employee" />
</form:form> --%>
</body>
</html>