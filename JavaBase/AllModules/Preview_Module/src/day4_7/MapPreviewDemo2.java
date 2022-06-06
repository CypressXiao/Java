package day4_7;

import java.util.*;

public class MapPreviewDemo2 {
    public static void main(String[] args) {
        Map<String,Integer> map =new HashMap<>();
        map.put("xiaoyubai",25);
        map.put("Cypress",26);
        map.put("Ed",27);

        Set<String> set =map.keySet();
        for (String s : set) {
            System.out.println(s+":"+map.get(s));
        }
        System.out.println("----------------------------------------");

        Set<Map.Entry<String,Integer>> entry =map.entrySet();
        for (Map.Entry<String, Integer> e : entry) {
            System.out.println(e.getKey()+":"+e.getValue());
        }
        System.out.println("----------------------------------------");

        Iterator<Map.Entry<String,Integer>> it =entry.iterator();
        while(it.hasNext()){
            Map.Entry<String,Integer> entry1 = it.next();
            System.out.println(entry1.getKey()+":"+entry1.getValue());
        }
        System.out.println("----------------------------------------");

        Collection<Integer> c =map.values();
        for (Integer integer : c) {
            System.out.println(integer);
        }
    }
}
