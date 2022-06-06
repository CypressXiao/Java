package JavaBase.day4_16;

import java.util.Arrays;

public class QuickSortDemo {
    public static void main(String[] args) {
        int[] arr ={-12,-142,123,45,346,23,678};
        quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));

    }

    public static void quickSort(int[] arr, int left, int right) {
        int l = left;
        int r = right;
        int mid = arr[(left + right) / 2];
        int temp = 0;
        while (l<r) {
            while (arr[l] < mid) {
                l++;
            }
            while (arr[r] > mid) {
                r--;
            }
            if (l >= r) {
                break;
            }
            temp = arr[r];
            arr[r] = arr[l];
            arr[l] = temp;

            if(arr[l] == mid){
                r--;
            }
            if(arr[r] == mid){
                l++;
            }
        }
        if(l == r){
            l++;
            r--;
        }
        if(left<r){
            quickSort(arr,left,r);
        }
        if(right>l){
            quickSort(arr,l,right);
        }
    }


}




