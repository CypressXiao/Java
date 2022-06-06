package Sort;

import java.util.Arrays;

/**
 * @ClassName MergeSortDemo
 * @Description TODO
 * @Author 肖榆柏
 * @Date 2022/5/12 21:56
 * @Version 1.0
 */

public class MergeSortDemo {
    public static void main(String[] args) {
        int[] arr = new int[]{12,343,1325,153,-123,23,231,-32};
        mergeSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    //分的方法递归
    //需要有一个空数组暂时存储每次合并后的数组
    public static void mergeSort(int[] arr,int left,int right){
        if (left<right) {
            int mid = (left+right)>>1;
            mergeSort(arr,left,mid);
            mergeSort(arr,mid+1,right);
            merge(arr,left,mid,right);
            //每分一次的同时需要并一个
        }
    }

    public static void merge(int[] arr,int left,int mid,int right){
        int[] temp = new int[right - left + 1];
        int i =left;
        int j =mid+1;
        int t =0;

        while(i<=mid && j<=right){
            if(arr[i]>=arr[j]){
                temp[t] = arr[j];
                j++;
            }else{
                temp[t] = arr[i];
                i++;
            }
            t++;
        }
        while(i<=mid){
            temp[t] = arr[i];
            i++;
            t++;
        }
        while(j<=right){
            temp[t] = arr[j];
            t++;
            j++;
        }

        for (int k = 0; k < temp.length; k++) {
            arr[left + k] = temp[k];
        }

    }
}
