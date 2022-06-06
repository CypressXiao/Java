package day4_5;

public class StringDemo1 {
    public static void main(String[] args) {
        String s = new String();//空串
        System.out.println(s);

        byte[] bs ={97,98,99};
        String s2 =new String(bs);
        System.out.println(s2); //把byte数据转成字符

        char[] c = new char[]{'多','易','教','育'};
        String s3 = new String(c);
        System.out.println(s3);
    }
}
