package JavaBase.day4_16;

import java.util.Arrays;

public class MergeSortDemo {
    public static void main(String[] args) {
        int[] arr ={-12,-142,123,45,346,23,678};
        int[] temp = new int[arr.length];
        mergeSort(arr,0,arr.length-1,temp);
        System.out.println(Arrays.toString(arr));
    }
    public static void mergeSort(int[] arr,int left,int right,int[] temp){
        if(left < right){
            int mid =(left+right)>>>1;
            mergeSort(arr,left,mid,temp);
            mergeSort(arr,mid+1,right,temp);
            merge(arr,left,right,mid,temp);
        }
    }


    public static void merge(int[] arr,int left,int right,int mid,int[] temp){
        int leftStart = left;
        int rightStart = mid+1;
        int t =0;

        while(leftStart <= mid && rightStart <= right){
            if(arr[leftStart]<= arr[rightStart]){
                temp[t] = arr[leftStart];
                leftStart++;
            }else{
                temp[t] = arr[rightStart];
                rightStart++;
            }
            t++;
        }
        while(leftStart<=mid){
            temp[t] = arr[leftStart];
            t++;
            leftStart++;
        }
        while(rightStart<= right){
            temp[t] = arr[rightStart];
            t++;
            rightStart++;
        }
        t =0;
        int tempLeft = left;
        while(tempLeft<= right){
            arr[tempLeft] = temp[t];
            tempLeft++;
            t++;
        }

    }
}
