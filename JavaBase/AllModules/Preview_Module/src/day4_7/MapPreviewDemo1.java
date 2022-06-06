package day4_7;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapPreviewDemo1 {
    public static void main(String[] args) {
        System.out.println("请输入一个字符串:");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Map<Character,Integer> map = new HashMap<>();
        for(int i =0;i<str.length();i++){
            char ch =str.charAt(i);
            Integer count =map.get(ch);
            if(count == null){
                map.put(ch,1);
            }else{
                count++;
                map.put(ch,count);
            }
        }
        System.out.println(map);
    }
}
