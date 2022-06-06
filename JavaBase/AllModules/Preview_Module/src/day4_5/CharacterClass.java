package day4_5;

public class CharacterClass {
    public static void main(String[] args) {
        String s ="asdfQWESX@#$Md&^ 12 sd 1@AW3145";
        int count1 =0;
        int count2 =0;
        int count3 =0;
        int count4 =0;
        int count5 =0;
        for(int i=0;i<s.length();i++){
            if(Character.isUpperCase(s.charAt(i))){
                count1++;
            }else if(Character.isLowerCase(s.charAt(i))){
                count2++;
            }else if(s.charAt(i) ==' '){
                count3++;
            }else if(Character.isDigit(s.charAt(i))){
                count4++;
            }else{
                count5++;
            }
        }
        System.out.println("大写字母的个数为:"+count1);
        System.out.println("小写字母的个数为:"+count2);
        System.out.println("空格的个数为:"+count3);
        System.out.println("数字的个数为:"+count4);
        System.out.println("其他字符的个数为:"+count5);
    }
}
