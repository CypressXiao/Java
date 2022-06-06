package Algorithm;

/**
 * 读入字符串并丢弃无用的前导空格
 * 检查下一个字符（假设还未到字符末尾）为正还是负号，读取该字符（如果有）。 确定最终结果是负数还是正数。
 * 如果两者都不存在，则假定结果为正。
 * 读入下一个字符，直到到达下一个非数字字符或到达输入的结尾。字符串的其余部分将被忽略。
 * 将前面步骤读入的这些数字转换为整数（即，"123" -> 123， "0032" -> 32）。如果没有读入数字，则整数为 0 。
 * 必要时更改符号（从步骤 2 开始）。
 * 如果整数数超过 32 位有符号整数范围 [−2^31,  2^31 − 1] ，需要截断这个整数，使其保持在这个范围内。
 * 具体来说，小于 −2^31 的整数应该被固定为 −2^31 ，大于 2^31 − 1 的整数应该被固定为 2^31 − 1 。
 * 返回整数作为最终结果。
 */


public class Algorithm4 {
    public static void main(String[] args) {
        String s = "2147483648";
        int digit = s.charAt(0) - '0';
        System.out.println(digit);
        /*final Algorithm4 a = new Algorithm4();
        System.out.println(a.myAtoi(s));*/
    }

    public int myAtoi(String s) {
        int length = s.length();
        int index = 0;
        while (index < length && s.charAt(index) == ' ') {
            index++;
        }
        if (index == length) {
            return 0;
        }
        int sign = 1;
        if (s.charAt(index) == '+') {
            index++;
        } else if (s.charAt(index) == '-') {
            sign = -1;
            index++;
        }
        final int MAX = Integer.MAX_VALUE / 10;
        int num = 0;
        while (index < length && Character.isDigit(s.charAt(index))) {
            int digit = s.charAt(index) - '0';
            if (num > MAX) {
                return sign > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            } else if (num == MAX) {
                if (sign > 0 && digit > 7) {
                    return Integer.MAX_VALUE;
                } else if (sign < 0 && digit > 8) {
                    return Integer.MIN_VALUE;
                }
            }
            num = num * 10 + digit;
            index++;
        }
        return num * sign;

    }

}
//int num = Integer.parseInt(sb.toString());
//                if (num < Integer.MIN_VALUE / 10 && Character.isDigit(ch[i+1])) {
//                    return Integer.MIN_VALUE;
//                }else if(num>Integer.MAX_VALUE/10 && Character.isDigit(ch[i+1])){
//                    return Integer.MAX_VALUE;
//                }
