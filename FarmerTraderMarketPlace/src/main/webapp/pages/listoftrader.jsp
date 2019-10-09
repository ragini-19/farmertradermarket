<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>


<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<div align="center">

        <h1>Trader List</h1>
       
        <table border="1">
             <th>Trader id</th>
           
            <th>Trader Name</th>
              <th>Trader lastname</th>
               <th>email</th>
            <th>gender</th>
            <th>Mobile Number</th>
            
            <th>AAdhar Number</th>
           
            <th>Download pancard</th>
 
            <c:forEach var="trader" items="${listoftraderfromdb}">
                <tr>
                       <td>${trader.tid}</td>
                       <td>${trader.firstname}</td>
                       <td>${trader.lastname}</td>
                       <td>${trader.gender}</td>
                       <td>${trader.email}</td>
                       <td>${trader.aadharno}</td>
                       <td>${trader.mobno}</td>
                       <td> <a href="viewfile?sid=${trader.tid}">view file</a></td>
          
 
                </tr>
            </c:forEach>
        </table>
    </div>
</body>
</html>