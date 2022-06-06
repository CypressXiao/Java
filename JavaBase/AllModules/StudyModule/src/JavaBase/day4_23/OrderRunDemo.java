package JavaBase.day4_23;

public class OrderRunDemo {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 20; i++) {
                    System.out.println(Thread.currentThread().getName() + "===" + i);
                }
            }
        }, "Jordan");

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    t1.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                for (int i = 0; i < 20; i++) {
                    System.out.println(Thread.currentThread().getName() + "===" + i);
                }
            }
        }, "Kobe");

        Thread t3 = new Thread(() -> {
            try {
                t2.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            for (int i = 0; i < 20; i++) {
                System.out.println(Thread.currentThread().getName() + "===" + i);
            }
        }, "James");

        t2.start();
        t3.start();
        t1.start();

    }

}
