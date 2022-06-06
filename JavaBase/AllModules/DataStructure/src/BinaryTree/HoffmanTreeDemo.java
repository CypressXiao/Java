package BinaryTree;


import java.util.ArrayList;
import java.util.Collections;

/**
 * @ClassName HoffmanTreeDemo
 * @Description TODO
 * @Author 肖榆柏
 * @Date 2022/5/18 7:19
 * @Version 1.0
 */

public class HoffmanTreeDemo {
    public static void main(String[] args) {
        int[] arr ={13,7,8,3,29,6,1};
        preOrder(change(arr));
    }
    //提供一个将数组转为霍夫曼树的方法
    public static Node1 change(int[] arr){
        //转成数组便于管理
        ArrayList<Node1> nodes = new ArrayList<>();
        for (int i : arr) {
            nodes.add(new Node1(i));
        }

        while (nodes.size()>1) {
            Collections.sort(nodes);

            //先取出最小的两个节点构成一颗新树
            Node1 leftNode = nodes.get(0);
            Node1 rightNode = nodes.get(1);
            Node1 parent = new Node1(leftNode.val+rightNode.val);
            parent.left = leftNode;
            parent.right = rightNode;

            //删除已组成新子树的节点,并将新节点加入原nodes
            nodes.remove(leftNode);
            nodes.remove(rightNode);

            nodes.add(parent);
        }
        //循环完返回一个根节点即可
        return nodes.get(0);
    }
    public static void preOrder(Node1 root){
        if(root == null){
            System.out.println("该树为空~~");
        }else{
            root.preOrder();
        }
    }
}

//定义一个节点类
class Node1 implements Comparable<Node1>{
    int val;
    Node1 left;
    Node1 right;

    public Node1(int val) {
        this.val = val;
    }

    @Override
    public String toString() {
        return "Node1{" +
                "val=" + val +
                '}';
    }


    @Override
    public int compareTo(Node1 o) {
        return this.val - o.val;
    }

    //提供一个前序遍历的方法
    public void preOrder(){
        System.out.println(this);
        if(this.left !=null){
            this.left.preOrder();
        }
        if(this.right!=null){
            this.right.preOrder();
        }
    }
}
