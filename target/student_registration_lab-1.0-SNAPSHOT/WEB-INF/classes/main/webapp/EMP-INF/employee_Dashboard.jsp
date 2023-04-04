<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: shorb
  Date: 12/9/2022
  Time: 5:12 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Employee DashBoard</h1>
<h2>Hello <c:out value="${sessionScope.username}"/>               </h2>

<form action="<%= request.getContextPath() %>/EmployeeServletProjectList" method="Get">
    <input type="submit" value="Project Details" >

</form>

<form action="<%= request.getContextPath() %>/EMP-INF/employee_attendence.jsp" method="Get">
    <input type="hidden" id="id" value="${sessionScope.username}" >
    <input type="submit" value="Set Attendance" >

</form>

</form>
</body>
</html>
