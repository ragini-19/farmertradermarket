<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Trader List</title>
</head>
<body>
<div align="center">
        <h1>Trader List</h1>
        <table border="1">
 
            <th>First Name</th>
            <th>Last Name</th>
            <th>AadharNo</th>
            <th>Email</th>
            <th>Gender</th>
            <th>User Type</th>
            <th>Mobile No</th>
            <th>Action</th>
            
            <c:forEach var="user" items="${listUser}">
                <tr>
 
                    <td>${user.firstname}</td>
                    <td>${user.lastname}</td>
                    
                  <td>${user.aadharno}</td>
                  <td>${user.email}</td>
                  <td>${user.gender}</td>
                    <td>${user.usertype}</td>
                    <td>${user.mobno}</td>
                    
                    <td><a href="approveUser/${user.tid}">Approved</a>
                             <a
                        href="rejectUser/${user.tid}">Reject</a></td>
 
                </tr>
            </c:forEach>
            
            
            </table>
            </div>
</body>
</html>