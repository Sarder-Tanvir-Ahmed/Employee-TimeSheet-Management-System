package dao;

import model.Attendance;


import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDaoAttendance {

    public int registerAttendance(Attendance attendance) {
        int result=0;
        String sql = "INSERT INTO attendence" + " (attendance_id,employee_id, DateofDay)  " + "VALUES (?, ?, ?)";
        Connection connection;
        PreparedStatement preparedStatement;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee_db", "root", "locococo66");
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,attendance.getAttendance_id());
            preparedStatement.setString(2,attendance.getEmployee_id());
            preparedStatement.setString(3,attendance.getDateofDay());
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

    public List<Attendance> selectAllUsers() {

        String sql = "select * from attendence ";
        Connection connection;
        PreparedStatement preparedStatement;
        List<Attendance> employee = new ArrayList<Attendance>();


        try {

            Class.forName("com.mysql.jdbc.Driver").getDeclaredConstructor().newInstance();
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee_db", "root", "locococo66");
            preparedStatement = connection.prepareStatement(sql);
            System.out.println(preparedStatement);
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                String id = rs.getString("attendance_id");
                String employee_id = rs.getString("employee_id");
                String dateofday = rs.getString("DateofDay");


                employee.add(new Attendance(id, employee_id, dateofday ));      }

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
