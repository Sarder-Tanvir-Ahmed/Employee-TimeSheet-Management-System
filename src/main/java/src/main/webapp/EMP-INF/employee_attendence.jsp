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
  <title>Employee Attendance</title>
  <style>
    body {
      background-color: #f2f2f2;
      font-family: Arial, sans-serif;
      color: #333333;
    }

    form {
      margin: auto;
      max-width: 500px;
      background-color: white;
      padding: 20px;
      border: 2px solid #007bff;
      border-radius: 5px;
    }

    input[type="text"] {
      width: 100%;
      padding: 12px 20px;
      margin: 8px 0;
      box-sizing: border-box;
      border: 2px solid #ccc;
      border-radius: 4px;
      font-size: 16px;
    }

    input[type="submit"] {
      background-color: #007bff;
      color: white;
      padding: 12px 20px;
      border: none;
      border-radius: 4px;
      cursor: pointer;
      font-size: 16px;
    }

    input[type="submit"]:hover {
      background-color: #0069d9;
    }

    hr {
      border: 0;
      border-top: 1px solid #ccc;
      margin: 20px 0;
    }

    h1 {
      text-align: center;
    }
  </style>
</head>
<body>
<h1>Employee Attendance</h1>
<form action="<%= request.getContextPath()%>/EmployeeServletAttendance" method="post" onsubmit="window.history.go(-1)">
  <label for="attendanceid">Attendance ID:</label>
  <input type="text" id="attendanceid" name="attendanceid"/>
  <hr/>
  <label for="employeeid">Employee ID:</label>
  <input type="text" id="employeeid" name="employeeid" value="${param.Id}"/>
  <hr/>
  <label for="Dateofday">Date of Day:</label>
  <input type="text" id="Dateofday" name="Dateofday"/>
  <hr/>
  <input type="submit" value="Submit">
</form>
</body>
</html>