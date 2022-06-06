package JavaBase.day4_4;

import java.util.Arrays;

public class DoubleArray {
    public static void main(String[] args) {
        /*int[][] arr ={{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(arr[1][2]);
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]);
            }
        }*/
        int[][] arr1 =new int[3][];
        arr1[1] = new int[] {1,2,3};
        int[][] arr2 = arr1;
        arr2[1] =new int[]{4,5,6};
        System.out.println(Arrays.toString(arr1[1]));//引用数据类型改值都是这样
    }
}
