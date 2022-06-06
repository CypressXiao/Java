package day3_24;

import util.ArrayUtil;

import java.util.Arrays;

public class ArrayDemo1 {
    public static void main(String[] args) {
        String[] arr =new String[4];
        arr[0] ="春季";
        arr[1] ="夏季";
        arr[2] ="秋季";
        arr[3] ="冬季";
        System.out.println(Arrays.toString(arr));
        char[] arr1 =new char[4];
        arr1[0] ='多';
        arr1[1] ='易';
        arr1[2] ='教';
        arr1[3] ='育';
        System.out.println(Arrays.toString(arr1));
        int[] arr2 = new int[10];
        for(int i =0;i<10;i++) {
            arr2[i] = i + 1;
            if (i == 0) {
                System.out.print("[" + arr2[i] + ",");
            } else if (i == 9) {
                System.out.print(arr2[i] + "]");
            } else {
                System.out.print(arr2[i] + ",");
            }
        }
        System.out.println();
        System.out.println(Arrays.toString(arr2));
        ArrayUtil.printArray(arr2);
    }
}
