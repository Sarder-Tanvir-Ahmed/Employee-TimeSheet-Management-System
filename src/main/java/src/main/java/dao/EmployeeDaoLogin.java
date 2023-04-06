package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.Employee;

public class EmployeeDaoLogin {

    public boolean validate(Employee employee) {
        boolean status = false;

        String sql = "select * from employee where user_name = ? and password = ? ";
        Connection connection;
        PreparedStatement preparedStatement;


        try {
            Class.forName("com.mysql.jdbc.Driver").getDeclaredConstructor().newInstance();
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee_db", "root", "locococo66");
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, employee.getUserName());
            preparedStatement.setString(2, employee.getPassword());

            System.out.println(preparedStatement);
            ResultSet rs = preparedStatement.executeQuery();
            status = rs.next();

        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return status;
    }
}