package day4_5;

import java.util.Arrays;

public class ArrayCopyDemo {
    public static void main(String[] args) {
        Character[] c =new Character[]{'每','天','都','有','好','心','情'};
        Character[] c1 =new Character[10];
        System.arraycopy(c,2,c1,5,5);
        System.out.println(Arrays.toString(c1));

        String str ="每天都有好心情";
        char[] c2 =new char[10];
        char[] ch = str.toCharArray();
        System.arraycopy(ch,2,c2,5,5);
        System.out.println(Arrays.toString(c2));
    }

}
