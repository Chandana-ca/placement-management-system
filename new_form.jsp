<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
  <center>
   <h1>Add New College</h1>
  </center>
  <div align="center">
  <form action = "insert" method="post">
  <table border="1">
  <tr>
    <th>
       ID:
    </th>
      <td><input type "text" name=id></td>
  </tr> 
  <tr>
    <th>
       Student Name:
    </th>
      <td><input type "text" name=sname></td>
  </tr>    
  <tr>
    <th>
       College Name:
    </th>
      <td><input type "text" name=cname></td>
  </tr>    
  <tr>
    <th>
       Location:
    </th>
      <td><input type "text" name=location></td>
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