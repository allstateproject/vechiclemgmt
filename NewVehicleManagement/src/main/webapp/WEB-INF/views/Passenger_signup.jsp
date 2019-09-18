<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"  isELIgnored="false"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>passenger sign up</title>
<!-- <link href=".css" rel="stylesheet" type="text/css"/> -->
</head>
<body>
${error}
  <c:url var="addAction" value="/passenger/signup" ></c:url>
<form:form action ="${addAction}" method = "POST">
         Passenger name: <input type = "text" name = "passengerName">
         <br />
         Passenger phone number: <input type = "text" name = "passengerPhone" />
         <br />
          Passenger gender: <input type = "text" name = "passengerGender" />
         <br />
         Passenger age: <input type = "text" name = "passengerAge" />
         <br />
         no. of trips: <input type = "int" name = "noOfTrips" />
         <br />
         Passenger adhar number: <input type = "text" name = "adharNum" />
         <br />
          emergency contact number: <input type = "text" name = "passengerEmgContact" />
         <br />
           blood group: <input type = "text" name = "passengerBloodGroup" />
         <br />
         <input type = "submit" value = "Signup" />
      </form:form >
</body>
</html>