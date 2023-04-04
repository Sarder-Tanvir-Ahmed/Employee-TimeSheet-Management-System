package dao;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Project;

public class EmployeeDaoProjectList {

    public List<Project> selectAllProjects() {

        String sql = "select * from projects ";
        Connection connection;
        PreparedStatement preparedStatement;
        List<Project> project = new ArrayList<Project>();


        try {

            Class.forName("com.mysql.jdbc.Driver").getDeclaredConstructor().newInstance();
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee_db", "root", "locococo66");
            preparedStatement = connection.prepareStatement(sql);
            System.out.println(preparedStatement);
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                String Project_name = rs.getString("Project_Name");
                String Project_Under_Who = rs.getString("Project_Under_Who");
                String Start_date = rs.getString("Start_date");
                String End_date = rs.getString("End_date");
                String project_id = rs.getString("project_id");


                project.add(new Project(project_id,Project_name,Project_Under_Who, Start_date, End_date));      }

        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return project;
    }




}
