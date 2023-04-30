package controller;

import dao.EmployeeDaoTimeOffRequestList;
import model.TimeoffRquest;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "EmployeeServletTimeOffList", value = "/EmployeeServletTimeOffList")
public class EmployeeServletTimeOffList extends HttpServlet {

    EmployeeDaoTimeOffRequestList employeeDaoTimeOffRequestList = new EmployeeDaoTimeOffRequestList();


    @Override
    public void init() throws ServletException {
        super.init();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws
            ServletException, IOException {


        List<TimeoffRquest> ListRequest = employeeDaoTimeOffRequestList.selectAllRequests();
        HttpSession session = request.getSession();
        session.setAttribute("ListRequest", ListRequest);
        RequestDispatcher dispatcher = request.getRequestDispatcher("EMP-INF/employee_timeoffrequest_list.jsp");
        dispatcher.forward(request, response);


    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws  IOException, ServletException {
        doGet(request, response);



    }



}