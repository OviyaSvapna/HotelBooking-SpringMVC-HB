<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<title>List Room</title>
</head>
<body>
	<div id="wrapper">
		
		<div id="header">
			<h2>Rooms</h2>
		</div>
		
		<form:form action="searchroom" method="GET">
                Search room: <input type="text" name="roomType" />
				<input type="submit" value="Search"/>
		</form:form>
		
		
		<div id="container">
			<div id="content">
				
				<table>
					
					<tr>
						<th>Beds</th>
						<th>No of Rooms</th>
						<th>Room Fare</th>
						<th>Room Type</th>
						<th>Room No</th>
						<th>Status</th>
					</tr>
					
					<c:forEach var="rooms" items="${rooms}">

						<c:url var="bookLink" value="/checkdate">
							<c:param name="roomNo" value="${rooms.roomNo}" />
						</c:url>

						<c:url var="cancelLink" value="/cancel">
							<c:param name="roomNo" value="${rooms.roomNo}" />
						</c:url>
						
						<tr>
							<td>${rooms.beds}</td>
							<td>${rooms.noOfPerson}</td>
							<td>${rooms.roomFare}</td>
							<td>${rooms.roomType}</td>
							<td>${rooms.roomNo}</td>
							<td>${rooms.status}</td>
							<td><a href="${bookLink}">Book</a></td>
							<td><a href="${cancelLink}"
								onclick="if (!(confirm('Are you sure you want to cancel this Room?'))) return false">Cancel</a></td>
						</tr>
						
					</c:forEach>
				</table>
			</div>
		</div>
	</div>
</body>
</html>