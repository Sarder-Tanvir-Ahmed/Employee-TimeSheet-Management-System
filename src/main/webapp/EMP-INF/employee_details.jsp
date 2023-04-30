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
    <title>Employee List</title>

    <style>
        body {
            background-color: #008ae6;
        }

        .container {
            max-width: 800px;
            margin: auto;
            background-color: white;
            padding: 20px;
            border-radius: 5px;
            box-shadow: 0px 0px 5px #D3D3D3;
        }

        h3 {
            text-align: center;
            color: #3C3C3C;
        }

        table {
            margin: auto;
            border-collapse: collapse;
            width: 100%;
        }

        th, td {
            text-align: center;
            padding: 8px;
        }

        th {
            background-color: #5c5cd6;
            color: white;
        }

        tr:nth-child(even) {
            background-color: #F2F2F2;
        }

        input[type=submit] {
            background-color: #337AB7;
            color: white;
            border: none;
            border-radius: 5px;
            padding: 5px 15px;
            cursor: pointer;
        }

        input[type=submit]:hover {
            background-color: #286090;
        }
    </style>

</head>

<body>


<br>

<div class="row">
    <!-- <div class="alert alert-success" *ngIf='message'>{{message}}</div> -->

    <div class="container">
        <h3 class="text-center">List of Employees</h3>
        <hr>
        <br>

        <table  class="table table-bordered">
            <thead>
            <tr>
                <th>ID</th>
                <th>First Name</th>
                <th>Last Name</th>
                <th>User Name</th>
                <th>Password</th>

            </tr>
            </thead>
            <tbody>



            <%--            <%=request.getSession().getAttribute("listUser")%>--%>



            <c:forEach  var="employee" items="${sessionScope.ListUser}">

                <tr>

                    <td>
                        <c:out value="${ employee.getId()}" />
                    </td>
                    <td>
                        <c:out value="${ employee.getFirstName()}" />
                    </td>
                    <td>
                        <c:out value="${ employee.getLastName()}" />
                    </td>
                    <td>
                        <c:out value="${employee.getUserName()}" />
                    </td>
                    <td>
                        <c:out value="${ employee.getPassword()}" />
                    </td>
                    <td>


                        <form action="<%= request.getContextPath() %>/EMP-INF/employee_update.jsp" method="get"   >
                            <input type="hidden" name="Id" value="${ employee.getId()}" />
                            <input type="hidden" name="FirstName" value="${ employee.getFirstName()}" />
                            <input type="hidden" name="LastName" value="${ employee.getLastName()}" />
                            <input type="hidden" name="UserName" value="${ employee.getUserName()}" />
                            <input type="hidden" name="Password" value="${ employee.getPassword()}" />
                            <input type="submit" value="Edit" >
                       </form>
                       <form action="<%= request.getContextPath() %>/EmployeeServletListDelete" method="Post" onsubmit="setTimeout(function(){window.location.reload();},10);">
                           <input type="hidden" name="Id" value="${ employee.getId()}" />
                           <input type="submit" value="Delete" >
                       </form>


                    </td>


                </tr>

            </c:forEach>

            </tbody>

        </table>

    </div>
</div>
</body>

</html>
