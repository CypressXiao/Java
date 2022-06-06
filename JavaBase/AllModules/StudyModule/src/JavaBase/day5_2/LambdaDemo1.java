package JavaBase.day5_2;

public class LambdaDemo1 {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("胡冠雨是个大好人!");
            }
        }).start();

        new Thread(()-> System.out.println("胡冠雨是个大大好人!")).start();

    }
}
