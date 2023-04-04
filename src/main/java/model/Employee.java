package model;


public class Employee {

    private String firstName;

    private String lastName;
    private String userName;
    private String password;

  
    private String Id;

    public Employee(){ }



    public Employee(String firstName, String lastName, String userName, String password, String Id) {
        super();
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.password = password;
        this.Id = Id;
    }

    public Employee(String firstName, String lastName, String userName, String password) {
        super();
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.password = password;

    }




    public Employee(String userName, String password) {

        this.userName = userName;
        this.password = password;

    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

}
