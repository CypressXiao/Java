package day4_23;


import java.util.concurrent.CountDownLatch;

public class CountDownLatchDemo {
    public static void main(String[] args) throws InterruptedException {
        int num = 5;
        final CountDownLatch countDownLatch = new CountDownLatch(num);
        for (int i = 0; i < 5; i++) {
            Thread th = new Thread(new Demo("子线程"+(i+100),countDownLatch));
            th.start();
        }
        System.out.println("主线程阻塞");
        countDownLatch.await();
        System.out.println("主线程执行!");
    }
}

class Demo implements Runnable{
    private final String name;
    private final CountDownLatch countDownLatch;

    public Demo(String name, CountDownLatch countDownLatch) {
        this.name = name;
        this.countDownLatch = countDownLatch;
    }

    @Override
    public void run() {
        System.out.println(name+"执行!");
        countDownLatch.countDown();
    }
}


