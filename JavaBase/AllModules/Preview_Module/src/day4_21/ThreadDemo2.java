package day4_21;

public class ThreadDemo2 {
    public static void main(String[] args) throws InterruptedException {
        Demo1 d1 = new Demo1("ED");
        Demo d2 = new Demo("Rose");

        d1.start();
        d2.start();
        System.out.println("over");
    }
}

class Demo1 extends Thread{
    String name;

    public Demo1(String name){
        this.name =name;
    }

    public void run(){
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for (int i = 0; i <30 ; i++) {
            System.out.println(Thread.currentThread().getName()+"------"+i);
        }
    }
}

