package day4_5;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatDemo1 {
    public static void main(String[] args) throws ParseException {
        Date date = new Date();
        System.out.println(date);

        SimpleDateFormat sdf = new SimpleDateFormat();
        String str = sdf.format(date);
        System.out.println(str);

        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String str1 = sdf1.format(date);
        System.out.println(str1);

        String str2 ="2022-04-05 13:12:26";
        Date d1 =sdf1.parse(str2);
        System.out.println(d1);
    }
}
