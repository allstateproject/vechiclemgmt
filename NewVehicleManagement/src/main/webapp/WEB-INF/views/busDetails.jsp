<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page session="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>BusDetails</title>


<style>
.footer{
background: green;
}
.form{
width:30%;
height:30%;

margin:30% 30% 30% 30%;

border: 5px solid black;

}
.header{
background:yellow;

}
.box{
border:4px solid red;

margin-left:auto;
margin-right:auto;
padding-left:auto;
padding-right:auto;


}
</style>
</head>
<body>
<div class="header" >header</div>
<div class="box" >
<form action="fetchdetails" method="POST">
Enter Bus Id:<br/>
<input  type="text" name="busId"/><br/>
<input type="submit" value="GetBusDetails"/>

</form>
</div>
<div class="footer"> footer</div>
</body>
</html>