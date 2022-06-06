package BinaryTree;

import lombok.*;

/**
 * @ClassName BinaryTreeDemo1
 * @Description TODO
 * @Author 肖榆柏
 * @Date 2022/5/15 10:32
 * @Version 1.0
 */

public class BinaryTreeDemo1 {
    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        HeroNode hero1 = new HeroNode(1, "宋江");
        HeroNode hero2 = new HeroNode(2, "吴用");
        HeroNode hero3 = new HeroNode(3, "卢俊义");
        HeroNode hero4 = new HeroNode(4, "林冲");
        HeroNode hero5 = new HeroNode(5, "李逵");
        bt.setRoot(hero1);
        bt.getRoot().setLeft(hero2);
        bt.getRoot().setRight(hero3);
        bt.getRoot().getRight().setRight(hero4);
        bt.getRoot().getRight().setLeft(hero5);
        System.out.println("前序遍历:");
        bt.preOrder();
        System.out.println("中序遍历:");
        bt.infixOrder();
        System.out.println("后序遍历:");
        bt.postOrder();
        /*System.out.println("**前序查找**");
        bt.preOrderSearch(5);
        System.out.println("**前序查找**");
        bt.infixOrderSearch(5);
        System.out.println("**前序查找**");
        bt.postOrderSearch(5);*/
        /*System.out.println("删除前前序遍历~");
        bt.preOrder();
        bt.del(5);
        System.out.println("删除后前序遍历~");
        bt.preOrder();*/
    }
}

//定义二叉树类
@Getter
@Setter
@NoArgsConstructor
class BinaryTree {
    //定义根节点
    private HeroNode root;

    //前序遍历的方法
    public void preOrder() {
        if (root == null) {
            System.out.println("该二叉树为空~~");
        } else {
            root.preOrder();
        }
    }

    //中序遍历的方法
    public void infixOrder() {
        if (root == null) {
            System.out.println("该二叉树为空~~");
        } else {
            root.infixOrder();
        }
    }

    //后序遍历的方法
    public void postOrder() {
        if (root == null) {
            System.out.println("该二叉树为空~~");
        } else {
            root.postOrder();
        }
    }

    //前序查找
    public void preOrderSearch(int no) {
        if (root == null) {
            System.out.println("该二叉树为空~~");
        } else {
            HeroNode hn = this.root.preOrderSearch(no);
            if (hn != null) {
                System.out.println("找到" + hn.getId() + "-" + hn.getName());
                return;
            }
            System.out.println("未找到编号为" + no + "的员工");
        }
    }

    //中序查找
    public void infixOrderSearch(int no) {
        if (root == null) {
            System.out.println("该二叉树为空~~");
        } else {
            HeroNode hn = this.root.infixOrderSearch(no);
            if (hn != null) {
                System.out.println("找到" + hn.getId() + "-" + hn.getName());
                return;
            }
            System.out.println("未找到编号为" + no + "的员工");
        }
    }

    //后序查找
    public void postOrderSearch(int no) {
        if (root == null) {
            System.out.println("该二叉树为空~~");
        } else {
            HeroNode hn = this.root.postOrderSearch(no);
            if (hn != null) {
                System.out.println("找到" + hn.getId() + "-" + hn.getName());
                return;
            }
            System.out.println("未找到编号为" + no + "的员工");
        }
    }

    public void del(int no) {
        if (root == null) {
            System.out.println("该二叉树为空~~");
        }
        if (root.getId() == no) {
            root = null;
        } else {
            root.del(no);
        }
    }

}


//定义节点
@Getter
@Setter
@NoArgsConstructor
class HeroNode {
    private int id;
    private String name;
    private HeroNode left;
    private HeroNode right;

    public HeroNode(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "HeroNode{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    //前序遍历的方法,根节点在二叉树类中判断及输出
    public void preOrder() {
        //先输出父节点
        System.out.println(this);
        //再输出左子节点
        if (this.left != null) {
            this.left.preOrder();
        }
        //再输出右子节点
        if (this.right != null) {
            this.right.preOrder();
        }
    }

    //中序遍历的方法
    public void infixOrder() {
        //先输出左子节点
        if (this.left != null) {
            this.left.infixOrder();
        }
        //输出父节点
        System.out.println(this);
        if (this.right != null) {
            this.right.infixOrder();
        }
    }

    //后序遍历的方法
    public void postOrder() {
        if (this.left != null) {
            this.left.postOrder();
        }
        if (this.right != null) {
            this.right.postOrder();
        }
        System.out.println(this);
    }

    //前序查找的方法
    public HeroNode preOrderSearch(int no) {
        System.out.println("前序查找~~");
        if (this.id == no) {
            return this;
        }
        HeroNode resNode = null;
        if (this.left != null) {
            resNode = this.left.preOrderSearch(no);
        }
        if (resNode != null) {
            return resNode;
        }
        if (this.right != null) {
            resNode = this.right.preOrderSearch(no);
        }
        return resNode;
    }

    //中序查找的方法
    public HeroNode infixOrderSearch(int no) {
        HeroNode resNode = null;
        if (this.left != null) {
            resNode = this.left.infixOrderSearch(no);
        }
        if (resNode != null) {
            return resNode;
        }
        System.out.println("中序查找~~");
        if (this.id == no) {
            return this;
        }
        if (this.right != null) {
            resNode = this.right.infixOrderSearch(no);
        }
        return resNode;
    }

    //后序查找的方法
    public HeroNode postOrderSearch(int no) {
        HeroNode resNode = null;
        if (this.left != null) {
            resNode = this.left.postOrderSearch(no);
        }
        if (resNode != null) {
            return resNode;
        }
        if (this.right != null) {
            resNode = this.right.postOrderSearch(no);
        }
        if (resNode != null) {
            return resNode;
        }
        System.out.println("后序查找~~");
        if (this.id == no) {
            return this;
        }
        return resNode;
    }

    //删除的方法,规定若为叶子节点则删除该节点,若为父节点则删除该子树
    public void del(int no) {
        if (this.left != null && this.left.id == no) {
            this.left = null;
            return;
        }
        if (this.right != null && this.right.id == no) {
            this.right = null;
            return;
        }
        if (this.left != null) {
            this.left.del(no);
        }
        if (this.right != null) {
            this.right.del(no);
        }
    }
}
