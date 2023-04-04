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
<form action="<%= request.getContextPath() %>//EmployeeServlet" method="post">
    First Name: <input type="text" name="firstName"/>
    <hr/>
    Last Name: <input type="text" name="lastName"/>
    <hr/>
    User Name: <input type="text" name="userName"/>
    <hr/>
    Password: <input type="password" name="password"/>
    <hr/>
    Id: <input type="text" name="Id"/>
    <hr/>
    <input type="submit" value="Submit">
</form>


</body>
</html>
