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
    <title>Employee Registration</title>
</head>
<body>
<form action="<%= request.getContextPath()%>/EmployeeServletProjectRegister" method="post">
    project Name: <input type="text" name="projectName"/>
    <hr/>
    project Under Who: <input type="text" name="projectUnderWho"/>
    <hr/>
    Start date: <input type="text" name="Startdate"/>
    <hr/>
    End date: <input type="text" name="Enddate"/>
    <hr/>
    project id: <input type="text" name="projectid"/>
    <hr/>
    <input type="submit" value="Submit">
</form>


</body>
</html>
