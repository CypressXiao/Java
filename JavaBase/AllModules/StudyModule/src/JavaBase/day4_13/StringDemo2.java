package JavaBase.day4_13;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringDemo2 {
    public static void main(String[] args) {
        String s = "javajaavjajavajava";
        int count = 0;
        int num =0;
        int frontIndex = 0;
        while (s.indexOf("java", frontIndex) != -1) {
            frontIndex = s.indexOf("java",frontIndex) + 1;
            count++;
        }
        System.out.println("java出现的次数为:" + count);

        Pattern p = Pattern.compile("java");
        Matcher m = p.matcher(s);
        while(m.find()){
            num++;
        }
        System.out.println("java出现的次数为:"+num);
    }
}


