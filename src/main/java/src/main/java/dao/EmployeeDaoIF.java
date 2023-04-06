package dao;

import model.Employee;

import java.sql.SQLException;
import java.util.List;

public interface EmployeeDaoIF {

    public default void insertUser(Employee employee)  {}

    public default Employee selectUser(String id) throws SQLException {
        return null;
    }

    public default List<Employee> selectAllUsers() {
        return null;
    }

    public default boolean deleteUser(String id) throws SQLException {
        return false;
    }

    public default boolean updateUser(Employee employee) throws SQLException {
        return false;
    }



}
