<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<title>Add Rooms</title>
</head>
<body>
<form:form action="addroom" modelAttribute="room" methods="POST">
Number of Beds: <form:input path="beds"/><br/><br/>
Number of person: <form:input path="noOfPerson"/><br/><br/>
Room Fare: <form:input path="roomFare"/><br/><br/>
Room Type: <form:input path="roomType"/><br/><br/>
Room Number: <form:input path="roomNo"/><br/><br/>
Status: <form:input path="status"/><br/><br/>
<input type="submit" value="Add Room">
</form:form> 
</body>
</html>