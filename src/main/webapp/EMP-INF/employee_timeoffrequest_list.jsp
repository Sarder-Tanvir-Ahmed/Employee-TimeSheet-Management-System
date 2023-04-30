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
  <title>Employee Time Off requests</title>

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
    <h3 class="text-center">List of Employee Time Off Requests</h3>
    <hr>
    <br>

    <table  class="table table-bordered">
      <thead>
      <tr>
        <th>ID</th>
        <th>Request Reason</th>
        <th>Requested By Whom</th>
        <th>Start Date</th>
        <th>End Date </th>
        <th>Status </th>

      </tr>
      </thead>
      <tbody>



      <%--            <%=request.getSession().getAttribute("listUser")%>--%>



      <c:forEach  var="tfrequest" items="${sessionScope.ListRequest}">

        <tr>

          <td>
            <c:out value="${ tfrequest.getRequest_id()}" />
          </td>
          <td>
            <c:out value="${ tfrequest.getTimeoff_reason()}" />
          </td>
          <td>
            <c:out value="${ tfrequest.getRequested_Under_Who()}" />
          </td>
          <td>
            <c:out value="${tfrequest.getStart_date()}" />
          </td>
          <td>
            <c:out value="${ tfrequest.getEnd_date()}" />
          </td>
          <td>
            <c:out value="${ tfrequest.getStatus()}" />
          </td>
          <td>



            <form action="<%= request.getContextPath() %>/EmployeeServletRequestApprove" method="Post" onsubmit="setTimeout(function(){window.location.reload();},10);">
              <input type="hidden" name="RId" value="${ tfrequest.getRequest_id()}" />
              <input type="submit" value="Approve" >
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
