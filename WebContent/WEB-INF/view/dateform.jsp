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
		<h3>Book Room</h3>
		
		<form:form action="roombooking" modelAttribute="bookroom"
			methods="POST">
		
		<form:hidden path="id"/>
   		<table>
				<tbody>
				
					<tr>
						<td><label>Room No: ${bookroom.roomNo} </label></td>
						<td><form:input path="roomNo" /></td>
					</tr>
									
					<tr>
						<td><label>FromDate: </label></td>
						<td><form:input path="fromDate" /></td>
					</tr>
					
					<tr>
						<td><label>ToDate: </label></td>
						<td><form:input path="toDate" /></td>
					</tr>
							
					<tr>
						<td><label></label></td>
						<td><input type="submit" value="Book" class="save"/></td>
					</tr>
				
				</tbody>
			</table>
			
		</form:form>
		<div style="clear;both"></div>
		<p><a href="${pageContext.request.contextPath}/list">Back to List</a></p>
	</div>
</body>

</html>