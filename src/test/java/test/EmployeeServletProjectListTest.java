package test;

import controller.EmployeeServletProjectList;
import dao.EmployeeDaoProjectList;
import model.Project;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;

public class EmployeeServletProjectListTest {

    @Mock
    private HttpServletRequest request;

    @Mock
    private HttpServletResponse response;

    @Mock
    private HttpSession session;

    @Mock
    private RequestDispatcher requestDispatcher;

    @Mock
    private EmployeeDaoProjectList employeeDaoProjectList;

    private EmployeeServletProjectList controller;

    @BeforeEach
    void setUp() {
        // Initialize mocks
        MockitoAnnotations.initMocks(this);

        // Create controller instance and set DAO
        controller = new EmployeeServletProjectList();
        controller.employeeDaoprojectlist = employeeDaoProjectList;
    }

    @Test
    public void testDoGet() throws Exception {
        // Creating a list of projects to be returned by the dao
        List<Project> projectList = new ArrayList<>();
        projectList.add(new Project("1", "Project 1", "John Doe", "2022-01-01", "2022-12-31"));
        projectList.add(new Project("2", "Project 2", "Jane Doe", "2022-03-15", "2022-11-30"));

        // Mocking the dao method to return the list of projects
        when(employeeDaoProjectList.selectAllProjects()).thenReturn(projectList);

        // Mocking the session and request dispatcher
        when(request.getSession()).thenReturn(session);
        when(request.getRequestDispatcher(anyString())).thenReturn(requestDispatcher);

        // Calling the controller method
        controller.doGet(request, response);

        // Verifying that the session was set with the expected attribute
        verify(session).setAttribute(eq("ListProject"), eq(projectList));

        // Verifying that the request dispatcher was called with the expected parameter
        verify(requestDispatcher).forward(request, response);
    }
}



/*This is JUnit test for the doGet() method in the EmployeeServletProjectList class,
using Mockito to mock the request, response, and DAO objects.
 and verifies that the expected request dispatcher method is called so that list in generated
 */