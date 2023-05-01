package test;

import controller.EmployeeServlet;
import dao.EmployeeDao;
import model.Employee;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

public class EmployeeServletLoginTest {
    @Mock
    HttpServletRequest request;

    @Mock
    HttpServletResponse response;


    @Mock
    RequestDispatcher requestDispatcher;

    @Mock
    EmployeeDao employeeDao;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testDoPost() throws Exception {
        // Mocking the request parameters
        when(request.getParameter("firstName")).thenReturn("John");
        when(request.getParameter("lastName")).thenReturn("Doe");
        when(request.getParameter("userName")).thenReturn("johndoe");
        when(request.getParameter("password")).thenReturn("password");
        when(request.getParameter("Id")).thenReturn("12345");

        // Mocking the request dispatcher
        when(request.getRequestDispatcher(anyString())).thenReturn(requestDispatcher);

        // Mocking the employeeDao
        when(employeeDao.registerEmployee(any(Employee.class))).thenReturn(1);

        // Creating an instance of the controller
        EmployeeServlet controller = new EmployeeServlet();
        controller.employeeDao = employeeDao;

        // Calling the controller method
        controller.doPost(request, response);

        // Verifying that the request dispatcher was called with the expected parameter
        verify(requestDispatcher).forward(request, response);
    }
}


/*This is a unit test for the doPost() method in the EmployeeServlet
 class using Mockito to mock the request, response, and DAO objects.
 */