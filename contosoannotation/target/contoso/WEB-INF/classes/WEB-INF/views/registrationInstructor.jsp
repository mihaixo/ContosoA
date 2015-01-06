<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Instructor Registration Form</title>

<style>
.error {
	color: #ff0000;
}
</style>

</head>

<body>

	<h2>Instructor Creation Form</h2>

	<form:form method="POST" modelAttribute="instructor">
		<table>
			<tr>
				<td><label for="firstName">Instructor First Name: </label></td>
				<td><form:input path="firstName" id="firstName" /></td>
				<td><form:errors path="firstName" cssClass="error" /></td>
			</tr>


			<tr>
				<td><label for="lastName">Instructor Last Name: </label></td>
				<td><form:input path="lastName" id="lastName" /></td>
				<td><form:errors path="lastName" cssClass="error" /></td>
			</tr>
			
			<tr>
				<td><label for="gender">Gender: </label></td>
				<td><form:input path="Gender" id="Gender" /></td>
				<td><form:errors path="Gender" cssClass="error" /></td>
			</tr>
			
			<tr>
				<td><label for="hiredDate">Hired Date: </label></td>
				<td><form:input path="hiredDate" id="hiredDate" /></td>
				<td><form:errors path="hiredDate" cssClass="error" /></td>
			</tr>

			<tr>
				<td colspan="3"><input type="submit" value="Create Instructor" /></td>
			</tr>
		</table>
	</form:form>
	<br />
	<br /> Go back to
	<a href="<c:url value='/Instructor/list' />">List of All Instructors</a>
</body>
</html>