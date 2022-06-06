package JavaBase.day4_7;

public class test2 {
    public static void main(String[] args) {
        //给你一个字符串 s，找到 s 中最长的回文子串。
        String s = "ahskasjaehsjdjahsueajsnn";
        String str;
        String str1 ="";
        for(int i=0;i<s.length()-1;i++){
            for(int j=i+1;j<s.length();j++){
                if(j==s.length()-1){
                    str =s.substring(i);
                }else{
                    str =s.substring(i,j+1);
                }
                if(getNumb(str) && str1.length()<str.length()){
                    str1 = str;
                }
            }
        }
        System.out.println(str1);
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

