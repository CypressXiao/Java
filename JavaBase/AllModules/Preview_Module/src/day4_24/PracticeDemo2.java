package day4_24;

public class PracticeDemo2 {
    //假设车库有3个车位（可以通过boolean[]数组来表示车库）可以停车，写一个程序模拟多个用户开车离开，
    //停车入库的效果。注意：车位有车时不能停车
    static Object obj = new Object();
    static int num = 3;

    public static void main(String[] args) {
        //停车
        Thread t1 = new Thread(() -> {
            synchronized (obj) {
                try {
                    while (true) {
                        if (num == 0) {
                            System.out.println("车位已满!");
                            obj.wait();
                        }
                        num--;
                        System.out.println("停车成功,当前剩余车位为:" + num);
                        obj.notify();
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();

                }
            }
        });
        //出车
        Thread t2 = new Thread(() -> {
            synchronized (obj) {
                try {
                    while (true) {
                        while (true) {
                            Thread.sleep(1000);
                            if(num == 3){
                                obj.wait();
                            }
                            num++;
                            System.out.println("出车成功,当前空位剩余"+num);
                            obj.notify();
                        }
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        //开启线程
        t1.start();
        t2.start();
    }
}