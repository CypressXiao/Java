package JavaBase.day4_15;

import java.util.Calendar;
import java.util.Scanner;

public class calendarDemo {
    public static void main(String[] args) {
        /*Calendar cal = Calendar.getInstance();

        int year = cal.get(Calendar.YEAR);
        System.out.println(year);
        int mon = cal.get(Calendar.MONTH);
        System.out.println(mon);//3表示四月
        System.out.println(cal.get(Calendar.MINUTE));*/

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你要查询的年份:");
        int year = sc.nextInt();
        System.out.println("请输入你要查询的月份:");
        int mon = sc.nextInt();

        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR,year);
        cal.set(Calendar.MONTH,mon);
        cal.set(Calendar.DAY_OF_MONTH,1);

        cal.add(Calendar.DAY_OF_MONTH,-1);

        System.out.println(year+"年"+mon+"月份共有"+cal.get(Calendar.DAY_OF_MONTH)+"天");
    }
}
