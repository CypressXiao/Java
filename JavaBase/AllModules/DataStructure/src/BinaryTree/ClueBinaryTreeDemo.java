package BinaryTree;

import lombok.Getter;
import lombok.Setter;

/**
 * @ClassName ClueBinaryTreeDemo
 * @Description 线索二叉树
 * @Author 肖榆柏
 * @Date 2022/5/15 17:21
 * @Version 1.0
 */

public class ClueBinaryTreeDemo {
    public static void main(String[] args) {
        Node n1 = new Node(1, "tom");
        Node n2 = new Node(2, "jack");
        Node n3 = new Node(3, "jay");
        Node n4 = new Node(4, "Alan");
        Node n5 = new Node(5, "Max");
        Node n6 = new Node(6, "tim");
        Node n7 = new Node(7, "joker");
        ClueBinaryTree cbt = new ClueBinaryTree(n1);
        n1.setLeft(n2);
        n1.setRight(n3);
        n2.setLeft(n4);
        n2.setRight(n5);
        n3.setLeft(n6);
        n3.setRight(n7);

        cbt.infixClue();
        //cbt.infixOrder();
        System.out.println(n4.getRight());
    }
}

@Setter
@Getter
class ClueBinaryTree {
    private Node root;
    private Node pre;//定义一个节点,否则后面的节点无法指向前面的节点

    public ClueBinaryTree(Node root) {
        this.root = root;
    }

    public void infixClue() {
        infixClue(root);
    }

    //提供一个中序线索化的方式
    public void infixClue(Node node) {
        //node为空则无法线索化
        if (node == null) {
            return;
        }
        //先左子树线索化
        infixClue(node.getLeft());
        //线索化当前节点
        if (node.getLeft() == null) {
            node.setLeft(pre);
            node.setLeftType(1);
        }
        if (pre != null && pre.getRight() == null) {
            pre.setRight(node);
            pre.setRightType(1);
        }
        pre = node;
        //线索化右子树
        infixClue(node.getRight());
    }

    //中序线索化遍历的方式
    public void infixOrder() {
        Node node = root;
        while (node != null) {
            while (node.getLeftType() == 0) {
                node = node.getLeft();
            }
            System.out.println(node);
            while (node.getRightType() == 1) {
                node = node.getRight();
                System.out.println(node);
            }
            node = node.getRight();
        }
    }
}


@Getter
@Setter
class Node {
    private int id;
    private String name;
    //left和right分别表示左右节点
    private Node left;
    private Node right;

    //leftType和rightType分别表示指向的左右节点对的类型
    //若为0,则表示本身是有左右节点的,若为leftType=1表示指向前驱,rightType=1表示指向后继
    private int leftType;
    private int rightType;

    public Node(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Node{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
