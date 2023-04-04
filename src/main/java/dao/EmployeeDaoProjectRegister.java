package dao;


import model.Project;
import controller.EmployeeServlet;
import java.sql.*;
import java.util.List;
import javax.servlet.*;

import static java.lang.Class.forName;

public class EmployeeDaoProjectRegister {


    public int registerProject(Project project) {
        int result=0;
        String sql = "INSERT INTO projects" + " (project_id, Project_Name, Project_Under_Who, Start_date, End_date)  " + "VALUES (?, ?, ?, ?, ?)";
        Connection connection;
        PreparedStatement preparedStatement;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee_db", "root", "locococo66");
            preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setString(1, project.getProject_id());
            preparedStatement.setString(2, project.getProject_name());
            preparedStatement.setString(3,project.getProject_Under_Who());
            preparedStatement.setString(4,project.getStart_date());
            preparedStatement.setString(5,project.getEnd_date());
            result = preparedStatement.executeUpdate();
            connection.close();

        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return result;
    }


}