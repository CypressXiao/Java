package Algorithm;

//给你一个 32 位的有符号整数 x ，返回将 x 中的数字部分反转后的结果。
//如果反转后整数超过 32 位的有符号整数的范围 [−2^31,  2^31 − 1] ，就返回 0。

public class Algorithm3 {
    public static void main(String[] args) {
        int x = -1371237469;
        final Algorithm3 a = new Algorithm3();
        System.out.println(a.reverse(x));


    }

    //利用字符串进行翻转,效率低
    /*public int reverse(int x) {
        long a;
        String s = String.valueOf(x);
        if(s.charAt(0) =='-'){
            StringBuilder s1 = new StringBuilder(s.substring(1));
            a =-Long.parseLong(s1.reverse().toString());
        }else{
            StringBuilder s2 = new StringBuilder(s);
            a =Long.parseLong(s2.reverse().toString());
        }
        if(a>= -Math.pow(2,31) && a<=Math.pow(2,31)-1){
            return (int)a;
        }
        return 0;
    }*/

    //数学方法处理
    public int reverse(int x) {
        //定义一个数表示最终结果
        int result = 0;
        while (x != 0) {
            //少一位都比Min/10的值小了说明翻转之后值超出范围了 || 少一位都比Max/10的值大了说明翻转之后值肯定超出范围了
            if (result < Integer.MIN_VALUE/10 || result > Integer.MAX_VALUE/10) {
                return 0;
            }
            int remain = x % 10;
            x /= 10;
            result = result * 10 + remain;
        }
        return result;
    }
}
