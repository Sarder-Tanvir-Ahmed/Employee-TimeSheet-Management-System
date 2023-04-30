package dao;

import model.TimeoffRquest;

import java.sql.*;

public class EmployeeDaotfRquestApprove {
    public boolean updateRequest(TimeoffRquest tfrequest) throws SQLException {
        String sql = "update requests set Status =? where request_id = ? ";
        Connection connection;
        PreparedStatement preparedStatement;

        boolean rowUpdated=false;

        try {
            Class.forName("com.mysql.jdbc.Driver").getDeclaredConstructor().newInstance();
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee_db", "root", "locococo66");
            preparedStatement = connection.prepareStatement(sql);
            System.out.println(preparedStatement);
            preparedStatement.setString(1, tfrequest.getStatus());
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

    public TimeoffRquest selectRequest(String id) throws SQLException {

        String sql = "select Status from requests where request_id =? ";
        Connection connection;
        PreparedStatement preparedStatement;
        TimeoffRquest tfrequest = null;

        try {
            Class.forName("com.mysql.jdbc.Driver").getDeclaredConstructor().newInstance();
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee_db", "root", "locococo66");
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, id);
            System.out.println(preparedStatement);
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {

                String Status = rs.getString("Status");
                tfrequest = new TimeoffRquest(Status);
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

        return tfrequest;
    }

    public boolean approveRequest(String id) throws SQLException {
        String sql = "update requests set Status ='Approved' where request_id = ?";
        Connection connection;
        PreparedStatement preparedStatement;
        boolean rowUpdated=false;

        try {
            Class.forName("com.mysql.jdbc.Driver").getDeclaredConstructor().newInstance();
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee_db", "root", "locococo66");
            preparedStatement = connection.prepareStatement(sql);
            System.out.println(preparedStatement);
            preparedStatement.setString(1, id);
            rowUpdated = preparedStatement.executeUpdate() >0;
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



}








