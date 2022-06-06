package day4_21;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolDemo {
    public static void main(String[] args) {
        ExecutorService pool = Executors.newCachedThreadPool();
        pool.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println("AAAA");
            }
        });//缓存线程池,内部线程数量无限,默认等待时间60s
        pool.shutdown();
    }

}
