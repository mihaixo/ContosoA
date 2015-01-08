<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Students</title>
		
		<style>
			tr:first-child{
				font-weight: bold;
				background-color: #C6C9C4;
			}
		</style>
	</head>
	<body>
		<h2>List of Students at Contoso University</h2>	
		<table>
			<tr>
				<td>Student ID</td>
				<td>First Name</td>
				<td>Last Name</td>
				<td>Enrollment Date</td>
				<td>Home Address ID</td>
			</tr>
			<c:forEach items="${students}" var="students">
				<tr>
				<td>${students.studentID}</td>
				<td>${students.lastName}</td>
				<td>${students.firstName}</td>
				<td>${students.enrollmentDate}</td>
				<td>${students.address.addressId}</td>
				</tr>
			</c:forEach>
		</table>
		<br/>
		<a href="<c:url value='/Student/save' />">Add New Student</a>
		<br /> Go back to
	<a href="<c:url value='/' />">Home</a>
	</body>
</html>