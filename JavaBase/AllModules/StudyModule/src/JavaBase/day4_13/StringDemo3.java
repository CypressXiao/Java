package JavaBase.day4_13;

public class StringDemo3 {
    public static void main(String[] args) {
        String s = "1234";
        char[] ch = s.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            System.out.println(ch[i]);
        }
        byte[] b = s.getBytes();
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }
        System.out.println(s.replace("1234","hello"));//s的原值始终不变
        System.out.println(s);


    }
}
