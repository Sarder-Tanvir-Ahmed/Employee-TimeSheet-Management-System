<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: shorb
  Date: 12/9/2022
  Time: 5:12 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Employee Dashboard</title>
    <style>
        /* add some basic styles */
        body {
            background-color: #f1f1f1;
            font-family: Arial, sans-serif;
        }
        h1, h2 {
            text-align: center;
        }
        form {
            display: flex;
            flex-direction: column;
            align-items: center;
            margin-top: 20px;
        }
        input[type="submit"] {
            background-color: #007bff;
            color: #fff;
            padding: 10px 20px;
            border: none;
            border-radius: 5px;
            margin-top: 10px;
            cursor: pointer;
        }
        input[type="submit"]:hover {
            background-color: #0069d9;
        }
    </style>
</head>
<body>
<h1>Employee Dashboard</h1>
<h2>Hello <c:out value="${sessionScope.username}"/></h2>

<form action="<%= request.getContextPath() %>/EmployeeServletProjectList" method="Get">
    <input type="submit" value="Project Details">
</form>

<form action="<%= request.getContextPath() %>/EMP-INF/employee_attendence.jsp" method="Get">
    <input type="hidden" id="id" value="${sessionScope.username}">
    <input type="submit" value="Set Attendance">
</form>
</body>
</html>
