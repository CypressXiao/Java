package JavaBase.day4_4;

import java.util.Scanner;

public class WaysDemo2 {
    public static void main(String[] args) {
        //getSum();
        outputArray(new int[]{1,2,3,4,5,4,3,2,1});
    }

    public static void getSum(){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数:");
        int numb1 = sc.nextInt();
        System.out.println("请输入第二个数:");
        int numb2 =sc.nextInt();
        System.out.println(numb1+"+"+numb2+"="+(numb1+numb2));
    }

    public static void outputArray(int[] arr){
        for (int value : arr) {
            System.out.print(value + " ");
        }
    }
}
