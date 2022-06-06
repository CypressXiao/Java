package day4_5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class DelSameElementsDemo1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("大乔");
        list.add("二乔");
        list.add("小乔");
        list.add("小乔");
        list.add("大乔");
        list.add("二乔");
        list.add("大乔");
        list.add("小乔");
        list.add("二乔");
        List<String> list2 =distinct(list);
        System.out.println(list2);
        System.out.println("---------------------------------");
        Object[] o =list2.toArray();
        System.out.println(Arrays.toString(o));
        System.out.println("---------------------------------");

        ListIterator it = list2.listIterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }


    public static List<String> distinct(List<String> list){
        List<String> list1 =new ArrayList<>();
        for(int i=0;i<list.size();i++){
            String s = list.get(i);
            if(!list1.contains(s)){
                list1.add(s);
            }
        }
        return list1;
    }
}
