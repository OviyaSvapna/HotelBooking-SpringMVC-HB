<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<title>Hotel Booking</title>
</head>
<body>
<h3>Hotel Booking</h3>
<hr>
<form:form modelAttribute="cancel">
<h3>Your Booking for the Room ${cancel.roomNo} is cancelled </h3>
<a href="bookroom"><button>Book Room</button></a>
</form:form>
</body>
</html>