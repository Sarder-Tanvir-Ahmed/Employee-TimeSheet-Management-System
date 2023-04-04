package dao;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Employee;

public class EmployeeDaoList implements EmployeeDaoIF {

    public List<Employee> selectAllUsers() {

        String sql = "select * from employee ";
        Connection connection;
        PreparedStatement preparedStatement;
        List<Employee> employee = new ArrayList<Employee>();


        try {

            Class.forName("com.mysql.jdbc.Driver").getDeclaredConstructor().newInstance();
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee_db", "root", "locococo66");
            preparedStatement = connection.prepareStatement(sql);
            System.out.println(preparedStatement);
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                String id = rs.getString("id");
                String first_name = rs.getString("first_Name");
                String last_name = rs.getString("last_Name");
                String user_name = rs.getString("user_Name");
                String password = rs.getString("password");

                employee.add(new Employee( first_name,last_name, user_name, password,id));      }

        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return employee;
    }




}
