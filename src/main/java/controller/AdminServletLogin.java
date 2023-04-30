package controller;


import dao.AdminDaoLogin;
import model.Admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;


@WebServlet(name = "AdminServletLogin", value = "/AdminServletLogin")
public class AdminServletLogin extends HttpServlet
{
    AdminDaoLogin adminDaologin = new AdminDaoLogin();


    @Override
    public void init () throws ServletException {
        super.init();
    }

    @Override
    protected void doGet (HttpServletRequest request, HttpServletResponse response) throws
            ServletException, IOException {

    }

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String username = request.getParameter("username");
        String password = request.getParameter("password");
        Admin admin = new Admin(username, password);
        admin.setUserName(username);
        admin.setPassword(password);


        if (adminDaologin.validate(admin)) {
            HttpSession session = request.getSession();
             session.setAttribute("username",username);
            RequestDispatcher requestDispatcher = request.getRequestDispatcher("ADM-INF/admin_DashBoard.jsp");
            requestDispatcher.forward(request, response);
        } else {
            //HttpSession session = request.getSession();
            //session.setAttribute("user", username);
            response.sendRedirect("index.jsp");
        }

    }
}