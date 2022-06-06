package Algorithm.DynamicProgramming;

import java.util.Arrays;

/**
 * @ClassName Dp
 * @Description 动态规划算法解决01背包问题
 * @Author 肖榆柏
 * @Date 2022/5/21 9:36
 * @Version 1.0
 */

public class Dp {
    public static void main(String[] args) {
        //背包的最大容量
        int maxVol = 4;
        //定义包含所有商品价格和重量的数组
        int[] weight = {1, 4, 3};
        int[] val = {1500, 3000, 2000};
        //根据背包最大容量+1和val+1的数组长度创建新的二维数组,来表示各个重量下的商品组合
        int[][] arr = new int[val.length + 1][maxVol + 1];
        //将第一行和第一列置为0
        for (int i = 0; i < arr.length; i++) {
            arr[i][0] = 0;
        }
        Arrays.fill(arr[0], 0);

        //开始遍历填入数据
        for (int i = 1; i < arr.length; i++) {
            for (int j = 1; j < arr[0].length; j++) {
                if (j < weight[i - 1]) {
                    arr[i][j] = arr[i - 1][j];
                } else {
                    arr[i][j] = Math.max(arr[i - 1][j], val[i - 1] + arr[i - 1][j - weight[i - 1]]);
                }
            }
        }

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
