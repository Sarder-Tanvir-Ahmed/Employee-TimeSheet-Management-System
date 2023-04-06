package controller;


import dao.EmployeeDaoList;
import model.Employee;
import java.sql.SQLException;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

import java.util.List;


@WebServlet(name = "EmployeeServletList", value = "/EmployeeServletList")
public class EmployeeServletList extends HttpServlet {
    EmployeeDaoList employeeDaolist = new EmployeeDaoList();


    @Override
    public void init() throws ServletException {
        super.init();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws
             ServletException, IOException {


        List<Employee> ListUser = employeeDaolist.selectAllUsers();
        HttpSession session = request.getSession();
        session.setAttribute("ListUser", ListUser);
        RequestDispatcher dispatcher = request.getRequestDispatcher("EMP-INF/employee_details.jsp");
        dispatcher.forward(request, response);


    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws  IOException, ServletException {


    }



}