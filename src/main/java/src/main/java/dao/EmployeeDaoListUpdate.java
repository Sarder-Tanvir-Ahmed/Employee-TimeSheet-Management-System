package dao;

import model.Employee;

import java.sql.*;

public class EmployeeDaoListUpdate implements EmployeeDaoIF {

    public boolean updateUser(Employee employee) throws SQLException {
        String sql = "update employee set first_name = ?,last_name= ?,user_name =?, password=? where id = ? ";
        Connection connection;
        PreparedStatement preparedStatement;

        boolean rowUpdated=false;

        try {
            Class.forName("com.mysql.jdbc.Driver").getDeclaredConstructor().newInstance();
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee_db", "root", "locococo66");
            preparedStatement = connection.prepareStatement(sql);
            System.out.println(preparedStatement);
            preparedStatement.setString(1, employee.getFirstName());
            preparedStatement.setString(2, employee.getLastName());
            preparedStatement.setString(3, employee.getUserName());
            preparedStatement.setString(4, employee.getPassword());
            preparedStatement.setString(5, employee.getId());
            System.out.println(preparedStatement);
            rowUpdated = preparedStatement.executeUpdate() > 0;
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return rowUpdated;
    }

    public Employee selectUser(String id) throws SQLException {

        String sql = "select id,first_name,last_name, user_name, password from employee where id =? ";
        Connection connection;
        PreparedStatement preparedStatement;
        Employee employee = null;

        try {
            Class.forName("com.mysql.jdbc.Driver").getDeclaredConstructor().newInstance();
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee_db", "root", "locococo66");
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, id);
            System.out.println(preparedStatement);
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                String first_name = rs.getString("first_name");
                String last_name = rs.getString("last_name");
                String password = rs.getString("password");
                String user_name = rs.getString("user_name");
                employee = new Employee(first_name, last_name, user_name, password, id);
            }


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
