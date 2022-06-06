package day3_24;/*public class day3_24.ArrayDemo3 {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4};   //对arr进行重新赋值时不能用简写的方式
        int[] arr1 =new int[]{1,2,3,4,5};
        arr =new int[]{1,2,3,4,5,6};
        System.out.println(arr.length);
        for(int i =0;i<arr.length;i++){
            System.out.print((arr[i])+" ");
        }
    }
}*/

import java.util.Scanner;

public class ArrayDemo3 {
    public static void main(String[] args) {
       /* char[] arr =new char[]{'多','易','教','育'};
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+"");
        }

        System.out.println();
        boolean[] arr1 =new boolean[]{false,false,true,true};
        System.out.println(Arrays.toString(arr1));
        */
        /*int[] arr2 =new int[]{1,4,3,4,5,6};
        int total = 0;
        for(int i=0;i<arr2.length;i++){
            total += arr2[i];
        }
        System.out.println("和为："+total);
        System.out.println("平均值为："+1.0*total/arr2.length);*/
        int[] arr3 =new int[5];
        Scanner sc =new Scanner(System.in);
        int total = 0;
        for(int i =0;i<arr3.length;i++){
            System.out.printf("请输入第%d个数字:\n",i+1);
            arr3[i] =sc.nextInt();
            total += arr3[i];
        }
        System.out.println("和为："+total);
        System.out.println("平均值为："+1.0*total/arr3.length);
    }
}