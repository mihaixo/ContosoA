<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Onsite Course Registration Form</title>

<style>
.error {
	color: #ff0000;
}
</style>

</head>

<body>

	<h2>Onsite Course Creation Form</h2>

	<form:form method="POST" modelAttribute="onsiteCourse">
		<table>
			<tr>
				<td><label for="courseId">Course ID: </label></td>
				<td><form:input path="courseId" id="courseId" /></td>
				<td><form:errors path="courseId" cssClass="error" /></td>
			</tr>
			<tr>
				<td><label for="url">URL: </label></td>
				<td><form:input path="url" id="url" /></td>
				<td><form:errors path="url" cssClass="error" /></td>
			</tr>

			<tr>
				<td colspan="3"><input type="submit" value="Create Onsite Course" /></td>
			</tr>
		</table>
	</form:form>
	<br />
	<br /> Go back to
	<a href="<c:url value='/OnsiteCourse/list' />">List of All Onsite Courses</a>
</body>
</html>