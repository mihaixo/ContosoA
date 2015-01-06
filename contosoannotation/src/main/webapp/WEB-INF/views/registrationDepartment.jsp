<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Department Registration Form</title>

<style>
.error {
	color: #ff0000;
}
</style>

</head>

<body>

	<h2>Department Creation Form</h2>

	<form:form method="POST" modelAttribute="department">
		<table>
			<tr>
				<td><label for="name">Department Name: </label></td>
				<td><form:input path="name" id="name" /></td>
				<td><form:errors path="name" cssClass="error" /></td>
			</tr>
			<tr>
				<td><label for="budget">Budget: </label></td>
				<td><form:input path="budget" id="budget" /></td>
				<td><form:errors path="budget" cssClass="error" /></td>
			</tr>
			<tr>
				<td><label for="startDate">Start Date: </label></td>
				<td><form:input path="startDate" id="startDate" /></td>
				<td><form:errors path="startDate" cssClass="error" /></td>
			</tr>
			<tr>
				<td><label for="administratorId">Start Date: </label></td>
				<td><form:input path="administratorId" id="administratorId" /></td>
				<td><form:errors path="administratorId" cssClass="error" /></td>
			</tr>

			<tr>
				<td colspan="3"><input type="submit" value="Create Department" /></td>
			</tr>
		</table>
	</form:form>
	<br />
	<br /> Go back to
	<a href="<c:url value='/Department/list' />">List of All Departments</a>
</body>
</html>