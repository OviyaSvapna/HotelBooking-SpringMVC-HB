<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<title>Hotel Booking</title>
</head>
<body>
<h3>Hotel Booking</h3>
<hr>
<form:form modelAttribute="bookroom">	
Room ${bookroom.roomNo} is not available from ${bookroom.fromDate} to ${bookroom.toDate}
<a href="bookroom"><button>Book Room</button></a>
</form:form>
</body>
</html>