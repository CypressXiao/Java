package JavaBase.day4_16;

public class Test3 {
    public static void main(String[] args) {
        String s ="jdsf hsdESkas23$%3774@fSJnufx44";
        int count1 =0;
        int count2 =0;
        int count3 =0;
        int count4 =0;
        for (int i = 0; i <s.length() ; i++) {
            char ch = s.charAt(i);
            if(Character.isDigit(ch)){
                count1++;
            }else if(Character.isLowerCase(ch)){
                count2++;
            }else if(Character.isUpperCase(ch)){
                count3++;
            }else{
                count4++;
            }
        }
        System.out.println("数字的个数为:"+count1);
        System.out.println("小写字母的个数为:"+count2);
        System.out.println("大写字母的个数为:"+count3);
        System.out.println("其他字符的个数为:"+count4);
    }
}
