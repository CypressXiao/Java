package day4_24;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class PracticeDemo3 {
    //有A,B,C三个线程, A线程输出A, B线程输出B, C线程输出C，要求, 同时启动三个线程, 按顺序输出ABC, 循环10次。
    private static int num = 0;

    public static void main(String[] args) {
        Lock l = new ReentrantLock();
        Thread A = new Thread(() -> {
            for (int i = 0; i < 10;) {
                l.lock();
                while (num % 3 == 0) {//共享变量就用while,因为值是共享变化的
                    System.out.println("A");
                    num++;
                    i++;
                }
                l.unlock();
            }
        });

        Thread B = new Thread(() -> {
            for (int i = 0; i < 10;) {
                l.lock();
                while (num % 3 == 1) {
                    System.out.println("B");
                    num++;
                    i++;
                }
                l.unlock();
            }
        });

        Thread C = new Thread(() -> {
            for (int i = 0; i < 10;) {
                l.lock();
                while (num % 3 == 2) {
                    System.out.println("C");
                    num++;
                    i++;
                }
                l.unlock();
            }
        });

        A.start();
        B.start();
        C.start();
    }
}
