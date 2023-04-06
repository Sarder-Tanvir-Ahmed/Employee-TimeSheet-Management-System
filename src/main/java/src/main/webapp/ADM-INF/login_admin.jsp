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
  <meta charset="UTF-8">
  <title>Admin Login</title>
  <style>
    /* add the same basic styles as before */
    body {
      background-color: #f2f2f2;
      font-family: Arial, sans-serif;
    }
    .container {
      margin: 50px auto;
      padding: 20px;
      border-radius: 5px;
      background-color: #fff;
      box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
      max-width: 500px;
    }
    h1 {
      font-size: 36px;
      text-align: center;
      color: #333;
      margin-bottom: 20px;
    }
    form {
      margin-top: 20px;
      text-align: center;
    }
    table {
      margin: 0 auto;
      margin-top: 20px;
      margin-bottom: 20px;
      width: 100%;
      max-width: 500px;
      border-collapse: collapse;
    }
    td {
      padding: 10px;
      text-align: right;
    }
    input[type="text"], input[type="password"] {
      border: 2px solid #ccc;
      border-radius: 4px;
      box-sizing: border-box;
      padding: 12px 20px;
      margin: 8px 0;
      width: 100%;
      max-width: 500px;
    }
    input[type="submit"] {
      background-color: #007bff;
      color: white;
      padding: 14px 20px;
      margin: 8px 0;
      border: none;
      border-radius: 4px;
      cursor: pointer;
    }
    input[type="submit"]:hover {
      background-color: #45a049;
    }
  </style>
</head>
<body>
<div class="container">
  <h1>Admin Login Form</h1>
  <form action="<%=request.getContextPath()%>/AdminServletLogin" method="POST">
    <table>
      <tr>
        <td>UserName:</td>
        <td><input type="text" name="username" /></td>
      </tr>
      <tr>
        <td>Password:</td>
        <td><input type="password" name="password" /></td>
      </tr>
    </table>
    <input type="submit" value="Submit" />
  </form>
</div>
</body>
</html>
