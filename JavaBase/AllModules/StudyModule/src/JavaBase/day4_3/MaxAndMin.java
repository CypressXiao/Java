package JavaBase.day4_3;

import java.util.Arrays;

public class MaxAndMin {

    //冒泡排序
    /*public static void main(String[] args) {
        int[] arr =new int[]{12,35,2,45,67,89,124,32};
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp =arr[j+1];
                    arr[j+1] =arr[j];
                    arr[j] =temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("最小值:"+arr[0]);
        System.out.println("最大值:"+arr[arr.length-1]);
    }*/

    //选择排序
    public static void main(String[] args) {
        int[] arr =new int[]{12,35,2,45,67,89,124,32};
        for(int i=0;i<arr.length-1;i++){
            for(int j =i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp = arr[j];
                    arr[j] =arr[i];
                    arr[i] =temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("最小值:"+arr[0]);
        System.out.println("最大值:"+arr[arr.length-1]);
    }
}

