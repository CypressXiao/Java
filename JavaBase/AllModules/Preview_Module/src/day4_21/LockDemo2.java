package day4_21;

public class LockDemo2 {
    public static void main(String[] args) {
        Object o = new Object();
        Demo6 d1 = new Demo6(o);
        Demo6 d2 = new Demo6(o);
        Demo6 d3 = new Demo6(o);

        d1.start();
        d2.start();
        d3.start();

    }
}

class Demo6 extends Thread{
    static int tickets = 100;
    Object o;

    public Demo6(Object o){
        this.o = o;
    }

    @Override
    public void run() {
        while(true){
            synchronized (o) {
                if(tickets>0){
                    try {
                        Thread.sleep(30);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName()+"===正在出售第"+(tickets--)+"张票");
                }else{
                    break;
                }
            }
        }
    }
}