package day4_21;

public class WaitDemo1 {
    public static void main(String[] args) {
        Object o = new Object();
        new Thread(new Demo11(o)).start();
        new Thread(new Demo11(o)).start();
        new Thread(new Demo11(o)).start();
        try {
            Thread.sleep(30);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        new Thread(new Demo12(o)).start();

    }
}

class Demo11 implements Runnable{
    Object o;

    public Demo11(Object o){
        this.o = o;
    }

    @Override
    public void run() {
        synchronized (o){
            System.out.println(Thread.currentThread().getName()+"开始");
            try {
                o.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"结束");
        }
    }
}

class Demo12 implements Runnable{
    Object o;
    public Demo12(Object o){
        this.o = o;
    }

    @Override
    public void run() {
        synchronized(o){
            System.out.println(Thread.currentThread().getName()+"开始");
            o.notifyAll();
            System.out.println(Thread.currentThread().getName()+"结束");
        }
    }
}