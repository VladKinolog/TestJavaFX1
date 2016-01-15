package sample;

import java.util.Date;


 // Created by Vladyslav on 13.01.2016.

public class  User {

    private String userName;
    private String userSurename;
    private String userLogin;
    private String userPassword;
    private boolean isAdmine;
    private Date dateRegistration;
    private int userId;


    User(){
    }

    public void setUserName(String userName){
        this.userName = userName;
    }
    public void setUserSurename (String userSurename){
        this.userSurename = userSurename;
    }
    public void setUserLogin (String userLogin){
        this.userLogin = userLogin;
    }
    public void setUserPassword (String userPassword){
        this.userPassword = userPassword;
    }
    public void setIsAdmine (boolean isAdmine){
        this.isAdmine = isAdmine;
    }
    public void dateRegistration(){
        this.dateRegistration = new Date();
    }
    public void setUserId(int id){
        this.userId = id;
    }
    public String getUserName (){
        return this.userName;
    }
    public String getUserSurename (){
        return this.userSurename;
    }
    public String getUserLogin (){
        return this.userLogin;
    }
    public String getUserPassword (){
        return this.userPassword;
    }
    public boolean getIsAdmine (){
        return this.isAdmine;
    }
    public Date getDateRegistration(){
        return this.dateRegistration;
    }
    public int getUserId (){
        return this.userId;
    }

}
