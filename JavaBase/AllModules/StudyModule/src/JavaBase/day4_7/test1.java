package JavaBase.day4_7;

import java.util.HashSet;
import java.util.Set;

public class test1 {
    public static void main(String[] args) {
        int start =0;
        int max =0;
        Set<Character> set = new HashSet<>();
        String s ="asfdsdfudijxiuexdjnjdsfjw";
        for(int end =0;end<s.length();end++){
            char ch1 =s.charAt(end);
            while(set.contains(ch1)){
                char ch2 =s.charAt(start);
                set.remove(ch2);
                start++;
            }
            set.add(ch1);
            max =Math.max(max,end-start+1);
        }
        System.out.println(max);
    }
}
