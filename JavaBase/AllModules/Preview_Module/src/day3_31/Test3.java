package day3_31;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入月份(1-12):");
        int mon = sc.nextInt();
        if (mon >= 3 & mon <= 5) {
            System.out.println(mon + "月是春天");
        } else if (mon >= 6 & mon <= 8) {
            System.out.println(mon + "月是夏天");
        } else if (mon >= 9 & mon <= 11) {
            System.out.println(mon + "月是夏天");
        } else if (mon == 12 | mon == 1 | mon == 2) {
            System.out.println(mon + "月是冬天");
        } else {
            System.out.println("输入错误!");
        }
        switch (mon) {
            case 3:
            case 4:
            case 5:
                System.out.println(mon + "月是春天");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println(mon + "月是夏天");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println(mon + "月是秋天");
                break;
            case 12:
            case 1:
            case 2:
                System.out.println(mon + "月是冬天");
                break;
            default:
                System.out.println("月份输入错误!");
                break;
        }
    }
}