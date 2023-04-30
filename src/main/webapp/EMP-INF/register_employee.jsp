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
    <meta charset="UTF-8">
    <title>Employee Registration</title>
    <style>
        /* add some basic styles here */
        body {
            background-color: #f1f1f1;
            font-family: Arial, sans-serif;
        }
        form {
            margin: 50px auto;
            padding: 20px;
            border-radius: 5px;
            background-color: #fff;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
            max-width: 500px;
        }
        input[type="text"], input[type="password"], input[type="submit"] {
            display: block;
            margin-bottom: 20px;
            width: 100%;
            padding: 10px;
            font-size: 18px;
            border-radius: 5px;
            border: none;
            background-color: #f5f5f5;
        }
        input[type="submit"] {
            background-color: #007bff;
            color: #fff;
            cursor: pointer;
        }
        input[type="submit"]:hover {
            background-color: #0069d9;
        }
        hr {
            border: none;
            height: 1px;
            background-color: #ddd;
            margin: 20px 0;
        }
    </style>
</head>
<body>
<form action="<%= request.getContextPath() %>//EmployeeServlet" method="post">
    <input type="text" name="firstName" placeholder="First Name"/>
    <hr/>
    <input type="text" name="lastName" placeholder="Last Name"/>
    <hr/>
    <input type="text" name="userName" placeholder="User Name"/>
    <hr/>
    <input type="password" name="password" placeholder="Password"/>
    <hr/>
    <input type="text" name="Id" placeholder="Id"/>
    <hr/>
    <input type="submit" value="Submit">
</form>
</body>
</html>





