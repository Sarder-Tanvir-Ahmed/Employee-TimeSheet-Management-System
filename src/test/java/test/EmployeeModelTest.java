package test;

import model.Employee;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EmployeeModelTest {
    @Test
    public void testEmployeeGettersAndSetters() {
        Employee employee = new Employee();
        employee.setFirstName("John");
        employee.setLastName("Doe");
        employee.setUserName("johndoe");
        employee.setPassword("password");
        employee.setId("123");

        Assertions.assertEquals("John", employee.getFirstName());
        Assertions.assertEquals("Doe", employee.getLastName());
        Assertions.assertEquals("johndoe", employee.getUserName());
        Assertions.assertEquals("password", employee.getPassword());
        Assertions.assertEquals("123", employee.getId());
    }

    @Test
    public void testEmployeeConstructor() {
        Employee employee = new Employee("John", "Doe", "johndoe", "password");

        Assertions.assertEquals("John", employee.getFirstName());
        Assertions.assertEquals("Doe", employee.getLastName());
        Assertions.assertEquals("johndoe", employee.getUserName());
        Assertions.assertEquals("password", employee.getPassword());
    }
}