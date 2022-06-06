package Algorithm.KMPAlgorithm;

/**
 * @ClassName ViolentAlgorithm
 * @Description 暴力匹配算法
 * @Author 肖榆柏
 * @Date 2022/5/21 16:05
 * @Version 1.0
 */

public class ViolentAlgorithm {
    //返回str1中匹配str2的开始下标
    public static void main(String[] args) {
        String str1 = "硅硅谷 尚硅谷你尚硅 尚硅谷你尚硅谷你尚硅你好";
        String str2 = "尚硅谷你尚硅你";
        System.out.println(ViolentRegex(str1, str2));


    }

    //暴力匹配算法
    public static int ViolentRegex(String s1, String s2) {
        //将字符串转换成字符数组
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();
        int len1 = c1.length;
        int len2 = c2.length;
        //定义两个指针分别指向c1和c2
        int i = 0;
        int j = 0;

        while (i < len1 && j < len2) {
            if (c1[i] == c2[j]) {
                i++;
                j++;
            } else {
                i = i - (j - 1);
                j = 0;
            }
        }

        if (j == len2) {
            return i - j;
        } else {
            return -1;
        }
    }
}
