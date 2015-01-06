<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Addresses</title>
		
		<style>
			tr:first-child{
				font-weight: bold;
				background-color: #C6C9C4;
			}
		</style>
	</head>
	<body>
		<h2>List of Addresses of people at Contoso University</h2>	
		<table>
			<tr>
				<td>Address ID</td>
				<td>Street</td>
				<td>City</td>
				<td>Country</td>
				<td>ZIP Code</td>
			</tr>
			<c:forEach items="${addresses}" var="address">
				<tr>
				<td>${address.addressId}</td>
				<td>${address.street}</td>
				<td>${address.city}</td>
				<td>${address.country}</td>
				<td>${address.zipCode}</td>
				</tr>
			</c:forEach>
		</table>
		<br/>
		<a href="<c:url value='/Address/save' />">Add New Address</a>
		
		<br /> Go back to
	<a href="<c:url value='/' />">Home</a>
	</body>
</html>