package day3_31;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        int m =Scanner(1);
        int n =Scanner(2);
        int o =Scanner(3);
        System.out.println("最大值为:"+(m>n?Math.max(m,o):Math.max(n,o)));
    }
    public static int Scanner(int a){
        Scanner sc =new Scanner(System.in);
        System.out.println("请输入数字"+a+":");
        return sc.nextInt();
    }
}
