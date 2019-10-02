<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>login</title>
</head>
<body>
<div align="center">
<h1>Welcome to Spring Boot Application....</h1>
<form method="post">
Username:<input type="text" name="username">
<br><br>
Password:<input type="text" name="password">
<br><br>
<input type="submit" value="Submit">
<br>
<br>
 <span class="error"><font color="red">${message}</font></span>
</form>
</div>
</body>
</html>