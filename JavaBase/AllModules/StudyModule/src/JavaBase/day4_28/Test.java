package JavaBase.day4_28;


import java.util.ArrayList;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

//消费者,生产者案例!
public class Test {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

       /* //生产者
        new Thread(()->{
            synchronized (Test.class) {
                try {
                    while (true) {
                        if(list.size()>0){
                            Test.class.wait();
                        }
                        list.add("上海垃圾!");
                        System.out.println(list);
                        Test.class.notify();
                    }

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();

        //消费者
        new Thread(()->{
            synchronized (Test.class){
                try {
                    while (true){
                        if(list.size() == 0){
                            Test.class.wait();
                        }
                        list.remove(0);
                        System.out.println(list);
                        Test.class.notify();
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();*/

        Lock l1 = new ReentrantLock();
        Condition producer = l1.newCondition();
        Condition consumer = l1.newCondition();

        new Thread(()->{
            while(true){
                l1.lock();
                try {
                    while(list.size()>4){
                        producer.await();
                    }
                    list.add("我要回成都!");
                    System.out.println(list);
                    consumer.signal();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }finally {
                    l1.unlock();
                }
            }
        }).start();

        new Thread(()->{
            while(true){
                l1.lock();
                try {
                    while(list.size()==0){
                        consumer.await();
                    }
                    list.remove(0);
                    System.out.println(list);
                    producer.signal();

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        }).start();
    }
}
