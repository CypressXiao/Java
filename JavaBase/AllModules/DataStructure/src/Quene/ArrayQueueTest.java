package Quene;

import java.util.Scanner;

public class ArrayQueueTest {
    public static void main(String[] args) {
        //生成一个数组序列对象
        ArrayQueue arrayQueue = new ArrayQueue(3);
        char key = ' ';//接收用户传入的选项
        Scanner sc = new Scanner(System.in);
        boolean flag =true;
        while(flag){
            System.out.println("请输入你的选择:");
            System.out.println("a(add):添加元素");
            System.out.println("g(get):获取元素");
            System.out.println("h(head):显示头部元素值");
            System.out.println("s(show):显示序列全部元素");
            System.out.println("e(exit):退出当前操作");
            System.out.println("-----------------------------------");
            key = sc.next().charAt(0);
            switch (key){
                case 'a':
                    System.out.println("请输入添加的元素");
                    int ele =sc.nextInt();
                    arrayQueue.addElement(ele);
                    break;
                case 'g':
                    try {
                        int numb =arrayQueue.getElement();
                        System.out.printf("取到的数据为:%d",numb);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 'h':
                    try {
                        int numb1 =arrayQueue.headQueue();
                        System.out.println("头部的数据为:%d"+numb1);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 's':
                    arrayQueue.show();
                    break;
                case 'e':
                    System.out.println("退出该页面!");
                    flag =false;
                    break;

                default:
                    break;
                    }
        }
    }
}

//创建一个数组类型序列的类

class ArrayQueue{
    private int rear;
    private int front;
    private int maxSize;
    private int[] arr;

    //创建序列构造器
    public ArrayQueue(int arrMaxSize){
        maxSize = arrMaxSize;
        arr = new int[maxSize];
        front = -1;
        rear =-1;
    }

    //判断序列是否是已满
    public boolean isFull(){
        return rear == maxSize-1;
    }

    //判断序列是否为空
    public boolean isEmpty(){
        return rear == front;
    }

    //向序列中添加元素
    public void addElement(int a){
        if(isFull()){
            System.out.println("该序列已满,不能添加数据!");
            return;
        }
        rear++;
        arr[rear] = a;
    }

    //从序列中取出元素,每次从头部取出一个元素
    public int getElement(){
        if(isEmpty()){
            throw new RuntimeException("队列空,不能取出数据!");
        }
        front++;
        return arr[front];

    }

    //显示队列的所有数据
    public void show(){
        if(isEmpty()){
            System.out.println("对列是空的!");
        }
        for(int i =0;i<arr.length;i++){
            System.out.printf("arr[%d] = %d ",i,arr[i]);
        }
    }

    //查看当前头部数据的值
    public int headQueue(){
        if(isEmpty()){
            throw new RuntimeException("队列空,不能取出数据!");
        }
        return arr[front+1];
    }
}
