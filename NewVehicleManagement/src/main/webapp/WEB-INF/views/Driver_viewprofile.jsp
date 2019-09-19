<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"  isELIgnored="false"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

<title>Driver</title>

<style>
body{
background-color:#D0B8B3;
}
</style>

</head>
<body>
<h1 style="color:white"> DRIVER</h1>
${message}

<c:set value="${emp}" var="e">
	${e.employeeId}
	${e.employeePhoneNum}
	${e.employeeAadharNo}
	${e.DriverDLNum}
	
<a href="<c:url value='/edit/${e.employeeId}' />" >Edit</a>
</c:set>

</body>

</html>