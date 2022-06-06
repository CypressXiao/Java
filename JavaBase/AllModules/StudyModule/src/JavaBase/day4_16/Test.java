package JavaBase.day4_16;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[] arr ={-12,-142,123,45,346,23,678};
        quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    public static void quickSort(int[] arr,int left,int right){
        int l = left;
        int r =right;
        int temp = 0;
        int mid =arr[(left+right)>>>1];

        while(l<r){
            while(arr[l] < mid){
                l++;
            }
            while(arr[r] > mid){
                r--;
            }
            if(l >= r){
                break;
            }
            temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
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
        if(right >l){
            quickSort(arr,l,right);
        }
    }
}
