package JavaBase.day4_19;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExceptionDemo1 {
    public static void main(String[] args) {
        try {
            parseDate();
        } catch (ParseException e) {
            System.out.println("输入格式不合法!");
        }catch (IOException e){
            System.out.println();
        }catch(Exception e){
            System.out.println("");
        }
    }

    public static void parseDate() throws ParseException,IOException{
        String s ="1997-08-0113:20:58";
        final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = sdf.parse(s);
        System.out.println(date);
    }
}
