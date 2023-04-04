<%--
  Created by IntelliJ IDEA.
  User: shorb
  Date: 12/9/2022
  Time: 4:09 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!DOCTYPE html>
<html>
<head>
  <title>Employee Registration</title>
</head>
<body>
<form action="<%= request.getContextPath() %>/EmployeeServletListUpdate" method="get" >
  First Name: <input type="text" name="first_name" value="${param.FirstName}"/>
  <hr/>
  Last Name: <input type="text" name="last_name" value="${param.LastName}"/>
  <hr/>
  User Name: <input type="text" name="user_name" value="${param.UserName}"/>
  <hr/>
  Password: <input type="password" name="password" value="${param.Password}"/>
  <hr/>
  Id: <input type="text" name="Id" value="${param.Id}"/>
  <hr/>
  <input type="hidden" name="id" value="${param.Id}">
  <input type="submit" value="Submit">
</form>


</body>
</html>

