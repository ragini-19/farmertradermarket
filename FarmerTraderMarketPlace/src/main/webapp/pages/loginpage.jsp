<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>login validation page</title>
</head>
<body>
<div align="center">
<h1>Welcome to LoginPage</h1>
<form action="finduserbyname" method="get">
<table>
<tr>

  <td>Username:</td>
  <td> <input type="text" name="username"/></td>

</tr>
 <tr>
   <td>Password </td>
   <td><input type ="text" name="password"/></td>
 </tr>
 
 <tr>
  <td> <td><input type ="submit" value="login"/></td>
 </tr>
 
  <tr>
  <td> <td><input type ="submit" value="signup"/></td>
 </tr>

</table>
</form>
</div>
</body>


</body>
</html> 