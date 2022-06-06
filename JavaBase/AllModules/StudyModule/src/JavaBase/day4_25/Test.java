package JavaBase.day4_25;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        //生产者
        new Thread(() -> {
            while (true) {
                synchronized (list) {
                    try {
                        while (list.size() > 0) {
                            list.wait();
                        }
                        list.add("肉包子");
                        System.out.println(list);
                        list.notify();

                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }, "生产者").start();

        //消费者
        new Thread(() -> {
            while (true) {
                synchronized (list) {
                    try {
                        while (list.size() == 0) {
                            list.wait();
                        }
                        list.remove(0);
                        System.out.println(list);
                        list.notify();

                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        },"消费者").start();
    }
}
