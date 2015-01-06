<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Enrollment Registration Form</title>

<style>
.error {
	color: #ff0000;
}
</style>

</head>

<body>

	<h2>Enrollment Creation Form</h2>

	<form:form method="POST" modelAttribute="enrollment">
		<table>
			<tr>
				<td><label for="courseId">Course ID: </label></td>
				<td><form:input path="courseId" id="courseId" /></td>
				<td><form:errors path="courseId" cssClass="error" /></td>
			</tr>
			<tr>
				<td><label for="studentId">Student ID: </label></td>
				<td><form:input path="studentId" id="studentId" /></td>
				<td><form:errors path="studentId" cssClass="error" /></td>
			</tr>

			<tr>
				<td colspan="3"><input type="submit" value="Create Enrollment" /></td>
			</tr>
		</table>
	</form:form>
	<br />
	<br /> Go back to
	<a href="<c:url value='/Enrollment/list' />">List of All Enrollments</a>
</body>
</html>