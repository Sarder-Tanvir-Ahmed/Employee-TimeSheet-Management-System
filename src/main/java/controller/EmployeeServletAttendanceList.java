package controller;


import dao.EmployeeDaoAttendance;
import model.Attendance;
import java.sql.SQLException;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

import java.util.List;


@WebServlet(name = "EmployeeServletAttendanceList", value = "/EmployeeServletAttendanceList")
public class EmployeeServletAttendanceList extends HttpServlet {
    EmployeeDaoAttendance employeeDaoattendancelist = new EmployeeDaoAttendance();


    @Override
    public void init() throws ServletException {
        super.init();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws
            ServletException, IOException {


        List<Attendance> ListAttendance = employeeDaoattendancelist.selectAllUsers();
        HttpSession session = request.getSession();
        session.setAttribute("ListAttendance", ListAttendance);
        RequestDispatcher dispatcher = request.getRequestDispatcher("EMP-INF/employee_attendance_list.jsp");
        dispatcher.forward(request, response);


    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws  IOException, ServletException {


    }



}