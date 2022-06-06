package JavaBase.day4_16;

import java.util.Arrays;

public class Test1 {
    public static void main(String[] args) {
        int[] arr = new int[]{123,-234,-123,-43,53,356,34,96};
        int left = 0;
        int right = arr.length-1;
        quickSort(arr,left,right);
        System.out.println(Arrays.toString(arr));

    }

    public static void quickSort(int[] arr,int left,int right){
        if(left > right){
            return;
        }
        int i = left;
        int j = right;
        int base = arr[left];
        while(i<j){
            while(arr[j] <= base && i<j){
                j--;//对面的先动
            }
            while(arr[i] >= base && i<j){
                i++;
            }
            if(i<j){
                int temp =arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        arr[left] = arr[i];
        arr[i] = base;

        quickSort(arr,left,i-1);
        quickSort(arr,i+1,right);
    }
}
