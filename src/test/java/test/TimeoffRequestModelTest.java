package test;
import model.TimeoffRquest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TimeoffRequestModelTest {

    @Test
    public void testSetAndGetRequestId() {
        TimeoffRquest request = new TimeoffRquest();
        request.setRequest_id("123");
        Assertions.assertEquals("123", request.getRequest_id());
    }

    @Test
    public void testSetAndGetTimeoffReason() {
        TimeoffRquest request = new TimeoffRquest();
        request.setTimeoff_reason("Vacation");
        Assertions.assertEquals("Vacation", request.getTimeoff_reason());
    }

    @Test
    public void testSetAndGetRequestedUnderWho() {
        TimeoffRquest request = new TimeoffRquest();
        request.setRequested_Under_Who("Manager");
        Assertions.assertEquals("Manager", request.getRequested_Under_Who());
    }

    @Test
    public void testSetAndGetStartDate() {
        TimeoffRquest request = new TimeoffRquest();
        request.setStart_date("2023-05-10");
        Assertions.assertEquals("2023-05-10", request.getStart_date());
    }

    @Test
    public void testSetAndGetEndDate() {
        TimeoffRquest request = new TimeoffRquest();
        request.setEnd_date("2023-05-12");
        Assertions.assertEquals("2023-05-12", request.getEnd_date());
    }

    @Test
    public void testSetAndGetStatus() {
        TimeoffRquest request = new TimeoffRquest();
        request.setStatus("Approved");
        Assertions.assertEquals("Approved", request.getStatus());
    }

    @Test
    public void testConstructorWithAllFields() {
        TimeoffRquest request = new TimeoffRquest("123", "Vacation", "Manager", "2023-05-10", "2023-05-12");
        Assertions.assertEquals("123", request.getRequest_id());
        Assertions.assertEquals("Vacation", request.getTimeoff_reason());
        Assertions.assertEquals("Manager", request.getRequested_Under_Who());
        Assertions.assertEquals("2023-05-10", request.getStart_date());
        Assertions.assertEquals("2023-05-12", request.getEnd_date());
        Assertions.assertEquals("Pending", request.getStatus());
    }

    @Test
    public void testConstructorWithAllFieldsAndStatus() {
        TimeoffRquest request = new TimeoffRquest("123", "Vacation", "Manager", "2023-05-10", "2023-05-12", "Approved");
        Assertions.assertEquals("123", request.getRequest_id());
        Assertions.assertEquals("Vacation", request.getTimeoff_reason());
        Assertions.assertEquals("Manager", request.getRequested_Under_Who());
        Assertions.assertEquals("2023-05-10", request.getStart_date());
        Assertions.assertEquals("2023-05-12", request.getEnd_date());
        Assertions.assertEquals("Approved", request.getStatus());
    }

    @Test
    public void testConstructorWithStatus() {
        TimeoffRquest request = new TimeoffRquest("Approved");
        Assertions.assertEquals("Approved", request.getStatus());
    }
}

/*This test suite tests all the getters and setters of the TimeoffRquest class, as well as the three different constructors.
It uses the Assertions class from JUnit Jupiter to verify that the expected values are returned by the methods.
 */