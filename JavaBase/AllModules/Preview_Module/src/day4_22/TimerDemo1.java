package day4_22;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class TimerDemo1 {
    public static void main(String[] args) throws ParseException {
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("66666");
            }
        },3000);

        Date d = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse("2022-04-21 19:56:40");
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("AAAAA");
                timer.cancel();
            }
        },d);
    }
}
