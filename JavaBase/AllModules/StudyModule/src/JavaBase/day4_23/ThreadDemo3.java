package JavaBase.day4_23;

public class ThreadDemo3 {
    public static void main(String[] args) {
        Demo2 d = new Demo2();
        Thread th1 = new Thread(d);
        Thread th2 = new Thread(d);
        Thread th3 = new Thread(d);

        th1.setName("湖人");
        th2.setName("勇士");
        th3.setName("篮网");

        th1.start();
        th2.start();
        th3.start();

    }
}

class Demo2 implements Runnable {

    private int tickets = 100;
    Integer a = 10;

    @Override
    public void run() {
        while (true) {
            synchronized (a) {
                if (tickets > 0) {
                    try {
                        Thread.sleep(50);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + "正在出售" + (tickets--) + "张票");
                } else {
                    break;
                }
            }
        }
    }
}
