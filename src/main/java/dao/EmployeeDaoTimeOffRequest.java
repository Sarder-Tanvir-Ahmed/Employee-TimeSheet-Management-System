package dao;

import model.TimeoffRquest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class EmployeeDaoTimeOffRequest {

    public int registerRequest(TimeoffRquest timeoffrquest) {
        int result=0;
        String sql = "INSERT INTO requests" + " (request_id, Timeoff_reason, Requested_Under_Who, Start_date, End_date, Status)  " + "VALUES (?, ?, ?, ?, ?, ?)";
        Connection connection;
        PreparedStatement preparedStatement;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee_db", "root", "locococo66");
            preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setString(1, timeoffrquest.getRequest_id());
            preparedStatement.setString(2, timeoffrquest.getTimeoff_reason());
            preparedStatement.setString(3,timeoffrquest.getRequested_Under_Who());
            preparedStatement.setString(4,timeoffrquest.getStart_date());
            preparedStatement.setString(5,timeoffrquest.getEnd_date());
            preparedStatement.setString(6,timeoffrquest.getStatus());
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
