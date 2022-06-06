package JavaBase.day4_26;

import java.io.File;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicBoolean;

public class Test1 {
    public static void main(String[] args) {
        ThreadPoolExecutor pool = new ThreadPoolExecutor(3,5,10,
                TimeUnit.SECONDS,new ArrayBlockingQueue<>(1000),new ThreadPoolExecutor.AbortPolicy());
        pool.submit(()->{
            System.out.println("我是自定义线程!");
        });
        pool.shutdown();
    }
}
