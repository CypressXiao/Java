package JavaBase.day4_23;

public class ThreadDemo4 {
    public static void main(String[] args) {
        Object o  = new Object();
        Demo3 d1= new Demo3(o);
        Demo3 d2= new Demo3(o);
        Demo3 d3= new Demo3(o);

        d1.setName("湖人");
        d2.setName("勇士");
        d3.setName("篮网");

        d1.start();
        d2.start();
        d3.start();
    }
}

class Demo3 extends Thread{
    private static int tickets = 100;
    Integer in = 10;
    private final Object o;
    public Demo3(Object o){
        this.o = o;
    }

    @Override
    public void run() {
        while(true){
            synchronized (o) {
                if(tickets>0){
                    try {
                        Thread.sleep(50);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName()+"正在出售第"+(tickets--)+"张票");
                }else{
                    break;
                }
            }
        }
    }
}
