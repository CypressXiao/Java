package JavaBase.day4_18;

/**
 * 构造方法与重载定义一个网络用户类 要处理的信息有用户ID、用户密码、email地址。在建立类的实例时
 * 把以上三个信息都作为构造函数的参数输入 其中用户ID和用户密码时必须的 缺省的email地址是用户ID加上字符串"@gameschool.com"
 */
public class ObjectOrientedPractice5 {
    public static void main(String[] args) {
        System.out.println(new Username(001,"qwsa"));
        System.out.println(new Username(001,"qwsa","1119005242@qq.com"));
    }
}

class Username{
    int id;
    String password;
    String emailAddress;

    public Username(int id,String password){
        this.id =id;
        this.password =password;
        this.emailAddress = id+"@gameschool.com";
    }

    public Username(int id,String password,String emailAddress){
        this.id =id;
        this.password =password;
        this.emailAddress =emailAddress;
    }

    @Override
    public String toString() {
        return "Username{" +
                "id=" + id +
                ", password='" + password + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                '}';
    }
}
