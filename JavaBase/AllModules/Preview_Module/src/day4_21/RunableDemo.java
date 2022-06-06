package day4_21;

public class RunableDemo {
    public static void main(String[] args) {
        Demo4 d =new Demo4();
        Thread th = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                for (int i = 0; i <30 ; i++) {
                    System.out.println(i);
                }
            }
        });//实现了线程任务和线程对象的分离
        Thread th2 = new Thread(d);
        th.start();
        th.interrupt();
        th2.start();
    }
}

class Demo4 implements Runnable{

    @Override
    public void run() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for (int i = 0; i <30 ; i++) {
            System.out.println(Thread.currentThread().getName()+"------"+i);
        }
    }
}
