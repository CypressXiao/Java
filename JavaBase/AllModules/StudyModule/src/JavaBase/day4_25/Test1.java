package JavaBase.day4_25;

import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test1 {
    //生产者消费者案例
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        ExecutorService pool = Executors.newCachedThreadPool();
        pool.execute(()->{
            while(true){
                synchronized (list){
                    try {
                        while(list.size()>0){
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
        });

        pool.execute(()->{
            while(true){
                synchronized (list){
                    try {
                        while(list.size()==0){
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
        });
    }
}
