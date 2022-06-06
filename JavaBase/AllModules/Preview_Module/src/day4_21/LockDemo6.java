package day4_21;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockDemo6 {
    public static void main(String[] args) {
        Lock lock = new ReentrantLock();
        Demo10 d1 = new Demo10(lock);
        Demo10 d2 = new Demo10(lock);
        Demo10 d3 = new Demo10(lock);

        d1.start();
        d2.start();
        d3.start();

    }
}

class Demo10 extends Thread {
    static int tickets = 100;
    Lock lock;

    public Demo10(Lock lock){
        this.lock = lock;
    }
    @Override
    public void run() {
        while (true) {
            lock.lock();
            try {
                if (tickets > 0) {
                    try {
                        Thread.sleep(30);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + "===正在出售第" + (tickets--) + "张票");
                } else {
                    break;
                }
            } finally {
                lock.unlock();
            }
        }
    }
}