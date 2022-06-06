package day4_3;

import java.util.Arrays;

public class ArraysBinarySearch {
    //Arrays.BinarySearch可以用来找数组中元素的索引值,各种数组都行
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,6,9};
        int a = Arrays.binarySearch(arr,4);
        System.out.println(a);

        String[] str = new String[]{"你好","上海","加油","早日","加油","解封"};
        int b = Arrays.binarySearch(str,3,str.length,"加油");
        System.out.println(b);

        int c =10;
        System.out.println();
    }
}
