<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Users</title>


<style>
tr:first-child{
font-weight: bold;
background-color: #C6C9C4;
}
</style>
</head>
<body>
<h2>List of Users at Contoso University</h2>	
<table>
<tr>
<td>User Id</td>
<td>User Name</td>
<td>Password Hash</td>
<td>Password Salt</td>
<td>Email</td>
<td>Created Date</td>
<td>Last Login Date</td>
<td>Last Password Change</td>


</tr>
<c:forEach items="${users}" var="user">
<tr>

<td>${user.userID}</td>
<td>${user.userName}</td>
<td>${user.passwordHash}</td>
<td>${user.passwordSalt}</td>
<td>${user.email}</td>
<td>${user.createdDate}</td>
<td>${user.lastLoginDate}</td>
<td>${user.lastPasswordChange}</td>



</tr>
</c:forEach>
</table>
<br/>
<a href="<c:url value='/User/save' />">Add New User</a>

<br /> Go back to
<a href="<c:url value='/' />">Home</a>
</body>
</html>