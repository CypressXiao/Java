package day3_23;

import java.util.Scanner;

public class DoWhileDemo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("**********问老婆一个问题**********");
        System.out.println("老婆你爱我吗？");
        String ans = sc.nextLine();
        do {
            System.out.println("老婆你爱我吗？");
            ans = sc.next();
        } while (!"爱".equals(ans));
        System.out.println("爱我就别伤害我！");
    }
}
