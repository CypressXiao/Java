package JavaBase.day4_7;

import java.util.ArrayList;

public class test {
    public static void main(String[] args) {
        int[] arr1 = new int[]{1,2};
        int[] arr2 = new int[]{3,4};
        double b = findMedianSortedArrays(arr1, arr2);
        System.out.println(b);

    }

    //给定两个大小分别为 m 和 n 的正序（从小到大）数组 nums1 和 nums2。
    //请你找出并返回这两个正序数组的 中位数 。
    public  static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i : nums1) {
            list.add(i);
        }
        for (int j : nums2) {
            list.add(j);
        }
        ArrayList<Integer> list1 = getOrder(list);
        System.out.println(list1);
        double a = 0;
        if (list1.size() % 2 != 0) {
            a = list1.get(list1.size() / 2);
        } else {
            a =  ((list1.get(list1.size() / 2) + list1.get(list1.size() / 2 - 1))*1.0 / 2);
        }
        return a;
    }

    public static ArrayList<Integer> getOrder(ArrayList<Integer> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = 0; j < list.size() - 1 - i; j++) {
                if (list.get(j) > list.get(j + 1)) {
                    int temp = list.get(j + 1);
                    list.set(j + 1, list.get(j));
                    list.set(j, temp);
                }
            }
        }
        return list;
    }
}


