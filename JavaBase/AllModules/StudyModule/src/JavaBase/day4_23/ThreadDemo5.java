package JavaBase.day4_23;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ThreadDemo5 {
    public static void main(String[] args) {
        Demo4 d = new Demo4();
        Thread th1 = new Thread(d);
        Thread th2 = new Thread(d);
        Thread th3 = new Thread(d);
        th1.setName("湖人");
        th2.setName("勇士");
        th3.setName("篮网");

        th1.start();
        th2.start();
        th3.start();
    }
}

class Demo4 implements Runnable {
    private int total = 100;
    final Lock l = new ReentrantLock();

    @Override
    public void run() {
        while (true) {
            l.lock();
            try {
                Thread.sleep(50);
                if (total > 0) {
                    System.out.println(Thread.currentThread().getName() + "====" + (total--));
                } else {
                    break;
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                l.unlock();
            }
        }
    }
}



