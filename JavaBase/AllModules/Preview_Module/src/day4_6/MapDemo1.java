package day4_6;

import java.util.*;

public class MapDemo1 {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap< >();
        map.put("张三",18);
        map.put("李四",19);
        map.put("王麻子",20);

        Set<String> set = map.keySet();
        for (String s : set) {
            System.out.println(s+":"+map.get(s));
        }
        System.out.println("----------------------------------------");

        Set<Map.Entry<String,Integer>> set1 = map.entrySet();
        /*for (Map.Entry<String, Integer> i : set1) {
            System.out.println(i.getKey()+":"+i.getValue());
        }*/
        Iterator<Map.Entry<String,Integer>> it = set1.iterator();
        while(it.hasNext()){
            Map.Entry<String,Integer> entry = it.next();
            System.out.println(entry.getKey()+":"+entry.getValue());
        }
        System.out.println("----------------------------------------");

        Collection<Integer> value = map.values();
        for (Integer integer : value) {
            System.out.println(integer);
        }
    }
}
