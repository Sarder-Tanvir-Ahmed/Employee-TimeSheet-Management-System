package dao;

import model.TimeoffRquest;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDaoTimeOffRequestList {

    public List<TimeoffRquest> selectAllRequests() {

        String sql = "select * from requests";
        Connection connection;
        PreparedStatement preparedStatement;
        List<TimeoffRquest> request = new ArrayList<TimeoffRquest>();


        try {

            Class.forName("com.mysql.jdbc.Driver").getDeclaredConstructor().newInstance();
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee_db", "root", "locococo66");
            preparedStatement = connection.prepareStatement(sql);
            System.out.println(preparedStatement);
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                String Timeoff_reason = rs.getString("Timeoff_reason");
                String Requested_Under_Who = rs.getString("Requested_Under_Who");
                String Start_date = rs.getString("Start_date");
                String End_date = rs.getString("End_date");
                String request_id = rs.getString("request_id");
                String Status = rs.getString("Status");

                request.add(new TimeoffRquest(request_id,Timeoff_reason, Requested_Under_Who, Start_date, End_date, Status));      }

        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return request;
    }




}