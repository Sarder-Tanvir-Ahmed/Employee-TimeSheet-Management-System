<%--
  Created by IntelliJ IDEA.
  User: shorb
  Date: 12/9/2022
  Time: 5:11 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Employee Login</title>
    <style>
        /* add the same basic styles as before */
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
            display: flex;
            flex-direction: column;
            align-items: center;
            justify-content: center;
            text-align: center;
        }
        h1 {
            font-size: 36px;
            color: #333;
            margin-bottom: 20px;
        }
        table {
            border-collapse: collapse;
            margin-top: 20px;
            margin-bottom: 20px;
            width: 100%;
            max-width: 500px;
        }
        td {
            padding: 10px;
        }
        input[type="text"], input[type="password"] {
            border: 1px solid #ccc;
            border-radius: 5px;
            padding: 10px;
            width: 100%;
            max-width: 500px;
            display: block;
            margin: 0 auto;
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
<div class="container text-center">
    <h1>Employee Login Form</h1>
    <form action="<%= request.getContextPath() %>/EmployeeServletLogin" method="POST">
        <table>
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