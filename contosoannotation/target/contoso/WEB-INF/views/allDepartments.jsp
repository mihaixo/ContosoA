<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Departments</title>


<style>
tr:first-child{
font-weight: bold;
background-color: #C6C9C4;
}
</style>
</head>
<body>
<h2>List of Departments at Contoso University</h2>	
<table>
<tr>


<td>Department Id</td>
<td>Name</td>
<td>Budget</td>
<td>Start Date</td>
<td>Administrator Id</td>


</tr>
<c:forEach items="${departments}" var="department">
<tr>

<td>${department.departmentId}</td>
<td>${department.name}</td>
<td>${department.budget}</td>
<td>${department.startDate}</td>
<td>${department.administratorId.administratorId}</td>



</tr>
</c:forEach>
</table>
<br/>
<a href="<c:url value='/Department/save' />">Add New Department</a>

<br /> Go back to
<a href="<c:url value='/' />">Home</a>
</body>
</html>