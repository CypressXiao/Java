package JavaBase.day4_25;

import java.util.ArrayList;

public class ProducerAndConsumerDemo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Object lock = new Object();
        Thread t1 = new Thread(() -> {
            while (true) {
                synchronized (lock) {
                    try {
                        while (list.size() > 0) {
                            lock.wait();
                        }
                        list.add("包子");
                        System.out.println(list);
                        lock.notify();

                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        Thread t2 = new Thread(() -> {
            while (true) {
                synchronized (lock) {
                    while (list.size() == 0) {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    list.remove(0);
                    System.out.println(list);
                    lock.notify();
                }
            }
        });

        t1.start();
        t2.start();
    }
}
