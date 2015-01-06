<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Course Registration Form</title>

<style>
.error {
	color: #ff0000;
}
</style>

</head>

<body>

	<h2>Course Creation Form</h2>

	<form:form method="POST" modelAttribute="course">
		<table>
			<tr>
				<td><label for="name">Course Name: </label></td>
				<td><form:input path="courseName" id="courseName" /></td>
				<td><form:errors path="courseName" cssClass="error" /></td>
			</tr>
			<tr>
				<td><label for="description">Description: </label></td>
				<td><form:input path="courseDescription" id="courseDescription" /></td>
				<td><form:errors path="courseDescription" cssClass="error" /></td>
			</tr>
			<tr>
				<td><label for="credits">Credits: </label></td>
				<td><form:input path="credits" id="credits" /></td>
				<td><form:errors path="credits" cssClass="error" /></td>
			</tr>
			<tr>
				<td><label for="departmentId">Department ID: </label></td>
				<td><form:input path="departmentId" id="departmentId" /></td>
				<td><form:errors path="departmentId" cssClass="error" /></td>
			</tr>
			<tr>
				<td><label for="instructorId">Instructor ID: </label></td>
				<td><form:input path="instructorId" id="instructorId" /></td>
				<td><form:errors path="instructorId" cssClass="error" /></td>
			</tr>

			<tr>
				<td colspan="3"><input type="submit" value="Create Course" /></td>
			</tr>
		</table>
	</form:form>
	<br />
	<br /> Go back to
	<a href="<c:url value='/Course/list' />">List of All Courses</a>
</body>
</html>