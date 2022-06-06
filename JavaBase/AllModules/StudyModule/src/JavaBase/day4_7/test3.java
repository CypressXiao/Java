package JavaBase.day4_7;

public class test3 {
    public static void main(String[] args) {
        String s ="a";
        String s1 =longestPalindrome(s);
        System.out.println(s1);
    }
    public static String longestPalindrome(String s) {
        String str;
        String str1 = s.substring(0,1);
        for(int i=0;i<s.length()-1;i++){
            for(int j=i+1;j<s.length();j++){
                if(j==s.length()-1){
                    str =s.substring(i);
                }else{
                    str =s.substring(i,j+1);
                }
                if(getNumb(str) && str1.length()<=str.length()){
                    str1 = str;
                }
            }
        }
        return str1;
    }

    public static boolean getNumb(String s) {
        boolean flag = true;
        for (int i = 0, j = s.length() - 1; i <= j; i++, j--) {
            if (s.charAt(i) != s.charAt(j)) {
                flag =false;
                break;
            }
        }
        return flag;
    }
}
