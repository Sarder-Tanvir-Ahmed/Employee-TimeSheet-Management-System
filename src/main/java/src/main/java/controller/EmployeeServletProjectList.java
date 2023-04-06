package controller;



import dao.EmployeeDaoProjectList;
import model.Project;
import java.sql.SQLException;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

import java.util.List;


@WebServlet(name = "EmployeeServletProjectList", value = "/EmployeeServletProjectList")
public class EmployeeServletProjectList extends HttpServlet {
    EmployeeDaoProjectList employeeDaoprojectlist = new EmployeeDaoProjectList();


    @Override
    public void init() throws ServletException {
        super.init();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws
            ServletException, IOException {


        List<Project> ListProject = employeeDaoprojectlist.selectAllProjects();
        HttpSession session = request.getSession();
        session.setAttribute("ListProject", ListProject);
        RequestDispatcher dispatcher = request.getRequestDispatcher("EMP-INF/employee_project_list.jsp");
        dispatcher.forward(request, response);


    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws  IOException, ServletException {
        doGet(request, response);



    }



}