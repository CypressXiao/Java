package JavaBase.day4_22;

import sun.security.util.Length;

import java.util.HashMap;

public class MapDemo2 {
    public static void main(String[] args) {
        String str ="ajidewfsdjfsirrweeHIWOwidhfhkkds";
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i =0;i<str.length();i++){
           char ch = str.charAt(i);
           if(!map.containsKey(ch)){
               map.put(ch,1);
           }else{
               int count = map.get(ch);
               count++;
               map.put(ch,count);
           }
        }
        System.out.println(map);
    }
}
