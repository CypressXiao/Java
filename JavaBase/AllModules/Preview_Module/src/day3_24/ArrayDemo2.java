package day3_24;

public class ArrayDemo2 {
    public static void main(String[] args) {
        int[] arr =new int[5];
        System.out.println(arr);
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        String[] arr1 =new String[3];
        System.out.println(arr1);
        System.out.println(arr1[0]);
        System.out.println(arr1[1]);
        System.out.println(arr1[2]);
        arr1[1] ="大";
        System.out.println(arr1[1]);
        String[] arr2 = new String[4];
        arr2[1]="小";
        arr2=arr1;
        System.out.println(arr1[1]);
    }
}
