package day4_5;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatDemo2 {
    //将字符串2022-04-05 12:21:34 转换成字符串12:21:34 04/05/2022
    public static void main(String[] args) throws ParseException {
        String str1 ="2022-04-05 12:21:34";
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date d = sdf1.parse(str1);
        SimpleDateFormat sdf2 = new SimpleDateFormat("HH:mm:ss MM/dd/yyyy");
        String str2 =sdf2.format(d);
        System.out.println(str2);
    }
}
