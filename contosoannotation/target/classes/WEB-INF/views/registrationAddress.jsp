<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Address Registration Form</title>

<style>
.error {
	color: #ff0000;
}
</style>

</head>

<body>

	<h2>Address Creation Form</h2>

	<form:form method="POST" modelAttribute="address">
		<table>
			<tr>
				<td><label for="name">Street: </label></td>
				<td><form:input path="street" id="street" /></td>
				<td><form:errors path="street" cssClass="error" /></td>
			</tr>


			<tr>
				<td><label for="city">City: </label></td>
				<td><form:input path="city" id="city" /></td>
				<td><form:errors path="city" cssClass="error" /></td>
			</tr>
			
			<tr>
				<td><label for="country">Country: </label></td>
				<td><form:input path="country" id="country" /></td>
				<td><form:errors path="country" cssClass="error" /></td>
			</tr>
			
			<tr>
				<td><label for="zipcode">Zipcode: </label></td>
				<td><form:input path="zipcode" id="zipcode" /></td>
				<td><form:errors path="zipcode" cssClass="error" /></td>
			</tr>

			<tr>
				<td colspan="3"><input type="submit" value="Create Address" /></td>
			</tr>
		</table>
	</form:form>
	<br />
	<br /> Go back to
	<a href="<c:url value='/Address/list' />">List of All Addresses</a>
</body>
</html>