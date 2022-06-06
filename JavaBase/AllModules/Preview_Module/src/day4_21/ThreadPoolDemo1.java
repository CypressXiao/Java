package day4_21;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolDemo1 {
    public static void main(String[] args) {
        ExecutorService pool = Executors.newFixedThreadPool(20);
        pool.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println("好好学习,天天向上!");
            }
        });
        pool.shutdown();
    }
}
