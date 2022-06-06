package day4_18;


import java.io.PrintStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class ExceptionDemo {
    public static void main(String[] args) {
        try {
            new SimpleDateFormat().parse("");
        } catch (ParseException e) {
            System.out.println(e.getMessage());
            System.out.println(e.toString());
            e.printStackTrace();
            try {
                e.printStackTrace(new PrintStream("D:/a.txt"));
            } catch (Exception exception) {
                exception.printStackTrace();
            }

        }
    }
}
