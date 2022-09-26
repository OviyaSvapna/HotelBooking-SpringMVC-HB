<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>Save Room</title>
</head>
<body>
	<div id="wrapper">
		<div id="header">
			<h2>Hotel Booking App</h2>
		</div>
	</div>
	
	
	<div id="container">
		<h3>Save Room</h3>
		<form:form action="addroom" modelAttribute="roomupdate"
			methods="POST">
		
		<form:hidden path="id"/>
   		<table>
				<tbody>
					<tr>
						<td><label>Number of Beds:</label></td>
						<td><form:input path="beds" /></td>
					</tr>
					
					<tr>
						<td><label>Number of Persons:</label></td>
						<td><form:input path="noOfPerson" /></td>
					</tr>
					
					<tr>
						<td><label>Room Fare: </label></td>
						<td><form:input path="roomFare" /></td>
					</tr>
					
					<tr>
						<td><label>Room Type: </label></td>
						<td><form:input path="roomType" /></td>
					</tr>
					
					<tr>
						<td><label>Room No: </label></td>
						<td><form:input path="roomNo" /></td>
					</tr>
					
					<tr>
						<td><label>Status: </label></td>
						<td><form:input path="status" /></td>
					</tr>
					
					<tr>
						<td><label></label></td>
						<td><input type="submit" value="Save" class="save"/></td>
					</tr>
				
				</tbody>
			</table>
			
		</form:form>
		<div style="clear;both"></div>
		<p><a href="${pageContext.request.contextPath}/list">Back to List</a></p>
	</div>
</body>

</html>