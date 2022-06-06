package JavaBase.day4_15;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo1 {
    public static void main(String[] args) throws ParseException {
        Date date = new Date();
        long t1 = date.getTime();

        String birth ="1996-08-30 06:30:30";
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date1 = sdf1.parse(birth);

        long t2 = date1.getTime();
        long t3 = t1-t2;
        System.out.println(1.0*t3/1000/60/60/24);
    }
}
