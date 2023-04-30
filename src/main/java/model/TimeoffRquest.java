package model;

public class TimeoffRquest {

    private String request_id;

    private String Timeoff_reason;

    private String Requested_Under_Who;

    private String Start_date;

    private String End_date;



    private String Status = "Pending";


    public TimeoffRquest(){ }

    public String getRequest_id() {
        return request_id;
    }

    public void setRequest_id(String request_id) {
        this.request_id = request_id;
    }

    public String getTimeoff_reason() {
        return Timeoff_reason;
    }

    public void setTimeoff_reason(String timeoff_reason) {
        Timeoff_reason = timeoff_reason;
    }

    public String getRequested_Under_Who() {
        return Requested_Under_Who;
    }

    public void setRequested_Under_Who(String requested_Under_Who) {
        Requested_Under_Who = requested_Under_Who;
    }

    public String getStart_date() {
        return Start_date;
    }

    public void setStart_date(String start_date) {
        Start_date = start_date;
    }

    public String getEnd_date() {
        return End_date;
    }

    public void setEnd_date(String end_date) {
        End_date = end_date;
    }

    public void setStatus(String status) {
        Status = status;
    }

    public String getStatus() {
        return Status;
    }



    public TimeoffRquest(String request_id, String Timeoff_reason, String Requested_Under_Who, String Start_date, String End_date) {
        super();
        this.Timeoff_reason = Timeoff_reason;
        this.Requested_Under_Who =  Requested_Under_Who;
        this.Start_date = Start_date;
        this.End_date = End_date;
        this.request_id = request_id;

    }

    public TimeoffRquest(String request_id, String Timeoff_reason, String Requested_Under_Who, String Start_date, String End_date, String status) {
        super();
        this.Timeoff_reason = Timeoff_reason;
        this.Requested_Under_Who = Requested_Under_Who;
        this.Start_date = Start_date;
        this.End_date = End_date;
        this.request_id = request_id;
        this.Status = status;

    }
    public TimeoffRquest(String status) {
        this.Status = status;
    }


}