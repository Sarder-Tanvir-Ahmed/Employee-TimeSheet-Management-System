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
</head>
<body>
<form action="<%= request.getContextPath()%>/EmployeeServletAttendance" method="post" onsubmit="window.history.go(-1)">
  Attendance ID: <input type="text" name="attendanceid"/>
  <hr/>
  Employee ID: <input type="text" name="employeeid" value="${param.Id}"/>
  <hr/>
  Date of Day: <input type="text" name="Dateofday"/>
  <hr/>

  <input type="submit" value="Submit">
</form>


</body>
</html>