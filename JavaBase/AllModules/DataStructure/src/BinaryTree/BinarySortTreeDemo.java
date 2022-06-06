package BinaryTree;


/**
 * @ClassName BinarySortTreeDemo
 * @Description 二叉排序树
 * @Author 肖榆柏
 * @Date 2022/5/18 16:43
 * @Version 1.0
 */

public class BinarySortTreeDemo {
    public static void main(String[] args) {
        int[] arr = {7, 3, 10, 12, 5, 1, 9, 2};
        BinarySortTree bst = new BinarySortTree();
        for (int i : arr) {
            bst.add(new Node3(i));
        }
        System.out.println("删除节点前排序~~");
        bst.infixOrder();

        bst.delNode(7);

        System.out.println("删除节点后排序~~");
        bst.infixOrder();
    }
}

//创建一个二叉排序树的类
class BinarySortTree {
    Node3 root;

    public Node3 getRoot() {
        return root;
    }

    //添加元素的方法
    public void add(Node3 node) {
        if (root != null) {
            root.add(node);
        } else {
            root = node;
        }
    }

    //中序遍历的方法
    public void infixOrder() {
        if (root == null) {
            System.out.println("该二叉查找树为空,无法遍历~~");
        } else {
            root.infixOrder();
        }
    }

    //在删除元素之前要定义两个查找目标node和目标node父node的方法(删除元素肯定是通过val删,这里是要找到val对应的节点)
    //查找目标节点的方法,找到返回节点,没找到返回空
    public Node3 search(int val) {
        if (root == null) {
            return null;
        }
        return root.search(val);
    }

    //查找父节点的方法
    public Node3 searchParent(int val) {
        if (root == null) {
            return null;
        }
        return root.searchParent(val);
    }

    /*提供一个删除节点的方法
   1.删除叶子节点
   2.删除只有一个子节点的父节点
   3.删除有两个子节点的父节点
    */
    public void delNode(int val) {
        if (root == null) {
            return;
        }
        //先得到子节点和父节点
        Node3 targetNode = search(val);
        if (targetNode == null) {
            return;
        }
        if (root.left == null && root.right == null) {
            root = null;
            return;
        }
        Node3 parent = searchParent(val);
        //1.删除节点为叶子节点,判断该叶子节点是父节点的左节点还是又节点
        if (targetNode.left == null && targetNode.right == null) {
            if (parent.left != null && parent.left == targetNode) {
                parent.left = null;
            } else if (parent.right != null && parent.right == targetNode) {
                parent.right = null;
            }
        }
        //删除有两个子节点的父节点,遍历右子树的所有左节点中最小的那个
        else if (targetNode.left != null && targetNode.right != null) {
            //遍历右子树,找到那个最小的值,把他赋于要删除的那个节点并将其删除
            Node3 temp2 = targetNode.right;
            if (temp2.left == null) {
                targetNode.val = temp2.val;
                targetNode.right = null;
            } else {
                while (temp2.left.left != null) {
                    temp2 = temp2.left;
                }
                targetNode.val = temp2.left.val;
                temp2.left = null;
            }
        } else {
            //删除只有一个子节点的父节点,判断目标节点是父节点的左节点还是右节点,在判断目标节点的子节点是左节点还是又节点
            if (targetNode.left != null) {
                //如果目标节点的左节点不为空,并且父节点为空且为一个子节点的父节点的情况就是根节点带左子节点;同理可知右面的情况
                if (parent != null) {
                    if (parent.left == targetNode) {
                        parent.left = targetNode.left;
                    } else if (parent.right == targetNode) {
                        parent.right = targetNode.left;
                    }
                } else {
                    root = targetNode.left;
                }
            } else {
                if (parent != null) {
                    if (parent.left == targetNode) {
                        parent.left = targetNode.right;
                    } else if (parent.right == targetNode) {
                        parent.right = targetNode.right;
                    }
                } else {
                    root = targetNode.right;
                }
            }
        }
    }
}


//创建一个节点类
class Node3 {
    int val;
    Node3 left;
    Node3 right;

    public Node3(int val) {
        this.val = val;
    }

    @Override
    public String toString() {
        return "Node3{" +
                "val=" + val +
                '}';
    }

    //提供一个添加节点的方法
    public void add(Node3 node) {
        //传入节点的值小于当前节点值,则left
        if (node.val < this.val) {
            //如果当前节点左子树为空则直接添加到左子节点
            if (this.left == null) {
                this.left = node;
            } else {
                //如果不为空,则递归添加
                this.left.add(node);
            }
        } else {
            if (this.right == null) {
                this.right = node;
            } else {
                this.right.add(node);
            }
        }
    }

    //提供一个中序遍历的方法
    public void infixOrder() {
        if (this.left != null) {
            this.left.infixOrder();
        }

        System.out.println(this);

        if (this.right != null) {
            this.right.infixOrder();
        }
    }

    //在删除元素之前要定义两个查找目标node和目标node父node的方法(删除元素肯定是通过val删,这里是要找到val对应的节点)
    //查找目标节点的方法,找到返回节点,没找到返回空
    public Node3 search(int val) {
        //能到node里调用方法说明不为空了
        if (this.val == val) {
            return this;
        } else if (val < this.val) {
            if (this.left == null) {
                return null;
            } else {
                //向左递归查找
                return this.left.search(val);
            }
        } else {
            if (this.right == null) {
                return null;
            } else {
                return this.right.search(val);
            }
        }
    }

    //查找目标节点的父节点的方法,在子节点存在的情况下再调用该方法
    public Node3 searchParent(int val) {
        if (this.left != null && this.left.val == val || this.right != null && this.right.val == val) {
            return this;
        } else {
            if (val < this.val && this.left != null) {
                //向左递归
                return this.left.searchParent(val);
            } else if (val >= this.val && this.right != null) {
                //向右递归
                return this.right.searchParent(val);
            } else {
                return null;
            }
        }
    }
}
