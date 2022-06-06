package JavaBase.day4_14;

import java.util.Arrays;

public class Test2 {
    /**
     * 使用StringBuilder打印数组 要求打印格式为: [1, 2, 3, 4, 5, 6, 7]
     * @param args
     */
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder("1234567");
        String s1 = s.toString();
        char[] ch = s1.toCharArray();
        System.out.println(Arrays.toString(ch));
    }
}
