<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link href="resources/css/custom.css" rel="stylesheet" type="text/css">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.7.1/jquery.min.js" type="text/javascript"></script>
<script src="resources/js/registration.js"></script>
<title>Please register your details</title>
<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery-validate/1.17.0/jquery.validate.js" type="text/javascript"></script>

<script>
$(document).ready(function(){
	var contextPath = "http://localhost:8080/SwatzShop";
	var options = {
			url: contextPath
	}
	registration.init(options);
});
</script>
</head>
<body>
<form id="registrationForm" action="addUser" method="post">
<table>
<tr>
<td>First Name</td>
<td><input type="text" name="firstname" id="firstname"/></td>
</tr>
<tr>
<td>Last Name</td>
<td><input type="text" name="lastname" id="lastname"/></td>
</tr>
<tr>
<td>Email</td>
<td><input type="text" name="email" id="email"/></td>
</tr>
<tr>
<td>Password</td>
<td><input type="password" name="password" id="password"/></td>
</tr>
<tr><td><input class="submit" type="submit" value="Register"/></td></tr>
</table>
</form>
</body>
</html>