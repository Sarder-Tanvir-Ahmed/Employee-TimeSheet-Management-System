package controller;


import dao.EmployeeDaoListDelete;
import model.Employee;
import java.sql.SQLException;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

import java.util.List;


@WebServlet(name = "EmployeeServletListDelete", value = "/EmployeeServletListDelete")
public class EmployeeServletListDelete extends HttpServlet {
    EmployeeDaoListDelete employeeDaolistdelete = new EmployeeDaoListDelete();


    @Override
    public void init() throws ServletException {
        super.init();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws
            ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {

        try {
            String id = (request.getParameter("Id"));
            employeeDaolistdelete.deleteUser(id);
            RequestDispatcher dispatcher = request.getRequestDispatcher("EMP-INF/employee_timeoffrequest_list.jsp");
            dispatcher.forward(request, response);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }

}