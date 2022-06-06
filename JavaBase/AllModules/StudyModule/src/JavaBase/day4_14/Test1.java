package JavaBase.day4_14;

import java.util.Arrays;

public class Test1 {
    /**
     * 1.使用冒泡,选择排序对一个数组进行排序,然后使用二分查找法找出其中的某一个元素,
     * 如果该数组中不包含该元素,则返回-1(封装方法)
     *
     * @param args
     */
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 3, 7, 4, 4, 8, 23};
        int[] arr1 = getOrder(arr);
        System.out.println(Arrays.toString(arr1));
        int index = getIndex(6,arr1);
        System.out.println(index);
    }

    public static int[] getOrder(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    public static int getIndex(int numb, int[] arr) {
        int min = 0;
        int max = arr.length - 1;

        while (min<=max) {
            int mid = (min + max) / 2;
            if (arr[mid] > numb) {
                max = mid - 1;
            } else if (arr[mid] < numb) {
                min = mid + 1;
            } else if (arr[mid] == numb) {
                return mid;
            }
        }
        return -1;
    }
}





