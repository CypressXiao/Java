package JavaBase.day4_26;

import java.util.concurrent.*;

public class ExecutorsDemo1 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService pool1 = Executors.newCachedThreadPool();
        Future<Integer> f = pool1.submit(()->{//submit可以传Callable的实现类,重写的是call方法;
            int sum =0;
            for (int i = 0; i <=100; i++) {
                sum+=i;
            }
            return sum;
        });
        System.out.println(f.get());

        final ExecutorService pool2 = Executors.newFixedThreadPool(3);
        pool2.execute(()->{
            System.out.println("我是Fixed线程池!");
        });
        pool2.shutdown();

        ExecutorService pool3 = Executors.newSingleThreadExecutor();
        pool3.submit(()->{
            System.out.println("我是Single线程池!");
        });
        pool3.shutdown();

        ThreadPoolExecutor pool4 = new ThreadPoolExecutor(3,4,10,TimeUnit.SECONDS,
                new ArrayBlockingQueue<Runnable>(100),new ThreadPoolExecutor.AbortPolicy());
        pool4.submit(()->{
            System.out.println("我是自定义线程池");
        });
        pool4.shutdown();
    }
}
