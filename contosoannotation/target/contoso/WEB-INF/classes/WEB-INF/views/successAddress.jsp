<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Address Registration Confirmation</title>
</head>
<body>
	Message : ${message}
	<br />
	<br /> Go back to
	<a href="<c:url value='/Address/list' />">List of All Addresss</a>

</body>

</html>