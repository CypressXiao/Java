package LogAndRegisterProject;

import java.io.Serializable;

//序列化用户类,使得其创建的对象可以写入文件中
public class User implements Serializable {
    private static final long serialVersionUID = 1L;
    private String userName;
    private String password;
    private int score;

    public User() {
    }

    public User(String userName, String password, int score) {
        this.userName = userName;
        this.password = password;
        this.score = score;
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

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", score=" + score +
                '}';
    }
}
