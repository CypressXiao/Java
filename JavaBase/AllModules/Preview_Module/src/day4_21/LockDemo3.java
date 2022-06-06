package day4_21;

public class LockDemo3 {
    public static void main(String[] args) {
        Demo7 d1 = new Demo7();
        Demo7 d2 = new Demo7();
        Demo7 d3 = new Demo7();

        d1.start();
        d2.start();
        d3.start();

    }
}

class Demo7 extends Thread{
    static int tickets = 100;
    static Object o = new Object();

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