package JavaBase.day4_15;

import java.util.Calendar;

public class CalendarTest {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        int year = cal.get(Calendar.YEAR);
        int mon = cal.get(Calendar.MONTH);
        int day = cal.get(Calendar.DAY_OF_MONTH);
        int weekday = cal.get(Calendar.DAY_OF_WEEK);
        System.out.println(year);
        System.out.println(mon);
        System.out.println(day);
        System.out.println(weekday);
        long time = System.currentTimeMillis();
        System.out.println(time);
    }
}
