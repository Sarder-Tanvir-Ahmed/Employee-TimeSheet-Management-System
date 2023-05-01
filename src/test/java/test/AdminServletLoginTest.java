package test;
import dao.AdminDaoLogin;
import controller.AdminServletLogin;
import model.Admin;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import java.io.IOException;

import static org.mockito.Mockito.*;

import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;


public class AdminServletLoginTest extends AdminServletLogin {

    @Mock
    HttpServletRequest request;

    @Mock
    HttpServletResponse response;

    @Mock
    HttpSession session;

    @Mock
    RequestDispatcher requestDispatcher;

    @Mock
    AdminDaoLogin adminDaoLogin;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testDoPostWithValidAdmin() throws Exception {
        // Arrange
        String username = "sHorbo";
        String password = "abc";
        Admin admin = new Admin(username, password);
        Mockito.when(request.getParameter("username")).thenReturn(username);
        Mockito.when(request.getParameter("password")).thenReturn(password);
        Mockito.when(request.getSession()).thenReturn(session);
        Mockito.when(adminDaoLogin.validate(admin)).thenReturn(true);
        Mockito.when(request.getRequestDispatcher("ADM-INF/admin_DashBoard.jsp"))
                .thenReturn(requestDispatcher);

        // Act
        new AdminServletLogin().doPost(request, response);

        // Assert
        Mockito.verify(session).setAttribute("username", username);
        Mockito.verify(requestDispatcher).forward(request, response);
        Mockito.verify(response, Mockito.never()).sendRedirect(Mockito.anyString());
    }

    @Test
    void testDoPostInvalidCredentials() throws IOException, ServletException {
        // Set up test data
        String username = "testuser";
        String password = "testpass";
        Admin admin = new Admin(username, password);

        // Set up mock objects
        when(request.getParameter("username")).thenReturn(username);
        when(request.getParameter("password")).thenReturn(password);
        when(adminDaoLogin.validate(admin)).thenReturn(false);

        // Call doPost() method
        new AdminServletLogin().doPost(request, response);

        // Verify results
        verify(response, times(1)).sendRedirect("index.jsp");
    }
}


/*This is a JUnit test, using Mockito to mock the request, response, and DAO objects
and verifying that the expected request dispatcher method is
  called or a redirect is performed based on the validation result of the admin login.
 */