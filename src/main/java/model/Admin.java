package model;

public class Admin {


    private String userName;
    private String password;
    private String Id;

    public Admin(){ }





    public Admin(String userName, String password) {

        this.userName = userName;
        this.password = password;

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
