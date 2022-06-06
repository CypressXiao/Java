package day3_24;

import static util.ArrayUtil.printArray;

public class ArrayDemo5 {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5,6};
        /*for(int i=0;i<arr.length/2;i++){
            int a = arr[i];
            arr[i] =arr[arr.length-1-i];
            arr[arr.length-1-i] =a;
        }
        printArray(arr);*/
        for(int i=0,j=arr.length-1;i<j;i++,j--){
            int a =arr[i];
            arr[i]=arr[j];
            arr[j]=a;
        }
        printArray(arr);
    }
}
