package controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.EmployeeDaoCRUD;
import model.Employee;


@WebServlet("/EmployeServletCRUD")
public class EmployeServletCRUD extends HttpServlet {

    EmployeeDaoCRUD employeeDaoCRUD  = new EmployeeDaoCRUD();;

    @Override
    public void init() throws ServletException {
        super.init();
    }

//    @Override
//    protected void doPost(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//        doGet(request, response);
//    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String action = request.getServletPath();

        try {
            if (action == null) {
                action = "LIST";
            }

            switch (action) {



                case "EDIT":
                    showEditForm(request, response);
                    break;

                case "DELETE":
                    deleteUser(request, response);
                    break;
                case "NEW":
                    showNewForm(request, response);
                    break;
                case "UPDATE":
                    updateUser(request, response);
                    break;
                default:
                    updateUser(request, response);
                    break;

            }
        }catch (SQLException ex) {
            throw new ServletException(ex);
        }

    }



//     public void listUser(HttpServletRequest request, HttpServletResponse response)
//            throws SQLException, IOException, ServletException {
//        List <Employee> ListUser = employeeDaoCRUD.selectAllUsers();
//         HttpSession session = request.getSession();
//         session.setAttribute("listUser", ListUser);
//        RequestDispatcher dispatcher = request.getRequestDispatcher("EMP-INF/employee_details.jsp");
//        dispatcher.forward(request, response);
//    }

     void showNewForm(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        RequestDispatcher dispatcher = request.getRequestDispatcher("user-form.jsp");
        dispatcher.forward(request, response);
    }

     void showEditForm(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, ServletException, IOException {
        String id = (request.getParameter("id"));
        Employee existingUser = employeeDaoCRUD.selectUser(id);
        RequestDispatcher dispatcher = request.getRequestDispatcher("user-form.jsp");
        request.setAttribute("user", existingUser);
        dispatcher.forward(request, response);

    }

     void insertUser(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, IOException {
        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String userName = request.getParameter("userName");
        String password = request.getParameter("password");
        Employee newEmployee = new Employee(firstName, lastName, userName, password);
        employeeDaoCRUD.insertUser(newEmployee);
        response.sendRedirect("list");
    }

     void updateUser(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, IOException {
        String id = (request.getParameter("id"));
        String first_name = request.getParameter("first_name");
        String last_name = request.getParameter("last_name");
        String user_name = request.getParameter("user_name");
        String password = request.getParameter("password");


        Employee book = new Employee(first_name,last_name,user_name,password,id);
        employeeDaoCRUD.updateUser(book);
        response.sendRedirect("list");
    }

     void deleteUser(HttpServletRequest request, HttpServletResponse response)
            throws SQLException, IOException {
        String id = (request.getParameter("id"));
        employeeDaoCRUD.deleteUser(id);
        response.sendRedirect("list");

    }
    @Override
    public void destroy() {
        super.destroy();
    }
}