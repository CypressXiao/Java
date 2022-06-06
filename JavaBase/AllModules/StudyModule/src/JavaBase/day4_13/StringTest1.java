package JavaBase.day4_13;

public class StringTest1 {
    public static void main(String[] args) {
        String str = new String("Cypress");
        char[] ch =new char[str.length()];
        for(int i =str.length()-1;i>=0;i--){
            ch[str.length()-1-i] =str.charAt(i);
        }
        String str2 = new String(ch);
        System.out.println(str2);

        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        System.out.println(sb.toString());
    }
}
