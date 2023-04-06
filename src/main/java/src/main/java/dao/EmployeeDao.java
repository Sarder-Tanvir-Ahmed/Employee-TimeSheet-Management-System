package dao;


import model.Employee;
import controller.EmployeeServlet;
import java.sql.*;
import java.util.List;
import javax.servlet.*;

import static java.lang.Class.forName;

public class EmployeeDao {


    public int registerEmployee(Employee employee) {
        int result=0;
        String sql = "INSERT INTO employee_db.employee" + " (first_name,last_name, user_name, password, Id)  " + "VALUES (?, ?, ?, ?, ?)";
        Connection connection;
        PreparedStatement preparedStatement;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee_db", "root", "locococo66");
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, employee.getFirstName());
            preparedStatement.setString(2, employee.getLastName());
            preparedStatement.setString(3,employee.getUserName());
            preparedStatement.setString(4,employee.getPassword());
            preparedStatement.setString(5,employee.getId());
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

