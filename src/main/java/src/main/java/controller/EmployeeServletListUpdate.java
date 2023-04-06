package controller;


import dao.EmployeeDaoListUpdate;
import model.Employee;
import java.sql.SQLException;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

import java.util.List;


@WebServlet(name = "EmployeeServletListUpdate", value = "/EmployeeServletListUpdate")
public class EmployeeServletListUpdate extends HttpServlet {
    EmployeeDaoListUpdate employeeDaolistupdate = new EmployeeDaoListUpdate();


    @Override
    public void init() throws ServletException {
        super.init();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws
            ServletException, IOException {

        try {

            String id = (request.getParameter("id"));
            Employee existingUser = employeeDaolistupdate.selectUser(id);
            HttpSession session = request.getSession();
            request.setAttribute("user", existingUser);


            String first_name = request.getParameter("first_name");
            String last_name = request.getParameter("last_name");
            String user_name = request.getParameter("user_name");
            String password = request.getParameter("password");
            String Id = request.getParameter("Id");

            Employee book = new Employee(first_name,last_name,user_name,password,Id);
            employeeDaolistupdate.updateUser(book);

            RequestDispatcher requestDispatcher = request.getRequestDispatcher("/EmployeeServletList");
            requestDispatcher.forward(request, response);



        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {


    }

}