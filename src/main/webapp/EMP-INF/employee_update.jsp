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
  <title>Employee Update</title>
  <style>
    body {
      background-color: #fff;
      color: #333;
      font-family: Arial, sans-serif;
      font-size: 16px;
      line-height: 1.5;
      text-align: center;
    }

    form {
      background-color: #3498db;
      border: 2px solid #fff;
      border-radius: 5px;
      box-shadow: 0px 0px 10px #333;
      display: inline-block;
      margin-top: 50px;
      padding: 20px;
      text-align: left;
    }

    hr {
      border: 1px solid #fff;
      margin: 10px 0;
    }

    input[type="text"],
    input[type="password"] {
      background-color: #fff;
      border: 1px solid #333;
      border-radius: 3px;
      font-size: 16px;
      padding: 5px;
      width: 100%;
    }

    input[type="submit"] {
      background-color: #fff;
      border: none;
      border-radius: 3px;
      color: #3498db;
      cursor: pointer;
      font-size: 16px;
      padding: 10px 20px;
    }

    input[type="submit"]:hover {
      background-color: #333;
      color: #fff;
    }
  </style>
</head>
<body>
<form action="<%= request.getContextPath() %>/EmployeeServletListUpdate" method="get" >
  <h1 style="color: #fff;">Employee Update</h1>
  <label style="color: #fff;">First Name:</label><br>
  <input type="text" name="first_name" value="${param.FirstName}"/><br>
  <hr>
  <label style="color: #fff;">Last Name:</label><br>
  <input type="text" name="last_name" value="${param.LastName}"/><br>
  <hr>
  <label style="color: #fff;">User Name:</label><br>
  <input type="text" name="user_name" value="${param.UserName}"/><br>
  <hr>
  <label style="color: #fff;">Password:</label><br>
  <input type="password" name="password" value="${param.Password}"/><br>
  <hr>
  <label style="color: #fff;">Id:</label><br>
  <input type="text" name="Id" value="${param.Id}"/><br>
  <hr>
  <input type="hidden" name="id" value="${param.Id}">
  <input type="submit" value="Submit">
</form>
</body>
</html>

