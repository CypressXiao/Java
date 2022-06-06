package Sort;

import java.util.Arrays;

/**
 * @ClassName HeapSort
 * @Description TODO
 * @Author 肖榆柏
 * @Date 2022/5/17 20:46
 * @Version 1.0
 */

public class HeapSort {
    public static void main(String[] args) {
        int[] arr = {1, 29, 3984, 293, -183, 93};
        heapSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    //堆排序的方法
    public static void heapSort(int[] arr) {
        int temp =0;
        //先从离叶子结点最近的编号最大的父节点开始调整
        for(int i =arr.length/2-1;i>=0;i--){
            adjust(arr,i,arr.length);//该步骤是为了先一次让整个数变得有规律
        }
        //第一次排完之后最大数已在0号索引
        //取出后,最大索引到了最后,那么就继续从上到下进行筛选.固定一位要筛选的就少一位
        for(int j =arr.length-1;j>0;j--){
            temp = arr[j];
            arr[j] = arr[0];
            arr[0] = temp;
            adjust(arr,0,j);
        }
    }

    //对数组按树要求进行调整的方法
    // i -- 需要判断是否需要调整的父节点位置
    // length -- 代表还需要进行排序的数的个数
    public static void adjust(int[] arr, int i,int length) {
        //1.先判断此父节点左右节点的大小情况
        int temp = arr[i];
        for (int j = 2 * i + 1; j < length; j = 2 * j + 1) {
            if (j + 1 < length && arr[j] < arr[j + 1]) {
                j++;
            }
            if (arr[j] > temp) {
                arr[i] = arr[j];
                //这里是为了每次换完得到被交换元素在数组中的位置,为了最后的时候将下标为i的值给过去
                i = j;
            } else {
                //这里为啥敢直接break,因为我上面排序的时候会先从下往上
                break;
            }
        }
        //循环完找到了交换的元素的位置
        arr[i] = temp;
    }
}
