<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Employee Registration Form</title>

<style>
.error {
	color: #ff0000;
}
</style>

</head>

<body>

	<h2>Role Creation Form</h2>

	<form:form method="POST" modelAttribute="role">
		<table>
			<tr>
				<td><label for="name">Role Name: </label></td>
				<td><form:input path="roleName" id="roleName" /></td>
				<td><form:errors path="roleName" cssClass="error" /></td>
			</tr>


			<tr>
				<td><label for="description">Description: </label></td>
				<td><form:input path="description" id="description" /></td>
				<td><form:errors path="description" cssClass="error" /></td>
			</tr>

			<tr>
				<td colspan="3"><input type="submit" value="Create Role" /></td>
			</tr>
		</table>
	</form:form>
	<br />
	<br /> Go back to
	<a href="<c:url value='/Role/list' />">List of All Roles</a>
</body>
</html>