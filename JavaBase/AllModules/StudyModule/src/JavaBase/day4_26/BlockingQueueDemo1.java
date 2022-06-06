package JavaBase.day4_26;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.atomic.AtomicBoolean;

public class BlockingQueueDemo1 {
    public static void main(String[] args) {
        //ArrayBlockingQueue<Integer> abq = new ArrayBlockingQueue<>(10000);
        //LinkedBlockingDeque<Integer> abq = new LinkedBlockingDeque<>();
        SynchronousQueue<Integer> abq = new SynchronousQueue<>();
        AtomicBoolean flag = new AtomicBoolean(true);

        new Thread(()->{
            for (int i = 0; i < 2000; i++) {
                try {
                    abq.put(i);
                    System.out.println("输入线程:"+i);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            flag.set(false);
        }).start();

        new Thread(()->{
            do {
                try {
                    System.out.println("输出线程" + abq.take());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } while (flag.get() || !abq.isEmpty());
        }).start();

    }
}
