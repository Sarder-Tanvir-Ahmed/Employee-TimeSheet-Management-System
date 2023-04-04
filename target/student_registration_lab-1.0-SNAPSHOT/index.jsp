<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">
<head>

    >

</head>
<body>

<div class="container text-center">
    <h1>Welcome to Employee Management Webapp Incorporated</h1>
    <p><a th:href="/@{/Employee_reg}">Employee Registration</a></p>
    <button type="button"><a href="EMP-INF/register_employee.jsp">Employee Registration</a></button>
    <p><a th:href="/@{/Admin_login}">Admin Login</a></p>
    <button type="button"><a href="ADM-INF/login_admin.jsp">Admin_login</a></button>
    <p><a th:href="/@{/Employee_login}"> Employee Login</a></p>
    <button type="button"><a href="EMP-INF/login_employee.jsp">Employee_login</a></button>
    </form>


</div>

</body>
</html>