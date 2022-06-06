package day4_25;

public class Test2 {
    static int num = 0;
    static final Object obj = new Object();
    public static void main(String[] args) {
        new Thread(()->{
            for(int i=1;i<=52;i++){
                synchronized (obj){
                    try {
                        while(num%3 == 2){
                            obj.wait();
                        }
                        System.out.println(i);
                        num++;
                        obj.notifyAll();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();

        new Thread(()->{
            for(char j ='A';j<='Z';j++){
                synchronized (obj){
                    try {
                        while(num%3 !=2){
                            obj.wait();
                        }
                        System.out.println(j);
                        num++;
                        obj.notifyAll();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();
    }
}
