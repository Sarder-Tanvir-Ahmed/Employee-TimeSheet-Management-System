<%--
  Created by IntelliJ IDEA.
  User: shorb
  Date: 12/9/2022
  Time: 6:15 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!DOCTYPE html>
<html>
<head>

  <title>Admin Login</title>
</head>
<body>
<div align="center">
  <h1>AdminLogin Form</h1>
  <form action="<%=request.getContextPath()%>/AdminServletLogin" method="POST">
    <table style="with: 100%">
      <tr>
        <td>UserName</td>
        <td><input type="text" name="username" /></td>
      </tr>

      <tr>
        <td>Password</td>
        <td><input type="password" name="password" /></td>
      </tr>

    </table>

    <input type="submit" value="Submit" />
  </form>
</div>
</body>
</html>
