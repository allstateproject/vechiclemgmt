<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
       <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<!-- <link href=".css" rel="stylesheet" type="text/css"/> -->
</head>
<body>
${error}

<form:form action="passenger/edit">
<table>
        <tr>
            <td>Passenger Name :</td>
            <td>
              <form:input type="text" name="passengerName" path="passengerName"  value="${passenger.passengerName}"/>
            </td>
            
         
        </tr>
        <tr>
            <td>Passenger phone number:</td>
            <td>
            <form:input type="text" name="passengerPhone" path="passengerPhone"  value="${passenger.passengerPhone}"/>
            </td>
            
        </tr>
         <tr>
            <td>Passenger gender:</td>
            <td>
            <form:input type="text" name="passengerGender" path="passengerGender"  value="${passenger.passengerGender}"/>
               
            </td>
            
        </tr>
         <tr>
            <td>Passenger age:</td>
            <td>
            <form:input type="number" name="passengerAge" path="passengerAge"  value="${passenger.passengerAge}"/>
                
            </td>
            
        </tr>
         <tr>
            <td>Number of trips:</td>
            <td>
            <form:input type="number" name="noOfTrips" path="noOfTrips"  value="${passenger.noOfTrips}"/>
               
            </td>
            
        </tr>
         <tr>
            <td>adhar number:</td>
            <td>
            <form:input type="text" name="adharNum" path="adharNum"  value="${passenger.adharNum}"/>
                 
            </td>
            
        </tr>
         <tr>
            <td>emergency contact number:</td>
            <td>
             <form:input type="text" name="passengerEmgContact" path="passengerEmgContact"  value="${passenger.passengerEmgContact}"/>
               
            </td>
            
        </tr>
         <tr>
            <td>Passenger blood group:</td>
            <td>
            <form:input type="text" name="passengerBloodGroup" path="passengerBloodGroup"  value="${passenger.passengerBloodGroup}"/>
                 
            </td>
           
        </tr>
        <tr>
            <td colspan="2">
                <form:input type="submit" name="submitbutton" value="Save Changes" path="submitbutton"/>
            </td>
        </tr>
    </table>
</form:form>
</body>
</html>