package day4_5;

public class RegexDemo3 {
    public static void main(String[] args) {
        String str ="18608158526";
        String str1 = str.replaceAll("(\\d{3})(\\d{4})(\\d{4})","$1****$3");//()代表分组
        System.out.println(str1);

        String str2 ="510781199608304393";
        String str3 =str2.replaceAll("(\\d{6})(\\d{8})(\\d{3}[0-9Xx])","$1********$3");
        System.out.println(str3);
    }
}
