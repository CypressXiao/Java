package day3_29;

import java.text.DecimalFormat;

public class DivisionDecimal {
    public static void main(String[] args) {
        int a = 10;
        int b =3;
        float decimal =a/b;
        System.out.println(String.format("%.2f",decimal));
        System.out.printf("%.2f\n",decimal);
        DecimalFormat fd = new DecimalFormat(".000");
        System.out.println(fd.format(decimal));
        System.out.println(fd.format(decimal).getClass());
        //变量名.getClass() --->显示变量的类型
    }
}
