package Algorithm;

import java.util.ArrayList;

//给你一个字符串 s，找到 s 中最长的回文子串。
//回文串:要求该串从前往后读和从后往前读是一样的
class Algorithm2 {
    public static void main(String[] args) {
        String s = "javavavva";
        Algorithm2 a = new Algorithm2();
        System.out.println(a.longestPalindrome(s));


    }

    //暴力枚举法!!!!
    //时间超出限制!!!
    /*public String longestPalindrome(String s) {
        String s2 = "";
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j <= s.length(); j++) {
                String s1 = s.substring(i, j);
                if (new StringBuilder(s1).reverse().toString().equals(s1) && s1.length() > s2.length()) {
                    s2 = s1;
                }
            }
        }
        return s2;
    }*/

    //动态规划法
    /*public String longestPalindrome(String s) {
        //初始化起点
        int begin = 0;
        //初始化最大长度
        int maxLen = 0;
        //先获取字符串的长度
        int len =s.length();
        //如果字符串长度小于2,则说明字符串本身是个回文串,直接返回
        if(len < 2){
            return s;
        }
        //创建一个布尔类型的二维数组来存储结果,即为len x len的表格,行和列分别代表子串左边位置和右边位置,
        //如果是回文串标记为true,反之为false;
        //用l来代表子串左边位置,用r代表子串右边位置
        boolean[][] arr = new boolean[len][len];

        //必须先一列列的完成,因为涉及相互引用问题
        for(int r = 0;r<len;r++){
            //只用判断右边界大于左边界的情况
            for(int l =0;l<=r;l++){
                //如果左边界与右边界等则,将该位置设置为true
                    if(l==r){
                        arr[l][r] = true;
                    //如果l不等于r,则判断l处的字符是否等于r处的字符
                    }else if(s.charAt(l) == s.charAt(r)){
                        //如果(r-1)与(l+1)的差小于1,则该串为回文串
                        if(r-l<3){
                            arr[l][r] = true;
                        }else{
                            //否则其是否为回文子串取决于它的子串
                            arr[l][r] = arr[l+1][r-1];
                        }
                    //如果上述条件都不满足,直接确定其不为回文子串
                    }else{
                        arr[l][r] = false;
                    }
                    //如果二维数组位置的值为true,判断该串长度和最大串长度的关系
                    if(arr[l][r] &&(r-l+1)>maxLen){
                        begin =l;
                        maxLen = r-l+1;
                    }
                }
            }

        return s.substring(begin,begin+maxLen);*/

    //中心扩散算法
    public String longestPalindrome(String s){
        //如果长度小于1,则本身为回文串
        if(s.length() < 1){
            return s;
        }
        //定义开始位置和最大长度,方便最后截取字符串
        int begin = 0;
        int maxLen =0;
        //初始化回文子串的长度,只要s的长度大于等于1,其回文子串的长度至少为1
        int len = 1;
        //如果长度大于等于1,判断中心位置,
        for(int i =0;i<s.length();i++){
            //定义向左扩展的第一位
            int l = i-1;
            //定义向右扩展的第一位
            int r = i+1;
            //如果左边第一位的索引大于等于零且其值等于i处的值,则继续往左移,,移一次回文串长度+1;
            while(l>=0 && s.charAt(l) == s.charAt(i)){
                len++;
                l--;
            }
            //如果右边第一位的索引小于数组长度且其值等于i处的值,则继续往右移,移一次回文串长度+1;
            while(r<s.length() && s.charAt(i) == s.charAt(r)){
                len++;
                r++;
            }
            //保证左右两边的值和中心的值不同时,同时向两边扩散,成功一次,回文串长度+2;
            while(l>=0 && r<s.length() && s.charAt(l) == s.charAt(r)){
                len += 2;
                l--;
                r++;
            }
            //重新确定回文串最大长度和开始位置
            if(len>maxLen){
                maxLen =len;
                begin = l+1;
            }
            len =1;//最关键一步,每次循环完毕,必须对len值重置
        }
        //截取最长回文串
        return s.substring(begin,begin+maxLen);

    }
}
