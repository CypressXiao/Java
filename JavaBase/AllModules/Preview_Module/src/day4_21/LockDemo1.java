package day4_21;

public class LockDemo1 {
    public static void main(String[] args) {
        Demo5 d = new Demo5();
        Thread th1 = new Thread(d);
        Thread th2 = new Thread(d);
        Thread th3 = new Thread(d);

        th1.start();
        th2.start();
        th3.start();
    }
}

class Demo5 implements Runnable {
    static int tickets = 100;
    Object o = new Object();

    @Override
    public void run() {
        while (true) {
            synchronized (o) {
                if (tickets > 0) {
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + "===正在出售第" + (tickets--) + "张票");
                } else {
                    break;
                }
            }
        }
    }
}
