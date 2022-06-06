package JavaBase.day4_16;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Regex {
    public static void main(String[] args) {
        /*String s ="18608158526";
        String s1 = s.replaceAll("(\\d{3})(\\d{4})(\\d{4})","$1****$3");
        System.out.println(s1);*/
        String s ="xiao yu bai shi ge ren ni shi xiao di di ";
        Pattern p = Pattern.compile("\\b\\w{3}\\b");
        Matcher m = p.matcher(s);
        while(m.find()){
            System.out.println(m.group());
        }


    }
}
