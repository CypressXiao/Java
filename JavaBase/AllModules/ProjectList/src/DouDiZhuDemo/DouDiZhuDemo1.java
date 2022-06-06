package DouDiZhuDemo;

import java.util.ArrayList;
import java.util.Collections;

public class DouDiZhuDemo1 {
    public static void main(String[] args) {
        String[] color ={"♥","♠","♣","♦"};
        String[] num ={"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
        ArrayList<String> list1 = new ArrayList<>();

        for (String s : color) {
            for (String value : num) {
                list1.add(value+s );
            }
        }
        list1.add("small ghost");
        list1.add("big ghost");

        Collections.shuffle(list1);

        ArrayList<String> list2 = new ArrayList<>();
        ArrayList<String> list3 = new ArrayList<>();
        ArrayList<String> list4 = new ArrayList<>();
        ArrayList<String> list5 = new ArrayList<>();

        for (int i = 0; i < list1.size(); i ++) {
            if(i>= 51){
                list5.add(list1.get(i));
            }else if(i%3==0){
                list2.add(list1.get(i));
            }else if(i%3==1){
                list3.add(list1.get(i));
            }else{
                list4.add(list1.get(i));
            }
        }
        Collections.sort(list2);
        Collections.sort(list3);
        Collections.sort(list4);

        System.out.println(list2);
        System.out.println(list3);
        System.out.println(list4);
        System.out.println(list5);
    }
}
