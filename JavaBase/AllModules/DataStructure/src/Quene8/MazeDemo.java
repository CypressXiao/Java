package Quene8;

import java.lang.reflect.WildcardType;
import java.util.Scanner;

public class MazeDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //输入迷宫的长
        System.out.println("输入迷宫的长:");
        int length = sc.nextInt();
        //输入迷宫的宽
        System.out.println("输入迷宫的宽:");
        int width = sc.nextInt();
        //创建一个迷宫
        int[][] arr = makeMaze(length, width);
        setWay(arr,1,1);
        print(arr);


    }

    /**
     * 寻找迷宫出路的方法
     * 起点为(1,1),终点为(length-1,width-1)
     * 行走的路线是先右后上,再下最后左
     * 墙设置为1,0代表没走过,该点可以走通设置为2,走不通设置为3
     */
    public static boolean setWay(int[][] map, int i, int j) {//传入起点位置
        //将终点位置设置为2,为递归结束条件
        if (map[map.length - 2][map[1].length - 2] == 2) {
            return true;
        }
        //判断该点是否走过,
        if (map[i][j] == 0) {
            //如果没走过,将其设置为2
            map[i][j] =2;
            //行走的路线是先右后上,再下最后左
           if(setWay(map,i,j+1)){
               return true;
           }else if(setWay(map,i-1,j)){
               return true;
           }else if(setWay(map,i+1,j)){
               return true;
           }else if (setWay(map,i,j-1)){
               return true;
           }else{
               map[i][j] = 3;
               //说明走不通
               return false;
           }
        }else{
            //如果不为零说明都走过了,不能再走
            return false;
        }
    }

    //创建一个迷宫length*width
    public static int[][] makeMaze(int length, int width) {
        int[][] arr = new int[length][width];
        //第一行和最后一行设置为1
        for (int i = 0; i < width; i++) {
            arr[0][i] = 1;
            arr[length - 1][i] = 1;
        }
        //将第一列和最后一列设置为1
        for (int i = 0; i < length; i++) {
            arr[i][0] = 1;
            arr[i][width - 1] = 1;
        }
        arr[length / 2][1] = 1;
        arr[length / 2][2] = 1;
        arr[length / 2 - 1][width - 2] = 1;
        return arr;
    }

    //打印迷宫的方法
    public static void print(int[][] arr) {
        for (int[] ints : arr) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }
}


