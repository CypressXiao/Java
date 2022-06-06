package day3_23;

import util.ArrayUtil;

public class ArrayDemo2 {
    public static void main(String[] args) {
        String[] arr = new String[]{"多","易","教","育"};
        ArrayUtil.printArray(arr);
        int[] arr1 =new int[]{12,3,24,21,54};
        ArrayUtil.getMax(arr1);
        ArrayUtil.getMin(arr1);
        int max =arr1[0];
        for (int j : arr1) {
            if (max < j) {
                max = j;
            }
        }
        System.out.println(max);
    }
}
