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
    <title>Project Registration</title>
    <style>
        /* Center the form */
        body {
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            background-color: #0072c6;
        }

        form {
            background-color: white;
            padding: 30px;
            border-radius: 10px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.2);
        }

        /* Style the form fields */
        input[type="text"] {
            width: 100%;
            padding: 12px;
            border: none;
            border-radius: 4px;
            margin: 8px 0;
            box-sizing: border-box;
        }

        input[type="submit"] {
            background-color: #0072c6;
            color: white;
            padding: 12px 20px;
            border: none;
            border-radius: 4px;
            cursor: pointer;
            width: 100%;
        }

        input[type="submit"]:hover {
            background-color: #00529b;
        }
    </style>
</head>
<body>
<form action="<%= request.getContextPath()%>/EmployeeServletProjectRegister" method="post">
    <h1 style="color:#0072c6">Project Registration</h1>
    <label for="projectName">Project Name:</label>
    <input type="text" id="projectName" name="projectName"/>

    <label for="projectUnderWho">Project Under Who:</label>
    <input type="text" id="projectUnderWho" name="projectUnderWho"/>

    <label for="startDate">Start Date:</label>
    <input type="text" id="startDate" name="Startdate"/>

    <label for="endDate">End Date:</label>
    <input type="text" id="endDate" name="Enddate"/>

    <label for="projectId">Project ID:</label>
    <input type="text" id="projectId" name="projectid"/>

    <input type="submit" value="Submit"/>
</form>
</body>
</html>
