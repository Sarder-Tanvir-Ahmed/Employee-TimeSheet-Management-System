package controller;

import dao.EmployeeDaoProjectRegister;
import model.Project;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "EmployeeServletProjectRegister", value = "/EmployeeServletProjectRegister")
public class EmployeeServletProjectRegister extends HttpServlet {
    EmployeeDaoProjectRegister employeeDaoProjectRegister = new EmployeeDaoProjectRegister();


    @Override
    public void init() throws ServletException {
        super.init();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {



    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String Project_name = request.getParameter("projectName");
        String Project_Under_Who = request.getParameter("projectUnderWho");
        String Start_date = request.getParameter("Startdate");
        String End_date = request.getParameter("Enddate");
        String project_id = request.getParameter("projectid");

        Project project = new Project(project_id,Project_name,Project_Under_Who, Start_date, End_date);

        employeeDaoProjectRegister.registerProject(project);



        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/EmployeeServletProjectList");
        requestDispatcher.forward(request, response);


    }






    @Override
    public void destroy() {
        super.destroy();
    }
}
