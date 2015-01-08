<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Courses</title>


<style>
tr:first-child{
font-weight: bold;
background-color: #C6C9C4;
}
</style>
</head>
<body>
<h2>List of Courses at Contoso University</h2>	
<table>
<tr>

<td>Course Id</td>
<td>Name</td>
<td>Description</td>
<td>Credits</td>
<td>Department Id</td>
<td>Instructor Id</td>

</tr>
<c:forEach items="${courses}" var="course">
<tr>

<td>${course.courseId}</td>
<td>${course.courseName}</td>
<td>${course.courseDescription}</td>
<td>${course.credits}</td>
<td>${course.department.departmentId}</td>
<td>${course.instructor.instructorID}</td>

</tr>
</c:forEach>
</table>
<br/>
<a href="<c:url value='/Course/save' />">Add New Course</a>

<br /> Go back to
<a href="<c:url value='/' />">Home</a>
</body>
</html>