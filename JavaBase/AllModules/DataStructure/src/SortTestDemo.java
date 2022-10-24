import java.util.Arrays;

/**
 * @projectName: Java&MySQL
 * @package: PACKAGE_NAME
 * @className: SortTestDemo
 * @author: Cypress_Xiao
 * @description: 常见排序方法手写
 * @date: 2022/7/1 7:47
 * @version: 1.0
 */

public class SortTestDemo {
    public static void main(String[] args) {
        int[] arr = {234, 12, 34, 23, 253, 123};
        //chooseSort(arr);
        //bubbleSort(arr);
        //insertSort(arr);
        //quickSort(arr, 0, arr.length - 1);
        mergeSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));

    }

    /**
     * @param arr:待排序的数组
     * @return void
     * @author Cypress_Xiao
     * @description 选择排序
     * @date 2022/7/1 7:49
     */
    public static void chooseSort(int[] arr) {
        int len = arr.length;
        for (int i = 0; i < len - 1; i++) {
            for (int j = i + 1; j < len; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }

    /**
     * @param arr:待排序的数组
     * @return void
     * @author Cypress_Xiao
     * @description 冒泡排序
     * @date 2022/7/1 7:56
     */
    public static void bubbleSort(int[] arr) {
        int len = arr.length;
        for (int i = 0; i < len - 1; i++) {
            for (int j = 0; j < len - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    /**
     * @param arr:待排序的数组
     * @return void
     * @author Cypress_Xiao
     * @description 插入排序
     * @date 2022/7/1 8:18
     */
    public static void insertSort(int[] arr) {
        int len = arr.length;
        int insertIndex;
        for (int i = 1; i < len; i++) {
            int insertEle = arr[i];
            insertIndex = i - 1;
            while (insertIndex >= 0 && arr[insertIndex] > insertEle) {
                arr[insertIndex + 1] = arr[insertIndex];
                insertIndex--;
            }
            arr[insertIndex + 1] = insertEle;
        }
    }

    /**
     * @param arr:   待排序的数组
     * @param left:  排序的左边界
     * @param right: 排序的右边界
     * @return void
     * @author Cypress_Xiao
     * @description 快速排序
     * @date 2022/7/1 8:39
     */
    public static void quickSort(int[] arr, int left, int right) {
        //递归退出条件是左边大于右边
        if (left > right) {
            return;
        }

        int l = left;
        int r = right;

        //定义一个基准数
        int base = arr[left];
        //当左边小于右边时,把比base小的数放在左边,把比base大的数放在右边
        while (l < r) {
            while (base <= arr[r] && l < r) {
                r--;
            }
            while (base >= arr[l] && l < r) {
                l++;
            }
            //在右边找到比base小的数就停下,在左边找到比base大的数就停下交换
            int temp = arr[r];
            arr[r] = arr[l];
            arr[l] = temp;
        }
        //while结束时说明l和r重合了,此时改变base的值
        arr[left] = arr[r];
        arr[r] = base;

        //开始向左,向右递归

        quickSort(arr, left, r - 1);
        quickSort(arr, r + 1, right);
    }

    /**
     * @param arr: 待排序的数组
     * @param left: 原始数组左边界
     * @param right: 原始数组右边界
     * @return void
     * @author Cypress_Xiao
     * @description 归并排序包括分以及并
     * @date 2022/7/1 20:05
     */
    public static void mergeSort(int[] arr, int left, int right) {
        if (arr == null || arr.length < 2) {
            return;
        }
        if (left < right) {
            int mid = (right + left) / 2;
            //这里的向左,向右是先拆分
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            //这里的方法是并
            merge(arr, left, mid, right);
        }
    }

    /**
     * @param arr: 待排序的数组
     * @param left: 待合并数组的左边界
     * @param mid: 待合并数组的右边界
     * @param right: 另一待合并数组的右边界
     * @return void
     * @author Cypress_Xiao
     * @description 归并排序中的合并的步骤
     * @date 2022/7/1 20:07
     */
    public static void merge(int[] arr, int left, int mid, int right) {
        //创建一个数组用于存储合并之后的元素
        int[] arr1 = new int[right - left + 1];
        //遍历left到mid和mid+1到right并比较
        int index = 0;
        int i = left;
        int j = mid + 1;
        while (i <= mid && j <= right) {
            if (arr[i] < arr[j]) {
                arr1[index++] = arr[i++];
            } else {
                arr1[index++] = arr[j++];
            }
        }

        while (i <= mid) {
            arr1[index++] = arr[i++];

        }

        while (j <= right) {
            arr1[index++] = arr[j++];
        }

        for (int i1 = 0; i1 < arr1.length; i1++) {
            arr[left + i1] = arr1[i1];
        }
    }
}


