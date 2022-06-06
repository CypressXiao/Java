package HoffmanZipDemo;

import JavaBase.day4_22.ChangableDemo;

import java.util.*;

/**
 * @ClassName HoffmanZipDemo
 * @Description 利用霍夫曼树对文件进行压缩以及解压操作
 * @Author 肖榆柏
 * @Date 2022/5/18 9:58
 * @Version 1.0
 */

public class HoffmanZipAndUnpackDemo {
    public static void main(String[] args) {
        String str = "i like like like java do you like a java";
        final String s = HoffmanZip.change(str);
        System.out.println(s);
        final byte[] bs = HoffmanZip.getBytes(s);
        System.out.println(Arrays.toString(bs));
    }

    //提供一个将字符串各字符转成对应编码值的方法
}

//定义一个压缩字符串的类
class HoffmanZip {
    //提供一个将字符串各字符转成对应编码值的方法,并将对应字符以及次数存到一个map集合中
    static HashMap<Character, Integer> map = new HashMap<>();
    //用集合中的每对键值对创建Node2对象,并存入集合中
    static ArrayList<Node2> nodes = new ArrayList<>();

    public static void getCharMap(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (!map.containsKey(str.charAt(i))) {
                map.put(str.charAt(i), 1);
            } else {
                map.put(str.charAt(i), map.get(str.charAt(i)) + 1);
            }
        }
    }

    public static void getNodes() {
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            nodes.add(new Node2(entry.getKey(), entry.getValue()));
        }
    }

    //得到Node2对象后,开始利用霍夫曼树进行数据处理,返回的是根节点
    public static Node2 getHoffmanTree() {
        while (nodes.size() > 1) {
            Collections.sort(nodes);
            Node2 leftNode = nodes.get(0);
            Node2 rightNode = nodes.get(1);
            Node2 parent = new Node2(null, leftNode.data + rightNode.data);
            parent.left = leftNode;
            parent.right = rightNode;

            nodes.remove(leftNode);
            nodes.remove(rightNode);
            nodes.add(parent);
        }
        return nodes.get(0);
    }

    //提供一个方法去递归获取每个字符的霍夫曼编码,并存入一个新的map中,用字符串存储霍夫曼编码是因为这样处理方便添加二进制位
    //需要传入节点Node,StringBuilder对象,向左sb拼接0,向右sb拼接
    static HashMap<Character, String> hoffmanCodes = new HashMap<>();

    public static void getCodes(Node2 node, String code, StringBuilder sb) {
        StringBuilder sb1 = new StringBuilder(sb);
        sb1.append(code);
        if (node != null) {
            if (node.ch == null) {
                //向左递归
                getCodes(node.left, "0", sb1);
                //向右递归
                getCodes(node.right, "1", sb1);
            } else {
                //如果ch为空则说明找到了子节点
                hoffmanCodes.put(node.ch, sb1.toString());
            }
        }
    }

    //重写getCodes方法,因为第一次不知道传入,不知道code该传多少,因而在一个方法中从root开始向左向右递归调用
    public static HashMap<Character, String> getCodes(Node2 root) {
        final StringBuilder sb = new StringBuilder();
        if (root == null) {
            return null;
        }
        getCodes(root.left, "0", sb);
        getCodes(root.right, "1", sb);
        return hoffmanCodes;
    }

    //提供一个方法,将字符串按hoffman编码输出
    public static String getNewCodes(String str, HashMap<Character, String> hoffmanCodes) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            sb.append(hoffmanCodes.get(ch));
        }
        return sb.toString();
    }

    //提供一个方法将每位二进制转化为一个10进制,最后的不足8位的则正常取
    public static byte[] getBytes(String s) {
        //先得到要创建的byte数组的长度
        int len = s.length() % 8 == 0 ? s.length() / 8 : s.length() / 8 + 1;
        byte[] bs = new byte[len];
        int index =0;
        for (int i = 0; i < s.length(); i = i + 8) {
            String str = "";
            if (i + 8 > s.length()) {
                str = s.substring(i);
                bs[index] = (byte)Integer.parseInt(str);
                break;
            }
            str = s.substring(i,i+8);
            bs[index] =(byte)Integer.parseInt(str,2);
            index++;
        }
        return bs;
    }

    //提供一个完整方法将str转成霍夫曼编码
    public static String change(String str) {
        getCharMap(str);
        getNodes();
        final Node2 root = getHoffmanTree();
        HashMap<Character, String> map = getCodes(root);
        return getNewCodes(str, map);
    }
}


//定义一个节点类
class Node2 implements Comparable<Node2> {
    Character ch;
    int data;//对应字符的次数
    Node2 left;
    Node2 right;


    public Node2(Character ch, int data) {
        this.ch = ch;
        this.data = data;
    }

    @Override
    public String toString() {
        return "Node2{" +
                "ch=" + ch +
                ", data=" + data +
                '}';
    }

    @Override
    public int compareTo(Node2 o) {
        return this.data - o.data;
    }

    //提供一个前序遍历的方法
    public void preOrder() {
        System.out.println(this);
        if (this.left != null) {
            this.left.preOrder();
        }
        if (this.right != null) {
            this.right.preOrder();
        }
    }
}
