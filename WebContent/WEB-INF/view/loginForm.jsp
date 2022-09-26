<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<title>Login Form</title>
</head>
<body>
<form:form action="success" modelAttribute="userobj">
Username <form:input path="username"/><br/><br/>
Password <form:input path="password"/><br/><br/>
<input type="submit" value="login">
</form:form> 
</body>
</html>