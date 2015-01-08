<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>OnsiteCourses</title>


<style>
tr:first-child{
font-weight: bold;
background-color: #C6C9C4;
}
</style>
</head>
<body>
<h2>List of OnsiteCourses at Contoso University</h2>	
<table>
<tr>
<td>Onsite Course Id</td>
<td>Course Id</td>
<td>Location</td>
<td>Days</td>
<td>Time</td>


</tr>
<c:forEach items="${onsiteCourses}" var="onsiteCourse">
<tr>

<td>${onsiteCourse.onsiteCourseID}</td>
<td>${onsiteCourse.course.courseId}</td>
<td>${onsiteCourse.location}</td>
<td>${onsiteCourse.days}</td>
<td>${onsiteCourse.time}</td>




</tr>
</c:forEach>
</table>
<br/>
<a href="<c:url value='/OnsiteCourse/save' />">Add New OnsiteCourse</a>

<br /> Go back to
<a href="<c:url value='/' />">Home</a>
</body>
</html>