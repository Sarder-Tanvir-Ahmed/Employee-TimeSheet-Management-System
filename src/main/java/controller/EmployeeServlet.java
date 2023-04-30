package controller;

import dao.EmployeeDao;
import model.Employee;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "EmployeeServlet", value = "/EmployeeServlet")
public class EmployeeServlet extends HttpServlet {
    public EmployeeDao employeeDao = new EmployeeDao();


    @Override
    public void init() throws ServletException {
        super.init();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {



    }

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String userName = request.getParameter("userName");
        String password = request.getParameter("password");
        String id = request.getParameter("Id");

        Employee employee = new Employee(firstName, lastName, userName, password, id);

        employeeDao.registerEmployee(employee);

        //response.sendRedirect("EMP-INF/login_employee.jsp");

        RequestDispatcher requestDispatcher = request.getRequestDispatcher("EMP-INF/login_employee.jsp");
        requestDispatcher.forward(request, response);
    }






    @Override
    public void destroy() {
        super.destroy();
    }
}
