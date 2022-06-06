package day3_31;

import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("输入第一个数字:");
        int numb1 =sc.nextInt();
        System.out.println("输入第二个数字:");
        int numb2 =sc.nextInt();
        System.out.println("输入运算符:");
        String str =sc.next();
        switch(str){
            case"+":
                System.out.println(numb1+" + "+numb2+" = "+(numb1+numb2));
                break;
            case"-":
                System.out.println(numb1+" - "+numb2+" = "+(numb1-numb2));
                break;
            case"*":
                System.out.println(numb1+" * "+numb2+" = "+(numb1*numb2));
                break;
            case"/":
                System.out.println(numb1+" / "+numb2+" = "+(numb1/numb2));
                break;
            case"%":
                System.out.println(numb1+" % "+numb2+" = "+(numb1%numb2));
                break;
            default:
                System.out.println("输入错误!");
                break;

        }

    }
}
