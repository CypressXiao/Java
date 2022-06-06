package Algorithm.DividedAndConquer;

/**
 * @ClassName dac
 * @Description 分治算法模拟汉诺塔问题
 * @Author 肖榆柏
 * @Date 2022/5/21 9:20
 * @Version 1.0
 */

public class Dac {
    public static void main(String[] args) {
        tower(5,'A','B','C');
    }
    //汉诺塔问题采用分治算法是因为当盘数大于2时,始终能将问题看成两个盘的问题,且之间是相互独立的
    /*
    num -- 盘的个数
    a,b,c -- 分别代表一根柱子
     */
    public static void tower(int num,char a,char b,char c) {
        if (num == 1) {
            System.out.println("第" + num + "盘:" + a + "->" + c);
        } else {
            tower(num - 1, a, c, b);
            System.out.println("第" + num + "盘:" + a + "->" + c);
            tower(num-1,b,a,c);
        }
    }
}
