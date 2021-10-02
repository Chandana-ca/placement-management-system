<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix = "c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page isELIgnored = "false"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit title here</title>
</head>
<body>
<body>
  <center>
   <h1>Edit College</h1>
  </center>
  <div align="center">
  <form action = "update" method="post">
  <table border="1">
  <tr>
    <th>
       ID:
    </th>
      <td><input type "text" name=id value='<c:out value = "${s.getId()}"></c:out>'></td>
  </tr> 
  <tr>
    <th>
       Student Name:
    </th>
      <td><input type "text" name=sname value='<c:out value = "${s.getSname()}"></c:out>'></td>
  </tr>    
  <tr>
    <th>
       College Name:
    </th>
      <td><input type "text" name=cname value='<c:out value = "${s.getCname()}"></c:out>'></td>
  </tr>    
  <tr>
    <th>
       Location:
    </th>
      <td><input type "text" name=location value='<c:out value = "${s.getLocation()}"></c:out>'></td>
  </tr>  
  <tr>
    <td colspan = "2" align="center">
      <input type = "submit" value = save>
     </td>
  </tr> 
  </form>            
  </table> 
  </div>
</body>
</html>