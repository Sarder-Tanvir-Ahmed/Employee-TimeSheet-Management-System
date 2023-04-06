package controller;


import dao.EmployeeDaoLogin;
import model.Employee;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;


@WebServlet(name = "EmployeeServletLogin", value = "/EmployeeServletLogin")
public class EmployeeServletLogin extends HttpServlet
    {
        EmployeeDaoLogin employeeDaologin = new EmployeeDaoLogin();


        @Override
        public void init () throws ServletException {
        super.init();
    }

        @Override
        protected void doGet (HttpServletRequest request, HttpServletResponse response) throws
        ServletException, IOException {

    }

        @Override
        protected void doPost (HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String username = request.getParameter("username");
        String password = request.getParameter("password");
        Employee employee = new Employee(username, password);
        employee.setUserName(username);
        employee.setPassword(password);


        if (employeeDaologin.validate(employee)) {
                HttpSession session = request.getSession();
                 session.setAttribute("username",username);
            RequestDispatcher requestDispatcher = request.getRequestDispatcher("EMP-INF/employee_Dashboard.jsp");
            requestDispatcher.forward(request, response);
        } else {
                //HttpSession session = request.getSession();
                //session.setAttribute("user", username);
                response.sendRedirect("index.jsp");
        }

    }
    }
