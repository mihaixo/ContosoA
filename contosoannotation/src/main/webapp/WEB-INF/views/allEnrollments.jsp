<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Enrollments</title>


<style>
tr:first-child{
font-weight: bold;
background-color: #C6C9C4;
}
</style>
</head>
<body>
<h2>List of Enrollments at Contoso University</h2>	
<table>
<tr>
<td>Enrollment Id</td>
<td>Course Id</td>
<td>Student Id</td>
<td>Grade</td>



</tr>
<c:forEach items="${enrollments}" var="enrollment">
<tr>
<td>${enrollment.enrollmentId}</td>
<td>${enrollment.course.courseId}</td>
<td>${enrollment.student.studentID}</td>
<td>${enrollment.grade}</td>

</tr>
</c:forEach>
</table>
<br/>
<a href="<c:url value='/Enrollment/save' />">Add New Enrollment</a>

<br /> Go back to
<a href="<c:url value='/' />">Home</a>
</body>
</html>