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


<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Employee Management Application</title>
    <link rel="stylesheet" href="<%= request.getContextPath() %>/css/bootstrap.min.css">
    <style>
        body {
            background-color: #f4f4f4;
        }
        .container {
            margin-top: 50px;
            background-color: #fff;
            padding: 50px;
            box-shadow: 0px 0px 10px rgba(0, 0, 0, 0.1);
        }
        h1 {
            color: #007bff;
            font-weight: bold;
            margin-bottom: 30px;
        }
        table {
            margin-top: 30px;
            width: 100%;
            border-collapse: collapse;
            background-color: #fff;
            box-shadow: 0px 0px 10px rgba(0, 0, 0, 0.1);
        }
        table thead tr th {
            background-color: #007bff;
            color: #fff;
            font-weight: bold;
            padding: 10px;
            text-align: center;
        }
        table tbody tr td {
            padding: 10px;
            text-align: center;
            border-bottom: 1px solid #dee2e6;
        }
        .add-button {
            background-color: #007bff;
            color: #fff;
            border: none;
            padding: 10px;
            border-radius: 5px;
            font-weight: bold;
            cursor: pointer;
            transition: all 0.3s ease-in-out;
        }
        .add-button:hover {
            background-color: #0062cc;
            transition: all 0.3s ease-in-out;
        }
    </style>
</head>

<body>

<div class="container">
    <h1>List of Projects</h1>
    <form action="<%= request.getContextPath() %>/EMP-INF/employee_project_register.jsp" method="Get">
        <button class="add-button">Add New Project</button>
    </form>
    <table>
        <thead>
        <tr>
            <th>ID</th>
            <th>Project Name</th>
            <th>Project Under Who</th>
            <th>Start Date</th>
            <th>End Date</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="project" items="${sessionScope.ListProject}">
            <tr>
                <td><c:out value="${project.getProject_id()}" /></td>
                <td><c:out value="${project.getProject_name()}" /></td>
                <td><c:out value="${project.getProject_Under_Who()}" /></td>
                <td><c:out value="${project.getStart_date()}" /></td>
                <td><c:out value="${project.getEnd_date()}" /></td>



            </tr>

            </c:forEach>

            </tbody>

        </table>

    </div>
</div>
</body>

</html>
