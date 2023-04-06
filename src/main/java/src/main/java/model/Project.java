package model;
import  java.util.Date;

public class Project {

    private String project_id;

    private String Project_name;

    private String Project_Under_Who;

    private String Start_date;

    private String End_date;


    public Project(){ }

    public String getProject_id() {
        return project_id;
    }

    public void setProject_id(String project_id) {
        this.project_id = project_id;
    }

    public String getProject_name() {
        return Project_name;
    }

    public void setProject_name(String project_name) {
        Project_name = project_name;
    }

    public String getProject_Under_Who() {
        return Project_Under_Who;
    }

    public void setProject_Under_Who(String project_Under_Who) {
        Project_Under_Who = project_Under_Who;
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

    public Project(String project_id, String Project_name, String Project_Under_Who, String Start_date, String End_date) {
        super();
        this.Project_name = Project_name;
        this. Project_Under_Who =  Project_Under_Who;
        this.Start_date = Start_date;
        this.End_date = End_date;
        this.project_id = project_id;
    }

    public Project(String Project_name, String Project_Under_Who, String Start_date, String End_date) {
        super();
        this.Project_name = Project_name;
        this.Project_Under_Who = Project_Under_Who;
        this.Start_date = Start_date;
        this.End_date = End_date;

    }


}
