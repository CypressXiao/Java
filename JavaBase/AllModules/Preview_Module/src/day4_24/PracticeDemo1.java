package day4_24;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class PracticeDemo1 {
    //假设车库有3个车位（可以通过boolean[]数组来表示车库）可以停车，写一个程序模拟多个用户开车离开，
    //停车入库的效果。注意：车位有车时不能停车
    public static void main(String[] args) {
        ExecutorService pool = Executors.newCachedThreadPool();
        int count = 0;
        while((count++)<10){
            pool.execute(new Garage());
        }
    }
}

class Garage implements Runnable {
    static boolean[] b = new boolean[3];//用false表示车位可以停车

    @Override
    public void run() {
        synchronized (b) {
            for (int i = 0; i < b.length; i++) {
                if (!b[i]) {
                    try {
                        System.out.println("当前有车位,请停车");
                        Thread.sleep(100);
                        System.out.println("停车完成,还剩" + (2 - i) + "个空车位");
                        b[i] = true;
                        Thread.sleep(100);
                        return;
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
            System.out.println("当前无空车位!");
        }
    }

}

