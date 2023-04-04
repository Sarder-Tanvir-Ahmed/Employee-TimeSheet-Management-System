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


<html>

<head>
    <title>Employee Management Application</title>

</head>

<body>




<div class="row">
    <!-- <div class="alert alert-success" *ngIf='message'>{{message}}</div> -->

    <div class="container">
        <h3 class="text-center">List of Attendance</h3>
        <hr>

        <br>

        <table  class="table table-bordered">
            <thead>
            <tr>
                <th>Attendance_ID</th>
                <th>Employee_ID</th>
                <th>Date_of_Day</th>


            </tr>
            </thead>
            <tbody>



            <%--            <%=request.getSession().getAttribute("listUser")%>--%>



            <c:forEach  var="attendance" items="${sessionScope.ListAttendance}">

                <tr>

                    <td>
                        <c:out value="${ attendance.getAttendance_id()}" />
                    </td>
                    <td>
                        <c:out value="${attendance.getEmployee_id()}" />
                    </td>
                    <td>
                        <c:out value="${ attendance.getDateofDay()}" />
                    </td>


                </tr>

            </c:forEach>

            </tbody>

        </table>

    </div>
</div>
</body>

</html>
