<%@ page import="java.util.List " %>
<%@ page import="controller.EmployeServletCRUD" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="model.Employee" %>
<%@ page import="java.sql.SQLException" %><%--
  Created by IntelliJ IDEA.
  User: shorb
  Date: 12/10/2022
  Time: 12:56 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false" %>


<html>

<head>
    <title>Employee Attendance</title>
    <style>
        body {
            background-color: #F5F5F5;
            font-family: Arial, sans-serif;
            text-align: center;
        }
        table {
            margin: 0 auto;
            border-collapse: collapse;
            border: 1px solid #5c5cd6;
            width: 80%;
        }
        th, td {
            border: 1px solid #5c5cd6;
            padding: 10px;
            text-align: center;
        }
        th {
            background-color: #5c5cd6;
        }
        h3 {
            margin-top: 50px;
        }
    </style>
</head>

<body>
<div class="row">
    <div class="container">
        <h3>List of Attendance</h3>
        <hr>

        <br>

        <table>
            <thead>
            <tr>
                <th>Attendance ID</th>
                <th>Employee ID</th>
                <th>Date of Day</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach var="attendance" items="${sessionScope.ListAttendance}">
                <tr>
                    <td><c:out value="${attendance.getAttendance_id()}" /></td>
                    <td><c:out value="${attendance.getEmployee_id()}" /></td>
                    <td><c:out value="${attendance.getDateofDay()}" /></td>
                </tr>
            </c:forEach>
            </tbody>
        </table>

    </div>
</div>
</body>

</html>