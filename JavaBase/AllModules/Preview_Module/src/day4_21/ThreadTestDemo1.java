package day4_21;

public class ThreadTestDemo1 {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 'A'; i <='Z' ; i++) {
                    System.out.println("大写字母:"+(char)(i));
                }
            }
        }).start();

        Thread th = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 'a'; i <='z' ; i++) {
                    System.out.println("小写字母"+(char)i);
                }
            }
        });
        th.start();
    }
}
