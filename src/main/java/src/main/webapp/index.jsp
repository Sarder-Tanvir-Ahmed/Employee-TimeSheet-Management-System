<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">
<head>
    <meta charset="UTF-8">
    <title>Employee Management Webapp Incorporated</title>
    <style>
        /* add some basic styles here */
        body {
            background-color: #f1f1f1;
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
            color: #333;
            margin-bottom: 20px;
        }
        p {
            font-size: 18px;
            color: #555;
            margin-bottom: 10px;
        }
        a {
            color: #007bff;
            text-decoration: none;
        }
        button {
            background-color: #007bff;
            color: #fff;
            padding: 10px 20px;
            border: none;
            border-radius: 5px;
            margin-top: 10px;
            cursor: pointer;
        }
        button a {
            color: #fff;
            text-decoration: none;
        }
        button:hover {
            background-color: #0069d9;
        }
    </style>
</head>
<body>
<div class="container text-center">
    <h1>Welcome to Employee Management Webapp Incorporated</h1>
    <p><a th:href="/@{/Employee_reg}">Employee Registration</a></p>
    <button type="button"><a href="EMP-INF/register_employee.jsp">Employee Registration</a></button>
    <p><a th:href="/@{/Admin_login}">Admin Login</a></p>
    <button type="button"><a href="ADM-INF/login_admin.jsp">Admin_login</a></button>
    <p><a th:href="/@{/Employee_login}"> Employee Login</a></p>
    <button type="button"><a href="EMP-INF/login_employee.jsp">Employee_login</a></button>
</div>
</body>
</html>