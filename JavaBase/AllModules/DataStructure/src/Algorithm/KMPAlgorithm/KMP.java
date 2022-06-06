package Algorithm.KMPAlgorithm;

import java.util.Arrays;

/**
 * @ClassName KMP
 * @Description KMP算法
 * @Author 肖榆柏
 * @Date 2022/5/21 16:32
 * @Version 1.0
 */

public class KMP {
    public static void main(String[] args) {
        String str1 = "BBC ABCDAB ABCDABCDABDE";
        String str2 = "ABCDABD";
        final int[] next = getNext(str2);
        System.out.println(Arrays.toString(next));
        final int index = kmp(str1, str2, next);
        System.out.println(index);

    }

    //提供两个方法,一个是得到str2的各个字符对应的部分匹配值所对应的数组,另一个是kmp算法匹配的方法
    public static int kmp(String s1, String s2, int[] next) {
        //遍历s中的字符
        //而这里是两个字符串之间相互比较所以都从0开始
        for (int i = 0, j = 0; i < s1.length(); i++) {
            while (j > 0 && s1.charAt(i) != s2.charAt(j)) {//(KMP算法的核心)
                j = next[j - 1];
            }
            if (s1.charAt(i) == s2.charAt(j)) {
                j++;
            }
            if (j == s2.length()) {
                return i - j + 1;
            }
        }
        return -1;
    }


    public static int[] getNext(String s) {
        //第一个元素的next必定为0
        int[] next = new int[s.length()];
        next[0] = 0;
        //有多个元素时,需要去判断前缀和后缀重复中的字符个数
        //自己跟自己比所有i,j错开的;j代表前缀的指针,i代表后缀的指针
        for (int i = 1, j = 0; i < s.length(); i++) {
            //如果i,j处对应的字符不同,则进行如下操作(KMP算法的核心)
            while (j > 0 && s.charAt(i) != s.charAt(j)) {
                j = next[j - 1];
            }
            //如果i,j处对应的字符相同,则j增加1,然后让该位置的next值等于j
            if (s.charAt(i) == s.charAt(j)) {
                j++;
            }
            next[i] = j;
        }
        return next;
    }
}
