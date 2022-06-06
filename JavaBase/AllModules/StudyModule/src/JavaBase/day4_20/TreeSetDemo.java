package JavaBase.day4_20;

import java.util.Random;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<Integer> t = new TreeSet<>();
       while(t.size()< 20){
           Random ran =new Random();
           int ran1 = ran.nextInt(100);
           t.add(ran1);
       }
        System.out.println(t);
    }
}
