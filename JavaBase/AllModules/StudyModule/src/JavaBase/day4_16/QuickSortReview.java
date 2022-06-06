package JavaBase.day4_16;

import java.util.Arrays;

public class QuickSortReview {
    public static void main(String[] args) {
        int[] arr = new int[]{-23,-243,90,23,45,346};
        int left = 0;
        int right = arr.length-1;
        quickSort(arr,left,right);
        System.out.println(Arrays.toString(arr));
    }

    public static void quickSort(int[] arr,int left,int right){
        int i = left;
        int j = right;
        int base = arr[left];
        if(left>=right){
            return;
        }
        while(i<j){
            while(arr[j]>=base && i<j){
                j--;
            }
            while(arr[i]<=base && i<j){
                i++;
            }
            if(i<j){
                int temp =arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        arr[left] = arr[i];
        arr[i] =base;

        quickSort(arr,left,i-1);
        quickSort(arr,i+1,right);
    }
}
