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
    <title>Title</title>
</head>
<body>
<h1>Admin DashBoard</h1>


<h2>Hello <c:out value="${sessionScope.username}"/>               </h2>

<form action="<%= request.getContextPath() %>/EmployeeServletList" method="Get">
   <input type="submit" value="Employee Details" >

</form>

<form action="<%= request.getContextPath() %>/EmployeeServletAttendanceList" method="Get">
    <input type="submit" value="Attendance Details" >

</form>


</body>
</html>
