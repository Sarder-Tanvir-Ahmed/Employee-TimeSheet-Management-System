package controller;

import dao.EmployeeDaotfRquestApprove;
import model.TimeoffRquest;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet(name = "EmployeeServletRequestApprove", value = "/EmployeeServletRequestApprove")
public class EmployeeServletRequestApprove extends HttpServlet {
    EmployeeDaotfRquestApprove employeeDaotfRquestApprove = new EmployeeDaotfRquestApprove();


    @Override
    public void init() throws ServletException {
        super.init();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws
            ServletException, IOException {




    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        try {

            String id = (request.getParameter("RId"));
            System.out.println(id);
            employeeDaotfRquestApprove.approveRequest(id);
            RequestDispatcher dispatcher = request.getRequestDispatcher("EMP-INF/employee_timeoffrequest_list.jsp");
            dispatcher.forward(request, response);



        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }

}

