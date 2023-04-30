package test;
import model.Admin;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AdminModelTest {
    @Test
    public void testGettersAndSetters() {
        Admin admin = new Admin();
        admin.setUserName("admin");
        admin.setPassword("password");
        admin.setId("123");

        Assertions.assertEquals("admin", admin.getUserName());
        Assertions.assertEquals("password", admin.getPassword());
        Assertions.assertEquals("123", admin.getId());
    }

    @Test
    public void testConstructor() {
        Admin admin = new Admin("admin", "password");

        Assertions.assertEquals("admin", admin.getUserName());
        Assertions.assertEquals("password", admin.getPassword());
    }
}

/*In the first test, we create an instance of the Attendance class using the constructor and then use the getter methods to check that the values we passed in are stored correctly.

In the second test, we create an instance of the Attendance class and then use the setter methods to change the values. We then use the getter methods to check that the new values are stored correctly.

 */