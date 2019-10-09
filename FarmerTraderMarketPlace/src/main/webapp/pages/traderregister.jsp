<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div align="center">
<h1>Welcome to signup</h1>
<form action="savedetailofuser" method="get">

<table>

<!-- <tr>

  <td>trader:</td>
  <td> <input type="text" name="firstname"/></td>

</tr> -->
<tr>

  <td>trader name:</td>
  <td> <input type="text" name="firstname"/></td>

</tr>
<tr>
 <td>last name:</td>
  <td> <input type="text" name="lastname"/></td>

</tr>
<tr>
 <td>mobile number:</td>
  <td> <input type="text" name="mobno"/></td>

</tr>

<tr>



<td>gender:</td>
  <td>Male <input type="radio" name="gender"   value="male"/></td>
   <td>Female <input type="radio" name="gender"  value="female"/></td>
</tr>


<tr>
 <td>Adhar number:</td>
  <td> <input type="text" name="aadharno"/></td>

</tr>
<tr>

 <td>usertype:</td>
  <td> <input type="text" name="usertype"/></td>

</tr>


 <tr>
   <td>email </td>
   <td><input type ="text" name="email"/></td>
 </tr>
 
  <!-- <tr>
              <td>lid </td>
   <td><input type ="text" name="login.lid"/></td>
 <tr> -->
   <td>username </td>
   <td><input type ="text" name="login.username"/></td>
 </tr>
 
 <tr>
 <td>password:</td>
  <td> <input type="password" name="login.password"/></td>

</tr>
<tr>
<td>usertype:</td>
  <td> <input type="text" name="login.usertype"/></td>
</tr>

<tr>
  <td> <td><input type ="submit" value="save"/></td>
 </tr>
 
 </table>
 </form>
 

 <form method="POST" action="gotouploadfile" enctype="multipart/form-data">
    <input type="submit" value="Browse" />
</form> 

 </div>
</body>
</html>