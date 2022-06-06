package Sort;

import java.util.Arrays;

public class InsertSortDemo {
    public static void main(String[] args) {
        int[] arr = new int[]{103, 99, 34, -12, -3};
        insertSort(arr);
        System.out.println(Arrays.toString(arr));

    }

    public static void insertSort(int[] arr) {
        //升序排列
        for (int i = 1; i < arr.length; i++) {
            int insertVal = arr[i];
            int insertIndex = i - 1;
            //如果插入位置的索引大于零并且插入位置的值大于插入1
            while (insertIndex >= 0 && arr[insertIndex] > insertVal) {
                //把插入位置的值后移,相当于复制一手
                arr[insertIndex + 1] = arr[insertIndex];
                insertIndex--;
            }
            //找到插入索引之后,插入插入值
            arr[insertIndex + 1] = insertVal;
        }
    }
}
