package JavaBase.day4_25;

public class WaitDemo {
    public static void main(String[] args) {
        Object obj = new Object();
        new Thread(new MyRun1(obj),"线程1").start();
        new Thread(new MyRun1(obj),"线程2").start();
        new Thread(new MyRun2(obj),"线程3").start();
    }
}

class MyRun1 implements Runnable{
    private Object obj;

    public MyRun1(Object obj){
        this.obj = obj;
    }

    @Override
    public void run() {
        synchronized ("A"){
            try {
                "A".wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"java");
        }
    }
}

class MyRun2 implements Runnable{
    private Object obj;
    public MyRun2(Object obj){
        this.obj = obj;
    }

    @Override
    public void run() {
        synchronized ("A"){
            "A".notifyAll();
            System.out.println(Thread.currentThread().getName()+"Python");
        }
    }
}
