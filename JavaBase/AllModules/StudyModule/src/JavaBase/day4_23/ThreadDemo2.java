package JavaBase.day4_23;

public class ThreadDemo2 {
    public static void main(String[] args) throws InterruptedException {
        final Thread thread = new Thread(new MySum());
        thread.start();
        thread.join();
        System.out.println(MySum.sum);
    }
}

class MySum implements Runnable{
    public static int sum =0;

    @Override
    public void run() {
        for (int i = 0; i <= 100; i++) {
            sum+=i;
        }
    }
}
