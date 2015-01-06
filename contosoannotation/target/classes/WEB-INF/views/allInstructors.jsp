<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Instructors</title>


<style>
tr:first-child{
font-weight: bold;
background-color: #C6C9C4;
}
</style>
</head>
<body>
<h2>List of Instructors at Contoso University</h2>	
<table>
<tr>
<td>Instructor Id</td>
<td>First Name</td>
<td>Last Name</td>
<td>Gender</td>


</tr>
<c:forEach items="${instructors}" var="instructor">
<tr>
<td>${instructor.instructorID}</td>
<td>${instructor.firstName}</td>
<td>${instructor.lastName}</td>
<td>${instructor.gender}</td>


</tr>
</c:forEach>
</table>
<br/>
<a href="<c:url value='/Instructor/save' />">Add New Instructor</a>

<br /> Go back to
<a href="<c:url value='/' />">Home</a>
</body>
</html>