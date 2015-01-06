<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home Page</title>
</head>
<body>
<h1>Home Page!</h1>
<p><a href="<c:url value='/Address/list' />">Address</a></p>
<p><a href="<c:url value='/Administrator/list' />">Administrator</a></p>
<p><a href="<c:url value='/Course/list' />">Course</a></p>
<p><a href="<c:url value='/Department/list' />">Department</a></p>
<p><a href="<c:url value='/Enrollment/list' />">Enrollment</a></p>
<p><a href="<c:url value='/Instructor/list' />">Instructor</a></p>
<p><a href="<c:url value='/OnlineCourse/list' />">OnlineCourse</a></p>
<p><a href="<c:url value='/OnsiteCourse/list' />">OnsiteCourse</a></p>
<p><a href="<c:url value='/Role/list' />">Role</a></p>
<p><a href="<c:url value='/Student/list' />">Student</a></p>
<p><a href="<c:url value='/User/list' />">User</a></p>
</body>
</html>