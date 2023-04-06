package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Employee;
import dao.EmployeeDao;

public class EmployeeDaoCRUD implements EmployeeDaoIF {

    String INSERT_USERS_SQL = "INSERT INTO employee" + "  (,first_name, last_name, user_name, password) VALUES " +
            " (?, ?, ?);";

    String SELECT_USER_BY_ID = "select id,first_name,last_name, user_name, password from employee where id =?";
    String SELECT_ALL_USERS = "SELECT * from employee";
    String DELETE_USERS_SQL = "delete from employee where id = ?";
    String UPDATE_USERS_SQL = "update employee set first_name = ?,last_name= ?,user_name =?, password=? where id = ?;";

    public EmployeeDaoCRUD() {
    }

    protected Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName("com.mysql.jdbc.Driver").getDeclaredConstructor().newInstance();
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee_db", "root", "locococo66");
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return connection;
    }

    @Override
    public void insertUser(Employee employee) {
        System.out.println(INSERT_USERS_SQL);

        try (Connection connection = getConnection(); PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USERS_SQL)) {

            preparedStatement.setString(1, employee.getFirstName());
            preparedStatement.setString(2, employee.getLastName());
            preparedStatement.setString(3, employee.getUserName());
            preparedStatement.setString(4, employee.getPassword());
            preparedStatement.setString(5, employee.getId());
            System.out.println(preparedStatement);
            preparedStatement.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public Employee selectUser(String id) throws SQLException {
        Employee employee = null;
        // Step 1: Establishing a Connection
        try (Connection connection = getConnection();
             // Step 2:Create a statement using connection object
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_USER_BY_ID);) {
            preparedStatement.setString(1, id);
            System.out.println(preparedStatement);
            // Step 3: Execute the query or update query
            ResultSet rs = preparedStatement.executeQuery();

            // Step 4: Process the ResultSet object.
            while (rs.next()) {
                String first_name = rs.getString("first_name");
                String last_name = rs.getString("last_name");
                String password = rs.getString("password");
                String user_name = rs.getString("user_name");
                employee = new Employee(first_name, last_name, user_name, password, id);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return employee;
    }
}

//    public List<Employee> selectAllUsers() {
//
//
//        List<Employee> employee = new ArrayList<Employee>();
//        // Step 1: Establishing a Connection
//        try (Connection connection = getConnection();
//
//             // Step 2:Create a statement using connection object
//             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_USERS);) {
//            System.out.println(preparedStatement);
//            // Step 3: Execute the query or update query
//            ResultSet rs = preparedStatement.executeQuery();
//
//            // Step 4: Process the ResultSet object.
//            while (rs.next()) {
//                String id = rs.getString("Id");
//                String first_name = rs.getString("first_Name");
//                String last_name = rs.getString("last_Name");
//                String user_name = rs.getString("user_Name");
//                String password = rs.getString("password");
//
//                employee.add(new Employee( first_name,last_name, user_name, password,id));      }
//        }
//         catch (Exception e) {
//            e.printStackTrace();
//        }
//        return employee;
//    }

//    public boolean deleteUser(String id) throws SQLException {
//        boolean rowDeleted;
//        try (Connection connection = getConnection(); PreparedStatement statement = connection.prepareStatement(DELETE_USERS_SQL);) {
//            statement.setString(1, id);
//            rowDeleted = statement.executeUpdate() >0;
//        }
//        return rowDeleted;
//    }

//    public boolean updateUser(Employee employee) throws SQLException {
//        boolean rowUpdated;
//        try (Connection connection = getConnection(); PreparedStatement statement = connection.prepareStatement(UPDATE_USERS_SQL);) {
//            statement.setString(1, employee.getFirstName());
//            statement.setString(2, employee.getLastName());
//            statement.setString(3, employee.getUserName());
//            statement.setString(4, employee.getPassword());
//            statement.setString(5, employee.getId());
//
//            rowUpdated = statement.executeUpdate() > 0;
//        }
//
//        return rowUpdated;
//    }
//}