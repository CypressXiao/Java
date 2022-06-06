package Sort;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

/**
 * @ClassName ShellSortDemo
 * @Description TODO
 * @Author 肖榆柏
 * @Date 2022/5/11 8:01
 * @Version 1.0
 */

public class ShellSortDemo {
    public static void main(String[] args) {
        int[] arr =new int[8000000];
        for (int i = 0; i < 8000000; i++) {
            arr[i] =(int) (Math.random()*8000000);
        }
        //shellSort(arr);
        shellSort1(arr);

    }
    //交换法实际上并未提高效率
    public static  void  shellSort(int[] arr){
        System.out.println(new SimpleDateFormat("yy-MM-dd HH:mm:ss").format(new Date()));
        int len = arr.length;
        //当gap为0是就说明没有法分组了,就只是一个数组了
        for(int gap = len/2;gap>0;gap /=2){
            //对每个分组里的数据进行选择排序
            for (int i = 0;i< len;i++){
                for (int j = i;j<len;j+=gap){
                    if(arr[i]>arr[j]){
                        int temp = arr[j];
                        arr[j] = arr[i];
                        arr[i] =temp;
                    }
                }
            }
        }
        System.out.println(new SimpleDateFormat("yy-MM-dd HH:mm:ss").format(new Date()));
       //System.out.println(Arrays.toString(arr));
    }

    //移动法的shell排序
    public static void shellSort1(int[] arr){
        int len = arr.length;
        System.out.println(new SimpleDateFormat("yy-MM-dd HH:mm:ss").format(new Date()));
        for(int gap = len/2;gap>0;gap /=2){
            for(int i = 0;i<len;i++){
                //对每个划分的数组进行插入排序
                if ((i+gap)< len) {
                    int insertVal = arr[i+gap];
                    int insertIndex = i;
                    while(insertIndex>=0 && arr[i]> arr[i+gap]){
                        arr[i+gap] = arr[i];
                        insertIndex -=gap;
                    }
                    arr[insertIndex+gap] = insertVal;
                }
            }
        }
        System.out.println(new SimpleDateFormat("yy-MM-dd HH:mm:ss").format(new Date()));
        //System.out.println(Arrays.toString(arr));
    }
}
