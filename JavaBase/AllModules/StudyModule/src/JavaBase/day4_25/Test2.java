package JavaBase.day4_25;

import java.util.ArrayList;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Test2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Lock lock = new ReentrantLock();
        Condition producer = lock.newCondition();
        Condition consumer = lock.newCondition();

        new Thread(()->{
            while(true){
                lock.lock();
                try {
                    while (list.size()>0){
                        producer.await();
                    }
                    list.add("大包子");
                    System.out.println(list);
                    consumer.signal();

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }finally {
                    lock.unlock();
                }
            }
        }).start();

        new Thread(()->{
            while(true){
                lock.lock();
                try {
                    while(list.size() == 0){
                        consumer.await();
                    }
                    list.remove(0);
                    System.out.println(list);
                    producer.signal();

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }finally {
                    lock.unlock();
                }
            }
        }).start();
    }
}
