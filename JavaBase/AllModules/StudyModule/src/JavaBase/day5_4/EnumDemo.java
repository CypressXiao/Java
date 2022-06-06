package JavaBase.day5_4;

/**
 * @ClassName EnumDemo
 * @Description TODO
 * @Author 肖榆柏
 * @Date 2022/5/4 9:20
 * @Version 1.0
 */

public class EnumDemo {
    public static void main(String[] args) {
        switch(UserAction.LOGIN){
            case LOGIN:
                System.out.println("登录");
                break;
            case REGISTER:
                System.out.println("注册");
                break;
            case EXIT:
                System.out.println("退出");
                break;
            default:
                System.out.println("错误");
        }

    }
}

enum UserAction{
    LOGIN,REGISTER,EXIT;
}
