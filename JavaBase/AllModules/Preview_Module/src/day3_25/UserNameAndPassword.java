package day3_25;

public class UserNameAndPassword {
    String userName;
    String password;
    public String getUserName(){
        return userName;
    }
    public void setUserName(String userName){
        this.userName =userName;
    }
    public String getPassword(){
        return password;
    }
    public void setPassword(String userName){
        this.password =password;
    }
    public UserNameAndPassword(){};
    public UserNameAndPassword(String userName,String password){
        this.userName =userName;
        this.password =password;
    }
}
