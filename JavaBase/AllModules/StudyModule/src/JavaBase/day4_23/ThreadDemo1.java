package JavaBase.day4_23;

public class ThreadDemo1 {
    public static void main(String[] args) {
        final Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(200);
                    for (int i = 0; i < 20; i++) {
                        System.out.println(Thread.currentThread().getName() + "====" + i);
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        },"迪丽热巴");

        t1.setDaemon(true);
        t1.start();

        final Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(10);
                    for (int i = 0; i < 20; i++) {
                        System.out.println(Thread.currentThread().getName() + "====" + i);
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        },"古力娜扎");
        t2.start();
    }
}
