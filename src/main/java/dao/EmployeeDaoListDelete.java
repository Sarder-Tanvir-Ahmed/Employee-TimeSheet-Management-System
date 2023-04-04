package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class EmployeeDaoListDelete implements EmployeeDaoIF {

    public boolean deleteUser(String id) throws SQLException {
        String sql = "delete from employee where id = ? ";
        Connection connection;
        PreparedStatement preparedStatement;
        boolean rowDeleted=false;

        try {
            Class.forName("com.mysql.jdbc.Driver").getDeclaredConstructor().newInstance();
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee_db", "root", "locococo66");
            preparedStatement = connection.prepareStatement(sql);
            System.out.println(preparedStatement);
            preparedStatement.setString(1, id);
            rowDeleted = preparedStatement.executeUpdate() >0;
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return rowDeleted;
    }

}
