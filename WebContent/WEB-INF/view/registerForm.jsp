<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<title>Registeration Form</title>
</head>
<body>
<form:form action="register" modelAttribute="userprofileobj" methods="POST">
Name: <form:input path="name"/><br/><br/>
Username: <form:input path="userName"/><br/><br/>
Mobile: <form:input path="mobile"/><br/><br/>
Password: <form:input path="password"/><br/><br/>
Confirm Password: <form:input path="confirmPassword"/><br/><br/>
Email: <form:input path="email"/><br/><br/>
Address: <form:input path="address"/><br/><br/>
City: <form:input path="city"/><br/><br/>
State: <form:input path="state"/><br/><br/>
<input type="submit" value="Register">
</form:form> 
</body>
</html>