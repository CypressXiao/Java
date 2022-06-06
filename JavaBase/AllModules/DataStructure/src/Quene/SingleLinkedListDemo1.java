package Quene;

public class SingleLinkedListDemo1 {
    public static void main(String[] args) {
        SingleLinkedList list = new SingleLinkedList();
        HeroNode hero1 = new HeroNode(1, "宋江", "及时雨");
        HeroNode hero2 = new HeroNode(2, "卢俊义", "玉麒麟");
        HeroNode hero3 = new HeroNode(3, "吴用", "智多星");
        HeroNode hero4 = new HeroNode(4, "林冲", "豹子头");

        list.add(hero1);
        list.add(hero4);
        list.add(hero3);
        list.add(hero2);
        list.show();
        System.out.println("-----------------------------------");
        list.addByOrder(hero1);
        list.addByOrder(hero4);
        list.addByOrder(hero3);
        list.addByOrder(hero2);

        System.out.println("单链表中节点个数为"+SingleLinkedListDemo1.getNumb(list.getHead()));
        list.getNumb();
        list.show();

        HeroNode hero5 = new HeroNode(4,"小林","小豹子");
        list.set(hero5);
        System.out.println("修改后的链表为:");
        list.show();

        System.out.println("删除后的链表为:");
        list.del(4);

        list.show();

    }
    //获取单链表的节点个数
    public static int getNumb(HeroNode head){
        int count = 0;
        HeroNode temp = head;
        while (temp.next != null){
            temp = temp.next;
            count++;
        }
        return count;
    }
}

//创建一个单链表类,用对节点进行操作
class SingleLinkedList {
    //定义头结点
    private HeroNode head = new HeroNode(0, "", "");

    //返回头结点
    public  HeroNode getHead(){
        return head;
    }


    //获取单链表的节点个数
    public void getNumb(){
        int count = 0;
        HeroNode temp = head;
        while (temp.next != null){
            temp = temp.next;
            count++;
        }
        System.out.println("单链表中节点个数为"+count);
    }

    //定义无序添加的方法
    public void add(HeroNode heroNode) {
        HeroNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = heroNode;
    }

    //定义有序的添加方法(根据编号)
    public void addByOrder(HeroNode heroNode) {
        HeroNode temp = head;
        boolean flag = false;
        while(true){
            if(temp.next == null){
                break;
            }
            if(temp.next.no > heroNode.no){
                break;
            }else if( temp.next.no == heroNode.no){
                flag = true;
                break;
            }
            temp = temp.next;
        }
        if(flag){
            System.out.printf("编号为%d的英雄%s已被添加!",heroNode.no,heroNode.name);
        }else{
            heroNode.next = temp.next;
            temp.next = heroNode;
        }
    }

    //根据newHeroNode编号改变对应节点的值
    public void set(HeroNode newHeroNode){
        HeroNode temp = head;
        boolean flag = false;  //用来标记是否找到该节点
        if(temp.next == null){
            System.out.println("链表为空!");
        }
        while(true){
             //在不为空的情况下让指针移动
            if(temp.next == null){
                break;
            }
            if(temp.next.no == newHeroNode.no ){
                flag = true;
                break;
            }
            temp = temp.next;
        }
        if(flag){
            temp.next.name = newHeroNode.name;
            temp.next.nickname = newHeroNode.nickname;
        }else{
            System.out.printf("编号为%d的英雄不存在!",newHeroNode.no);
        }
    }

    //根据编号删除节点
    public void del(int no){
        HeroNode temp = head;
        boolean flag = false;
        if(temp.next == null){
            System.out.println("链表为空!");
        }
        while (true){
            if(temp.next == null){
                break;
            }
            if(temp.next.no == no){
                flag = true;
                break;
            }
            temp = temp.next;
        }
        if(flag){
            temp.next = temp.next.next;
        }else{
            System.out.printf("编号为%d的不存在!",no);
        }
    }


    //遍历链表中的元素
    public void show() {
        if (head.next == null) {
            System.out.println("链表为空!");
        }
        HeroNode temp = head.next;
        while (temp != null) {
            System.out.println(temp);
            temp = temp.next;
        }
    }

}

//创建一个HeroNode类用于初始化英雄信息
class HeroNode {
    int no;
    String name;
    String nickname;
    HeroNode next;//类名加next代表定义指针

    public HeroNode() {
    }

    public HeroNode(int no, String name, String nickname) {
        this.no = no;
        this.name = name;
        this.nickname = nickname;
    }

    @Override
    public String toString() {
        return "HeroNode{" +
                "no=" + no +
                ", name='" + name + '\'' +
                ", nickname='" + nickname + '\'' +
                '}';
    }
}