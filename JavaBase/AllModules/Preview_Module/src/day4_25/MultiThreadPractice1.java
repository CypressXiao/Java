package day4_25;

//编写两个线程,一个线程打印1-52的整数，另一个线程打印字母A-Z。打印顺序为12A34B56C….5152Z。
// 即按照整数和字母的顺序从小到大打印，并且每打印两个整数后，打印一个字母，交替循环打印，直到打印到整数52和字母Z结束。

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MultiThreadPractice1 {
    static int num = 0;
    public static void main(String[] args) {
        Lock lock = new ReentrantLock();
        new Thread(()->{
            for (int i = 1; i <= 52;) {
                lock.lock();
                while(num%3 == 0 || num%3==1){
                    System.out.println(i);
                    num++;
                    i++;
                }
                lock.unlock();
            }
        }).start();

        new Thread(()->{
            for(char ch ='A';ch<='Z';){
                lock.lock();
                while(num%3 ==2){
                    System.out.println(ch);
                    num++;
                    ch++;
                }
                lock.unlock();
            }
        }).start();
    }
}
