package day3_25;

import util.ArrayUtil;

import java.util.Arrays;

public class MultiArray {
    public static void main(String[] args) {
        int[][] arr = new int[4][3];
        arr[1][1] = 100;
        System.out.println(arr[1][1]);

        int[][] arr1 = new int[2][];
        arr1[0] = new int[]{1, 2, 3, 4, 5, 6};
        arr1[1] = new int[]{1, 3, 4, 5};

        ArrayUtil.douArrPrintArray(arr1);
        System.out.println(Arrays.toString(arr1[0]));

        int[][] arr2 = new int[][]{{1, 2, 3}, {5, 6, 7, 8}};

    }

}
