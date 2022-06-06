package day4_21;

public class LockDemo4 {
    public static void main(String[] args) {
        Demo8 d1 = new Demo8();
        Demo8 d2 = new Demo8();
        Demo8 d3 = new Demo8();

        d1.start();
        d2.start();
        d3.start();

    }
}

class Demo8 extends Thread{
    static int tickets = 100;

    @Override
    public void run() {
        while(true){
            synchronized ("a") {
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