package JavaBase.day4_16;

import java.util.Arrays;

public class QuickSortDemo1 {
    public static void main(String[] args) {
        int[] arr = {12, 5, 9, 23, 45, 28, 91, 46, 82, 31};
        int low = 0;
        int high = arr.length - 1;

        //调用快排的方法
        quickSort(arr, low, high);

        System.out.println(Arrays.toString(arr));
    }

    public static void quickSort(int[] arr, int low, int high) {
        //判断low和high,如果low值比high值大,那么就直接退出递归
        if (low > high) {
            return;
        }

        //定义哨兵i j 和base值
        int i = low;
        int j = high;
        int base = arr[low];

        //只要j比i大,那么就可以开始移动
        while (i < j) {

            //让j开始先动,判断j对应的值是否大于等于基准值,如果大于等于,就往左移动,如果小于就停下
            while (arr[j] >= base && i < j) {
                j--;
            }

            //j停下以后,然后i开始移动,判断i对应的值是否小于等于基准值,如果小于等于,就往有移动,如果大于就停下
            while (arr[i] <= base && i < j) {
                i++;
            }

            //如果ij停下,  判断i是否等于j,只要不等于,并且i小于j  那么就交换i和j位置的元素
            if (i < j) {
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }

        //如果i和j相同,那么开始交换ij相同索引对应的值和base
        int temp = arr[i];
        arr[i] = base;
        arr[low] = temp;


        //数组一分为二,开启第二轮
        quickSort(arr, low, i - 1);
        quickSort(arr, i + 1, high);
    }
}
