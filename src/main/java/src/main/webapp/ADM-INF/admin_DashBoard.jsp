<%--
  Created by IntelliJ IDEA.
  User: shorb
  Date: 12/9/2022
  Time: 6:20 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page import="controller.EmployeServletCRUD" %>
<%@ page import="java.sql.SQLException" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Admin Dashboard</title>
    <style>
        body {
            background-color: #F0F8FF;
            font-family: Arial, sans-serif;
            text-align: center;
        }
        h1 {
            color: #0066CC;
        }
        form {
            margin: 0 auto;
            display: inline-block;
            text-align: left;
        }
        input[type=submit] {
            background-color: #0066CC;
            border: none;
            color: white;
            padding: 8px 16px;
            text-decoration: none;
            font-size: 16px;
            margin: 4px 2px;
            cursor: pointer;
            border-radius: 4px;
        }
        input[type=submit]:hover {
            background-color: #003399;
        }
    </style>
</head>
<body>
<h1>Admin DashBoard</h1>
<h2>Hello <c:out value="${sessionScope.username}"/></h2>

<form action="<%= request.getContextPath() %>/EmployeeServletList" method="Get">
    <input type="submit" value="Employee Details">
</form>

<form action="<%= request.getContextPath() %>/EmployeeServletAttendanceList" method="Get">
    <input type="submit" value="Attendance Details">
</form>
</body>
</html>
