package JavaBase.day4_3;

import java.util.Arrays;

public class Test1 {
    public static void main(String[] args) {
        int[] arr =new int[]{100,200,300,500,900,400,600,700,800};
        for(int i =0;i<arr.length/2;i++){
            int temp =arr[i];
            arr[i] =arr[arr.length-1-i];
            arr[arr.length-1-i]=temp;
        }
        System.out.println(Arrays.toString(arr));

        /*for(int i=0,j=arr.length-1;i<=j;i++,j--){
            int temp =arr[i];
            arr[i] =arr[j];
            arr[j] =temp;
        }
        System.out.println(Arrays.toString(arr));*/
    }
}
