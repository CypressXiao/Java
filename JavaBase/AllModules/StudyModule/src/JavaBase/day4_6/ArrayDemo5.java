package JavaBase.day4_6;

import java.util.ArrayList;
import java.util.Random;

public class ArrayDemo5 {
    //向集合中存储10个不重复的0-20的随机数
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();
        while(l1.size()<10){
            Random ran =new Random();
            int ran1 = ran.nextInt(21);
            if(!l1.contains(ran1)){
                l1.add(ran1);
            }
        }
        System.out.println(l1);
    }
}
