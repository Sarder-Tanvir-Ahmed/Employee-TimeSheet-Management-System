package controller;

import dao.EmployeeDaoTimeOffRequest;

import model.TimeoffRquest;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "EployeeServletTimeoffRequest", value = "/EployeeServletTimeoffRequest")
public class EployeeServletTimeoffRequest extends HttpServlet {

    EmployeeDaoTimeOffRequest employeeDaoTimeOffRequest = new EmployeeDaoTimeOffRequest();


    @Override
    public void init() throws ServletException {
        super.init();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {



    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String Timeoff_reason = request.getParameter("timeoff_reason");
        String Requested_Under_Who = request.getParameter("requestedunderwho");
        String Start_date = request.getParameter("Startdate");
        String End_date = request.getParameter("Enddate");
        String request_id = request.getParameter("requestid");

        TimeoffRquest tfrequest = new TimeoffRquest(request_id,Timeoff_reason,Requested_Under_Who, Start_date, End_date);

        employeeDaoTimeOffRequest.registerRequest(tfrequest);



        RequestDispatcher requestDispatcher = request.getRequestDispatcher("EMP-INF/employee_Dashboard.jsp");
        requestDispatcher.forward(request, response);


    }






    @Override
    public void destroy() {
        super.destroy();
    }
}

