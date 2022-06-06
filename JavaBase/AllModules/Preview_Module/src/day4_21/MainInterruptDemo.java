package day4_21;

public class MainInterruptDemo {
    public static void main(String[] args) {
        //Thread.currentThread().interrupt();
        Demo3 d = new Demo3(Thread.currentThread());//找一个小弟让他来帮忙打断
        d.start();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("over");
    }
}

class Demo3 extends Thread{
    Thread th;
    public Demo3(Thread th){
        this.th = th;
    }

    public void run(){
        th.interrupt();
    }
}
