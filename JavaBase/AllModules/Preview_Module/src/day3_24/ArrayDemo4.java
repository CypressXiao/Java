package day3_24;

import util.ArrayUtil;

public class ArrayDemo4 {
    public static void main(String[] args) {
        int[] arr =new int[]{100,200};
        ArrayUtil.printArray(arr);
        int a = arr[0];
        arr[0] =arr[1];
        arr[1] =a;
        ArrayUtil.printArray(arr);

    }
}
