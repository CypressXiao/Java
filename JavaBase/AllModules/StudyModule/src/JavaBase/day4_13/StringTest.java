package JavaBase.day4_13;

import java.util.Arrays;

public class StringTest {
    public static void main(String[] args) {
        byte[] b ={48,49,50,51};
        String str1 = new String(b);
        System.out.println(str1);
        String str2 = new String(new char[]{'a','b','c'});
        System.out.println(str2);
        String str3 = "xiaoyubai";
        char[] ch = str3.toCharArray();
        System.out.println(Arrays.toString(ch));
        byte[] by =str3.getBytes();
        System.out.println(Arrays.toString(by));
    }
}
