package model;

public class Attendance {
    private String attendance_id;
    private String employee_id;
    private String DateofDay;


    public Attendance(String attendance_id, String employee_id, String DateofDay) {
        super();
        this.attendance_id= attendance_id;
        this.employee_id = employee_id;
        this.DateofDay = DateofDay;
    }

    public String getAttendance_id() {
        return attendance_id;
    }

    public void setAttendance_id(String attendance_id) {
        this.attendance_id = attendance_id;
    }

    public String getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(String employee_id) {
        this.employee_id = employee_id;
    }

    public String getDateofDay() {
        return DateofDay;
    }

    public void setDateofDay(String dateofDay) {
        DateofDay = dateofDay;
    }
}
