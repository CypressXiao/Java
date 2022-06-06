package day4_25;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class OrderPrintDemo1 {
    static int num = 0;
    //有A,B,C三个线程, A线程输出A, B线程输出B, C线程输出C，要求, 同时启动三个线程, 按顺序输出ABC, 循环10次。
    public static void main(String[] args) {
       Lock lock = new ReentrantLock();


       //线程A
        new Thread(()->{
            for (int i = 0; i < 10;) {
                lock.lock();
                //通过无限循环来
                while(num %3 ==0){
                    System.out.println("A");
                    num++;
                    i++;
                }
                lock.unlock();
            }
        }).start();

        new Thread(()->{
            for (int i = 0; i < 10;) {
                lock.lock();
                while(num %3 ==1){
                    System.out.println("B");
                    num++;
                    i++;
                }
                lock.unlock();
            }
        }).start();

        new Thread(()->{
            for (int i = 0; i < 10;) {
                lock.lock();
                while(num %3 ==2){
                    System.out.println("C");
                    num++;
                    i++;
                }
                lock.unlock();
            }
        }).start();
    }
}
