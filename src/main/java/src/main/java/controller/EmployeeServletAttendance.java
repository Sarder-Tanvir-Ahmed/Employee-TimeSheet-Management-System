package controller;

import dao.EmployeeDaoAttendance;
import model.Attendance;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "EmployeeServletAttendance", value = "/EmployeeServletAttendance")
public class EmployeeServletAttendance extends HttpServlet {
    EmployeeDaoAttendance employeeDaoattendance = new EmployeeDaoAttendance();


    @Override
    public void init() throws ServletException {
        super.init();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {



    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String attendanceid = request.getParameter("attendanceid");
        String employeeid = request.getParameter("employeeid");
        String dateofday = request.getParameter("Dateofday");

        Attendance employee = new Attendance(attendanceid, employeeid, dateofday);

        employeeDaoattendance.registerAttendance(employee);

        //response.sendRedirect("EMP-INF/login_employee.jsp");

        RequestDispatcher requestDispatcher = request.getRequestDispatcher("EMP-INF/employee_Dashboard.jsp");
        requestDispatcher.forward(request, response);
    }






    @Override
    public void destroy() {
        super.destroy();
    }
}
