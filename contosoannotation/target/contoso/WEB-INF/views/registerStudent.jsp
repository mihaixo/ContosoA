<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student Registration Form</title>

<style>
.error {
	color: #ff0000;
}
</style>
</head>
<body>
<h2>Student Creation Form</h2>

	<form:form method="POST" modelAttribute="student">
		<table>
			<tr>
				<td><label for="lastName">Last Name: </label></td>
				<td><form:input path="lastName" id="lastName" /></td>
				<td><form:errors path="lastName" cssClass="error" /></td>
			</tr>


			<tr>
				<td><label for="firstName">First Name: </label></td>
				<td><form:input path="firstName" id="firstName" /></td>
				<td><form:errors path="firstName" cssClass="error" /></td>
			</tr>
			
			<tr>
				<td><label for="address">Home Address ID: </label></td>
				<td><form:input path="address" id="address" /></td>
				<td><form:errors path="address" cssClass="error" /></td>
			</tr>

			<tr>
				<td colspan="3"><input type="submit" value="Create Student" /></td>
			</tr>
		</table>
	</form:form>
	<br />
<br /> Go back to
	<a href="<c:url value='/Student/list' />">List of All Students</a>

</body>
</html>