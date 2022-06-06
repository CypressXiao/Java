package JavaBase.day4_23;

public class RunnableDemo1 {
    public static void main(String[] args) {
        Demo d1 = new Demo();
        Thread th1 = new Thread(d1);
        th1.setName("Cypress");
        th1.start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 50; i++) {
                    System.out.println(Thread.currentThread().getName()+"===="+i);
                }
            }
        }).start();
    }
}

class Demo implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            System.out.println(Thread.currentThread().getName()+"===="+i);
        }
    }
}
