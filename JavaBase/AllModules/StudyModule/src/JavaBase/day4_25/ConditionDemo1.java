package JavaBase.day4_25;

import java.util.ArrayList;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ConditionDemo1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Lock lock = new ReentrantLock();
        Condition producer = lock.newCondition();
        Condition consumer = lock.newCondition();

        new Thread(() -> {
            while (true) {
                lock.lock();
                try {
                    if (list.size() == 0) {
                        list.add("包子");
                    }
                    System.out.println(list);
                    Thread.sleep(100);
                    consumer.signal();
                    producer.await();

                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    lock.unlock();
                }
            }
        }, "生产者").start();

        new Thread(() -> {
            while (true) {
                lock.lock();
                try {
                    if (list.size() > 0) {
                        list.remove(0);
                    }
                    System.out.println(list);
                    Thread.sleep(100);
                    producer.signal();
                    consumer.await();

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }finally {
                    lock.unlock();
                }
            }
        },"消费者").start();
    }
}
