package day4_25;

import java.util.Arrays;

public class QuickSortDemo {
    public static void main(String[] args) {
        int[] arr = new int[]{23,2421,321, 43,426,42,146,4326};
        int left = 0;
        int right = arr.length-1;
        quickSort(arr,left,right);
        System.out.println(Arrays.toString(arr));
    }

    public static void quickSort(int[] arr,int left,int right){
        if(left>right){
            return;
        }
        int l =left;
        int r = right;
        int base =arr[left];

        while(l<r){
            while(arr[r]>=base && l<r){
                r--;
            }
            while(arr[l]<=base && l<r){
                l++;
            }
            //理论上大的全在右边,小的全在左边,当找到左边大的和右边小的位置时交换二者
            if(l<r){
                int temp =arr[r];
                arr[r] = arr[l];
                arr[l] = temp;
            }
        }
        //该步骤是交换基准数
        arr[left] = arr[r];
        arr[r] = base;

        quickSort(arr,left,r-1);
        quickSort(arr,r+1,right);
    }
}
