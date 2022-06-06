package BinaryTree;

/**
 * @ClassName ArrBinaryTreeDemo
 * @Description 数组模拟二叉树遍历
 * @Author 肖榆柏
 * @Date 2022/5/15 16:04
 * @Version 1.0
 */

public class ArrBinaryTreeDemo {
    /*
    前提是完全二叉树
    根节点对应数组的0号索引,然后按层从左至右顺序编号;
    父节点和其子节点的索引关系:
    左子节点:2*父节点的索引+1
    右子节点:2*父节点的索引+2
    父节点的索引:(子节点索引-1)/2
     */
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        final ArrBinaryTree abt = new ArrBinaryTree(arr);
        //abt.preOrder(); //1,2,4,5,3,6,7
        //abt.infixOrder(); //4,2,5,1,6,3,7
        abt.postOrder(); //4,5,2,6,7,3,1
    }
}

class ArrBinaryTree {
    private int[] arr;

    public ArrBinaryTree(int[] arr) {
        this.arr = arr;
    }

    public void preOrder() {
        preOrder(0);
    }

    public void infixOrder() {
        infixOrder(0);
    }

    public void postOrder() {
        postOrder(0);
    }

    //前序遍历数组的方法
    public void preOrder(int index) {
        if (arr == null || arr.length == 0) {
            System.out.println("该数组元素为空~");
        }
        System.out.println(arr[index]);
        //向左递归
        if (2 * index + 1 < arr.length) {
            preOrder(2 * index + 1);
        }
        if (2 * index + 2 < arr.length) {
            preOrder(2 * index + 2);
        }
    }

    //中序遍历数组的方法
    public void infixOrder(int index) {
        if (arr == null || arr.length == 0) {
            System.out.println("该数组元素为空~");
        }
        //向左递归
        if (2 * index + 1 < arr.length) {
            infixOrder(2 * index + 1);
        }
        System.out.println(arr[index]);
        if (2 * index + 2 < arr.length) {
            infixOrder(2 * index + 2);
        }
    }

    //后序遍历数组的方法
    public void postOrder(int index) {
        if (arr == null || arr.length == 0) {
            System.out.println("该数组元素为空~");
        }
        //向左递归
        if (2 * index + 1 < arr.length) {
            postOrder(2 * index + 1);
        }
        if (2 * index + 2 < arr.length) {
            postOrder(2 * index + 2);
        }
        System.out.println(arr[index]);
    }
}
