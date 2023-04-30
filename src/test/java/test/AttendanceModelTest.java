package test;

import model.Attendance;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AttendanceModelTest {
    @Test
    public void testAttendanceConstructorAndGetters() {
        Attendance attendance = new Attendance("1", "2", "2023-05-01");

        Assertions.assertEquals("1", attendance.getAttendance_id());
        Assertions.assertEquals("2", attendance.getEmployee_id());
        Assertions.assertEquals("2023-05-01", attendance.getDateofDay());
    }

    @Test
    public void testAttendanceSetters() {
        Attendance attendance = new Attendance("1", "2", "2023-05-01");
        attendance.setAttendance_id("3");
        attendance.setEmployee_id("4");
        attendance.setDateofDay("2023-05-02");

        Assertions.assertEquals("3", attendance.getAttendance_id());
        Assertions.assertEquals("4", attendance.getEmployee_id());
        Assertions.assertEquals("2023-05-02", attendance.getDateofDay());
    }
}
