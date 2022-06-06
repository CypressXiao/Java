package util;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArrayUtil {

    /**
     * 打印一个int类型的数组
     * @param  arr 接受一个int类型的数组
     */

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr.length == 1) {
                System.out.print("[" + arr[0] + "]");
            } else if (i == 0) {
                System.out.print("[" + arr[i] + ",");
            } else if (i == arr.length - 1) {
                System.out.println(arr[i] + "]");
            } else {
                System.out.print(arr[i] + ",");
            }
        }
    }

    /**
     * 打印一个char类型的数组
     * @param arr 接受一个char类型的数组
     */

    public static void printArray(char[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr.length == 1) {
                System.out.print("[" + arr[0] + "]");
            } else if (i == 0) {
                System.out.print("[" + arr[i] + ",");
            } else if (i == arr.length - 1) {
                System.out.println(arr[i] + "]");
            } else {
                System.out.print(arr[i] + ",");
            }
        }
    }

    /**
     * 打印一个String类型的数组
     * @param arr 接受一个String类型的素组
     */

    public static void printArray(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr.length == 1) {
                System.out.print("[" + arr[0] + "]");
            } else if (i == 0) {
                System.out.print("[" + arr[i] + ",");
            } else if (i == arr.length - 1) {
                System.out.println(arr[i] + "]");
            } else {
                System.out.print(arr[i] + ",");
            }
        }
    }

    /**
     * int类型数组的冒泡排序
     * @param arr 接受一个int类型的数组
     */

    public static void getSequence(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int a = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = a;
                }
            }
        }
        printArray(arr);
    }

    /**
     * int类型数组的选择排序
     * @param arr 接受一个int类型的数组
     */

    public static void choseGetSequence(int[] arr){
        for(int i =0;i<arr.length-1;i++){
            for(int j =i+1;j<arr.length;j++){
                if(arr[i] >arr[j]){
                    int temp =arr[j];
                    arr[j] =arr[i];
                    arr[i] =temp;
                }
            }
        }
        printArray(arr);
    }

    /**
     * int类型数组中元素的最大值
     * @param arr 接受一个int类型的数组
     */

    public static void getMax(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int a = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = a;
                }
            }
        }
        System.out.println(arr[arr.length - 1]);
    }

    /**
     * int类型数组中元素的最小值
     * @param arr 接受一个int类型的数组
     */

    public static void getMin(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] < arr[j + 1]) {
                    int a = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = a;
                }
            }
        }
        System.out.println(arr[arr.length - 1]);
    }

    /**
     * int类型数组中元素的互换
     * @param arr 接受一个int类型的数组
     */

    public static void swap(int[] arr, int x, int y) {
        if (x < arr.length && y < arr.length) {
            int a = arr[x];
            arr[x] = arr[y];
            arr[y] = a;
            ArrayUtil.printArray(arr);
        } else {
            System.out.println("x或y的值不正确");
        }
    }

    /**
     * int类型数组中元素的逆序
     * @param arr 接受一个int类型的数组
     */

    public static void reverse(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                int a = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = a;
            }
        }
    }

    /**
     * int类型二维数组中元素的打印
     * @param arr 接受一个int类型的数组
     */

    public static void douArrPrintArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr.length == 1) {
                System.out.print("[" + Arrays.toString(arr[i]) + "]");
            } else if (i == 0) {
                System.out.print("[" + Arrays.toString(arr[i]) + ",");
            } else if (i == arr.length - 1) {
                System.out.print(Arrays.toString(arr[i]) + "]");
            }
        }
        System.out.println();
    }

    /**
     * 生成验证码
     */

    public static void getCetiCode() {
        String baseAlpha = "qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM1234567890";
        Random ran = new Random();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("*****请输入验证码位数*****");
            int x = sc.nextInt();
            while (true) {
                if (x <= 0) {
                    System.out.println("输入内容不合法，请重新输入验证码位数！");
                    x = sc.nextInt();
                } else {
                    for (int i = 0; i < x; i++) {
                        int numb = ran.nextInt(baseAlpha.length() - 1);
                        char ranNum = baseAlpha.charAt(numb);
                        if (i == 0) {
                            System.out.print("验证码为：" + ranNum);
                        } else {
                            System.out.print(ranNum);
                        }
                    }
                    System.out.println();
                    System.out.println("--------------------");
                    break;
                }
            }
            System.out.println("是否继续生成验证码？(y/n)");
            String ans = sc.next();
            if ("n".equals(ans) || "N".equals(ans)) {
                break;
            }
        }
    }

    /**
     * 查找int数组中元素的索引值
     * @param arr 接受一个int类型的数组
     * @param numb 接受一个int类型的变量
     * @return 返回索引值
     */

    public static int getIndex(int[] arr, int numb){
        getSequence(arr);
        int min = 0;
        int max =arr.length -1;
        int index =-1; //如果查找的数字没在arr里,返回-1
        while(min<=max){
            int mid =(min+max)>>>1;
            if(arr[mid] > numb){
                max =mid -1;
            }else if(arr[mid] < numb){
                min =mid +1;
            }else{
                index =mid;
                break;
            }
        }
        return index;
    }
}


