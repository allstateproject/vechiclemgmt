<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Clerk Booking</title>
</head>
<body>
	<h3>Add Route</h3>
	<form action="" method="POST">
		<div>

			Route Id:<br> <input type="text" id="routeId"> <br>
			Source:<br> <input type="text" id="route" value="Bangalore">
			<br> Destination:<br> <input type="text" name="route"
				value="Mumbai"> <br> <br>
			<br>
			<input type="submit" value="Add Route">
		</div>
	</form>
	<form action="addBusDetails" method="POST">
		<div>
			<h3>Add bus details</h3>
			Bus Id:<br> <input type="text" id="busId" name="busId">
			<br> Model Number:<br> <input type="text" id="modelNo"
				name="modelNo"> <br> Bus Type:<br> <select>
				<option value="A/C">A/C</option>
				<option value="Non A/C">Non A/C</option>
			</select> <br> Policy Number:<br> <input type="text"
				id="policyNumber" name="policyNumber"> <br>
			Registration Number: <br> <input type="text" id="regNo"
				name="regNo"> <br> Date of Purchase:<br> <input
				type="text" id="dateOfPurchase" name="datOfPurchase"> <br>
			Seating Capacity:<br> <input type="text" id="seatingCapacity"
				name="seatingCapacity"> <br>
			<br>
			<input type="submit" value="Add Bus Details">
		</div>
	</form>
</body>
</html>