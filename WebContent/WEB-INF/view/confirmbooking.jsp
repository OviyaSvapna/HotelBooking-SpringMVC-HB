<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<title>Hotel Booking</title>
</head>
<body>
<h3>Hotel Booking</h3>
<hr>
<form:form modelAttribute="booked">
<h4>${booked.roomNo} is booked from ${booked.fromDate} to ${booked.toDate}<br/></h4>

<h4>Thank you for Booking Room</h4> 
<a href="bookroom">Back to room</a>
</form:form>
</body>
</html>