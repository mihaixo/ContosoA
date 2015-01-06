<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>User Registration Form</title>

<style>
.error {
	color: #ff0000;
}
</style>

</head>

<body>

	<h2>User Creation Form</h2>

	<form:form method="POST" modelAttribute="user">
		<table>
			<tr>
				<td><label for="name">User Name: </label></td>
				<td><form:input path="userName" id="userName" /></td>
				<td><form:errors path="userName" cssClass="error" /></td>
			</tr>
			<tr>
				<td><label for="passwordHash">Password Hash: </label></td>
				<td><form:input path="passwordHash" id="passwordHash" /></td>
				<td><form:errors path="passwordHash" cssClass="error" /></td>
			</tr>
			<tr>
				<td><label for="passwordSalt">Password Salt: </label></td>
				<td><form:input path="passwordSalt" id="passwordSalt" /></td>
				<td><form:errors path="passwordSalt" cssClass="error" /></td>
			</tr>
			<tr>
				<td><label for="email">Email: </label></td>
				<td><form:input path="email" id="email" /></td>
				<td><form:errors path="email" cssClass="error" /></td>
			</tr>

			<tr>
				<td colspan="3"><input type="submit" value="Create User" /></td>
			</tr>
		</table>
	</form:form>
	<br />
	<br /> Go back to
	<a href="<c:url value='/User/list' />">List of All Users</a>
</body>
</html>