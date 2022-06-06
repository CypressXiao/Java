package JavaBase.day4_15;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateAndSimpleDateFormat {
    public static void main(String[] args) throws ParseException {
        Date date = new Date();
        Date date1 = new Date(1300000000000L);
        System.out.println(date);
        System.out.println(date1);
        long time = date.getTime();
        long time2 = date1.getTime();
        System.out.println(time);
        System.out.println(time2);
        System.out.println("------------------------------------------");
        date.setTime(1400000000000L);
        System.out.println(date);
        System.out.println("------------------------------------------");
        SimpleDateFormat sdf1 = new SimpleDateFormat();
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd E HH:mm:ss");
        String s1 =sdf1.format(date);
        String s2 =sdf2.format(date1);
        System.out.println(s1);
        System.out.println(s2);
        Date date2 = sdf1.parse(s1);
        Date date3 = sdf2.parse(s2);
        System.out.println(date2);
        System.out.println(date3);
    }
}
