<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%> 
<%@taglib prefix = "c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page isELIgnored = "false"%>           
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>College Details</title>
</head>
<body>
 <center>
   <h1>College Details</h1>
   <h2>
     <a href = "add">Add new details</a>
     <a href = "list">Display the results</a>
   </h2>
 </center>
 <div align = "center">
  <table border="1">
    <tr> 
        <th>Id</th>
        <th>Student name</th>
        <th>College name</th>
        <th>Location</th>
    </tr>
    <c:forEach var="s" items = "${list}">
    <tr>
       <td><c:out value = "${s.getId()}"></c:out></td>
       <td><c:out value = "${s.getSname()}"></c:out></td>
       <td><c:out value = "${s.getCname()}"></c:out></td>
       <td><c:out value = "${s.getLocation()}"></c:out></td>
     <th>
           <a href="edit?id=<c:out value="${s.getId()}"></c:out>">edit</a>
           &nbsp;&nbsp;&nbsp;&nbsp;
           <a href="delete?id=<c:out value="${s.getId()}"></c:out>">Delete</a>     
     </th>        
    </tr>
    </c:forEach>
  </table>
 </div>
</body>
</html>