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
        <h3 class="text-center">List of Projects</h3>
        <hr>
        <div class="container text-left">

            <form action="<%= request.getContextPath() %>/main/webapp/EMP-INF/employee_project_register.jsp" method="Get" >
                <input type="submit" value="Add New Project"  >
            </form>
        </div>
        <br>

        <table  class="table table-bordered">
            <thead>
            <tr>
                <th>ID</th>
                <th>Project_Name</th>
                <th>Project_Under_Who</th>
                <th>Start_Date</th>
                <th>End_Date</th>

            </tr>
            </thead>
            <tbody>



            <%--            <%=request.getSession().getAttribute("listUser")%>--%>



            <c:forEach  var="project" items="${sessionScope.ListProject}">

                <tr>

                    <td>
                        <c:out value="${ project.getProject_id()}" />
                    </td>
                    <td>
                        <c:out value="${project.getProject_name()}" />
                    </td>
                    <td>
                        <c:out value="${ project.getProject_Under_Who()}" />
                    </td>
                    <td>
                        <c:out value="${project.getStart_date()}" />
                    </td>
                    <td>
                        <c:out value="${ project.getEnd_date()}" />
                    </td>


                </tr>

            </c:forEach>

            </tbody>

        </table>

    </div>
</div>
</body>

</html>
