package Preview.SingleLinkedList;

public class SingleLinkedList {
    //定义一个私有化头结点
    private final HeroNode head = new HeroNode(0, "", "");

    //定义一个方法得到head
    public HeroNode getHead() {
        return head;
    }

    //定义一个无序增加元素的方法
    public void add(HeroNode heroNode) {
        HeroNode temp = head;
        while (temp.next != null) {
            if (temp.next.no == heroNode.no) {
                System.out.println("该英雄已存在!");
                return;
            }
            temp = temp.next;
        }
        temp.next = heroNode;
    }

    //定义一个有序的增加方法
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

    //定义一个删除元素的方法
    public void del(HeroNode heroNode) {
        HeroNode temp = head;
        boolean flag = false;
        if (temp.next == null) {
            System.out.println("链表为空!");
            return;
        }
        while (true) {
            if (temp.next == null) {
                break;
            }
            if (temp.next.no == heroNode.no) {
                flag = true;
                break;
            }
            temp = temp.next;
        }
        if (flag) {
            temp.next = temp.next.next;
        } else {
            System.out.printf("{%d\t%s\t%s}不存在", heroNode.no, heroNode.name, heroNode.nickname);
        }
    }

    //定义一个更改元素的方法
    public void set(HeroNode heroNode) {
        HeroNode temp = head;
        boolean flag = false;
        if (temp.next == null) {
            System.out.println("链表为空!");
        }
        while(true){
            if(temp.next == null){
                break;
            }
            if(temp.next.no == heroNode.no){
                flag = true;
                break;
            }
            temp = temp.next;
        }
        if(flag){
            temp.next.name = heroNode.name;
            temp.next.nickname = heroNode.nickname;
        }
    }

    //遍历打印
    public void show(){
        HeroNode temp = head;
        if(temp.next == null){
            System.out.println("链表为空!");
        }
        while (temp.next != null){
            System.out.println(temp.next);
            temp = temp.next;
        }
    }
}

