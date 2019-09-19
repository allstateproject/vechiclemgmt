<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Driver Details Edit </h1>

<form:form action="driver/edit">

DriverId: <form:input type="text" name="driverId" path="driverId" value="${emp.employeeId}"/>
<br>
PhoneNum: <form:input type="text" name="PhoneNum" path="PhoneNum" value="${emp.employeePhoneNum}"/>
<br>
AadharNo: <form:input type="text" name="AadharNo" path="AadharNo" value="{emp.employeeAadharNo}"/>
<br>
DLNum: <form:input type="text" name="DLNum" path="DLNum" value="${emp.DriverDLNum}"/>
<br>
<a href="<c:url value='/update/${e.employeeId}' />" >UPDATE</a>
</form:form>
</body>
</html>