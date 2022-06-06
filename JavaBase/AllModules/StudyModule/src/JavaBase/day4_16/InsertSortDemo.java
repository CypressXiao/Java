package JavaBase.day4_16;

import java.util.Arrays;

public class InsertSortDemo {
    public static void main(String[] args) {
        int[] arr ={-12,-142,123,45,346,23,678};
        insertSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void insertSort(int[] arr){
        for(int i =1;i<arr.length;i++){
            int insertVal = arr[i];
            int insertIndex = i-1;
            while(insertIndex>=0 && insertVal <arr[insertIndex]){
                arr[insertIndex+1] = arr[insertIndex];
                insertIndex--;
            }
            arr[insertIndex+1] = insertVal;
        }
    }
}
