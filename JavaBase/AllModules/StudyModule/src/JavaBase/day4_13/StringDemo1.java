package JavaBase.day4_13;

public class StringDemo1 {
    public static void main(String[] args) {
        String  ss ="hifuw12dhh,fhwieo@a34dnjwsmASDQHBS";
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        int count4 = 0;
        for (int i = 0; i <ss.length() ; i++) {
            if(/*ss.charAt(i)>= '0' && ss.charAt(i)<='9'*/
                    ss.charAt(i)>= 48 && ss.charAt(i)<= 57
            ){
                count1++;
            }
            else if(ss.charAt(i)>='a' && ss.charAt(i)<='z'){
                count2++;
            }
            else if(ss.charAt(i)>='A' && ss.charAt(i)<='Z'){
                count3++;
            }else {
                count4++;
            }
        }
        System.out.println("数字的个数为:"+count1);
        System.out.println("小写字母的个数为:"+count2);
        System.out.println("大写字母的个数为:"+count3);
        System.out.println("其他的字符的个数为:"+count4);
    }
}
