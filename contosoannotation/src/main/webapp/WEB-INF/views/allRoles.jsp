<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>University Roles</title>
 
	<style>
		tr:first-child{
			font-weight: bold;
			background-color: #C6C9C4;
		}
	</style>
 
</head>
 
 
<body>
	<h2>List of Roles in Contoso University</h2>	
	<table>
		<tr>
			<td>RoleId</td>
			<td>Role Name</td>
			<td>Role Description</td>
		</tr>
		<c:forEach items="${roles}" var="role">
			<tr>
			<td>${role.roleId}</td>
			<td>${role.roleName}</td>
			<td>${role.description}</td>
			</tr>
		</c:forEach>
	</table>
	<br/>
	<a href="<c:url value='/Role/save' />">Add New Role</a>
	
	<br /> Go back to
	<a href="<c:url value='/' />">Home</a>
</body>
</html>