<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page session="false" %>
<html>
<head>
	<title>Bus Detail Page</title>
	<style type="text/css">
		.tg  {border-collapse:collapse;border-spacing:0;border-color:#ccc;}
		.tg td{font-family:Arial, sans-serif;font-size:14px;padding:10px 5px;border-style:solid;border-width:1px;overflow:hidden;word-break:normal;border-color:#ccc;color:#333;background-color:#fff;}
		.tg th{font-family:Arial, sans-serif;font-size:14px;font-weight:normal;padding:10px 5px;border-style:solid;border-width:1px;overflow:hidden;word-break:normal;border-color:#ccc;color:#333;background-color:#f0f0f0;}
		.tg .tg-4eph{background-color:#f9f9f9}
	</style>
</head>
<body>
<h3>Bus Details</h3>

	<table class="tg">
	<tr>
		<th width="80">BusId</th>
		<th width="120">Model No.</th>
		<th width="120">Bus Type</th>
		<th width="120">Policy Number</th>
		<th width="120">Registration Number</th>
		<th width="120">Date of Purchase</th>
		<th width="120">Seating Capacity</th>
		<th width="120">Booked Seats</th>
		<th width="60">Edit</th>
		<th width="60">Delete</th>
	</tr>
	<c:forEach items="${listBuses}" var="bus">
		<tr>
			<td>${bus.busId}</td>
			<td>${bus.modelNo}</td>
			<td>${bus.busType}</td>
			<td>${bus.policyNumber}</td>
			<td>${bus.regNo}</td>
			<td>${bus.dateOfPurchase}</td>
			<td>${bus.seatingCapacity}</td>
			<td>${bus.bookedSeats}</td>
			
			
		</tr>
	</c:forEach>
	</table>

</body>