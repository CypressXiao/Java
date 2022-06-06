package BinaryTree;

/**
 * @ClassName AVLTreeDemo
 * @Description 平衡二叉树
 * @Author 肖榆柏
 * @Date 2022/5/19 7:25
 * @Version 1.0
 */

public class AVLTreeDemo {
    public static void main(String[] args) {
        int[] arr = {4, 3, 6, 5, 7, 8};
        final AVLTree avl = new AVLTree();
        for (int i : arr) {
            avl.add(new Node4(i));
        }
        avl.infixOrder();
        System.out.println("根节点为:"+avl.getRoot());
        System.out.println("左子树高度为:"+avl.getRoot().getLeftHeight());
        System.out.println("右子树高度为:"+avl.getRoot().getRightHeight());

    }
}

class AVLTree {
    Node4 root;

    public Node4 getRoot() {
        return root;
    }

    public AVLTree() {

    }

    //提供一个添加元素的方法
    public void add(Node4 node) {
        if (root == null) {
            root = node;
        } else {
            root.add(node);
        }
    }

    //提供一个中序遍历的方法
    public void infixOrder() {
        if (root == null) {
            System.out.println("当前二叉树为空的,不能遍历~");
        }else {
            root.infixOrder();
        }
    }
}

class Node4 {
    int val;
    Node4 left;
    Node4 right;

    public Node4(int val) {
        this.val = val;
    }

    @Override
    public String toString() {
        return "Node4{" +
                "val=" + val +
                '}';
    }

    //得到左子树高度的方法
    public int getLeftHeight() {
        if (this.left == null) {
            return 0;
        }
        return this.left.getHeight();
    }

    //得到右子树的方法
    public int getRightHeight() {
        if (this.right == null) {
            return 0;
        }
        return this.right.getHeight();
    }

    //返回节点的高度的方法
    public int getHeight() {
        return Math.max(this.left == null ? 0 : this.left.getHeight(),
                this.right == null ? 0 : this.right.getHeight()) + 1;
    }

    //提供一个右旋的方法,不考虑两次旋转的情况下,都是根节点在旋转
    public void rightRotate() {
        //定义一个临时变量来存储要旋转节点的值,不能直接等于this
        Node4 temp = new Node4(val);
        //该临时变量的左边指向当前节点的左节点的右节点,右节点指向当前节点的右节点
        temp.right = this.right;
        temp.left = this.left.right;
        //将当前节点更新为当前节点的左节点
        this.val = this.left.val;
        this.left = this.left.left;
        this.right = temp;
        //旋转完毕
    }

    //提供一个左旋的方法
    public void leftRotate() {
        Node4 temp = new Node4(val);
        temp.left = this.left;
        temp.right = this.right.left;
        this.val = this.right.val;
        this.right = this.right.right;
        this.left = temp;
    }

    //插入节点的方法
    public void add(Node4 node) {
        if (node == null) {
            return;
        }
        if (node.val < this.val) {
            if (this.left == null) {
                this.left = node;
            } else {
                this.left.add(node);
            }
        } else {
            if (this.right == null) {
                this.right = node;
            } else {
                this.right.add(node);
            }
        }
        //AVL树要增加左旋和右旋方法
        //先判断左右子树的高度
        int leftHeight = getLeftHeight();
        int rightHeight = getRightHeight();
        if ((leftHeight - rightHeight) > 1) {
            //如果左子树高于右子树,并且左子树的左子树的高度小于左子树的右子树的高度,则左子树先左旋,然后根节点再右旋
            if (this.left != null && this.left.getLeftHeight() < this.left.getRightHeight()) {
                this.left.leftRotate();
            }
            this.rightRotate();
            return;
        }
        if ((rightHeight - leftHeight) > 1) {
            if (this.right != null && this.right.getLeftHeight() > this.right.getRightHeight()) {
                this.right.rightRotate();
            }
            this.leftRotate();
        }
    }

    //中序遍历的方法
    public void infixOrder() {
        if (left != null) {
            left.infixOrder();
        }

        System.out.println(this);

        if (right != null) {
            right.infixOrder();
        }
    }
}
