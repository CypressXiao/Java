package day4_5;

import java.util.Arrays;

public class RegexDemo2 {
    public static void main(String[] args) {
        String str ="19 89 76 3 65";
        String[] arr =str.split(" ");
        Integer[] arr1 = new Integer[arr.length];
        for(int i =0;i<arr.length;i++){
            arr1[i] = Integer.valueOf(arr[i]);
        }
        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));
    }
}
