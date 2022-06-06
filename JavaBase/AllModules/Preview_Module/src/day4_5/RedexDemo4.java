package day4_5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RedexDemo4 {
    public static void main(String[] args) {
        String str ="hao hao xue xi,tian tian xiang shang,zao ri cheng wei guo jia de dong liang!";
        Pattern p =Pattern.compile("\\b[a-zA-z]{4}\\b");
        Matcher m = p.matcher(str);
        while(m.find()){ //find() 返回的是TRUE/FALSE
            System.out.println(m.group()); //group()不能单独使用,是用来返回查找到的满足条件的值
        }
    }
}
