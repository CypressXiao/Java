package day4_5;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DelSameElementsDemo2 {
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
        List<String> list1  = distinct(list);
        System.out.println(list1);
        System.out.println("-----------------------------");
        List<String> list2  = distinct1(list);
        System.out.println(list2);
    }


    public static List<String> distinct(List<String> list){
        for(int i=0;i<list.size()-1;i++){
            int j =i+1;
            while(j<list.size()){
                if(list.get(i).equals(list.get(j))){
                    list.remove(j);
                }else{
                    j+=1;
                }
            }
        }
        return list;
    }

    public static List<String> distinct1(List<String> list){
        Set<String> set = new HashSet<>(list);
        list.clear();
        list.addAll(set);
        return list;
    }
}
