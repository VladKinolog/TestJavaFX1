package sample;

import javafx.beans.property.BooleanProperty;
import javafx.beans.property.StringProperty;

import java.time.LocalDate;
import java.time.ZoneId;


/**
 * Created by Vladyslav on 14.01.2016.
 */
public class UserProperties {

    private  StringProperty userName;
    private  StringProperty userSurename;
    private  StringProperty userLogin;
    private  StringProperty userPassword;
    private  BooleanProperty isAdmine;
    private  LocalDate  dateRegistration;
    private  int userId;


    public UserProperties() {
       // this(null,null);
    }
    /*
      public UserProperties(*,*)
      TODO  Добавить конструкторы класса

    **/

    public void setUserName(String userName) {
        this.userName.set(userName);
    }
    public String getUserName(){
        return userName.get();
    }
    public StringProperty getUserNameProperty(){
        return userName;
    }

    //--------------------------------------------------------------------

    public void setUserSurename (String userSurename){
        this.userSurename.set(userSurename);
    }
    public String getUserSurname (){
        return userSurename.get();
    }
    public StringProperty getUserSurenameProperty(){
        return userSurename;
    }

    //--------------------------------------------------------------------

    public void setUserLogin (String userLogin){
        this.userLogin.set(userLogin);
    }
    public String getUserLogin (){
        return userLogin.get();
    }
    public StringProperty getUsetLoginProperty (){
        return userLogin;
    }

    //----------------------------------------------------------------------

    public void setUserPassword (String userPassword){
        this.userPassword.set(userPassword);
    }
    public String getUserPassword (){
        return userPassword.get();
    }
    public StringProperty getUserPasswordProperty(){
        return userPassword;
    }

    //-----------------------------------------------------------------------

    public void setIsAdmin (boolean isAdmin){
        this.isAdmine.set(isAdmin);
    }
    public boolean getIsAdmin (){
        return isAdmine.get();
    }
    public BooleanProperty getIsAdminProperty(){
        return isAdmine;
    }

    //------------------------------------------------------------------------

    public void setUserId (int userId){
        this.userId = userId;
    }
    public int getUserId (){
        return userId;
    }

    public void setDateRegistration (){
        //Получение текущей даты по часовому поясу Украины.
        this.dateRegistration = LocalDate.now(ZoneId.of("UTC+02:00"));
    }
    public LocalDate getDateRegistration(){
        return dateRegistration;
    }

    //-----------------------------------------------------------------------

}

