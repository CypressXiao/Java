package Quene;

import java.util.Stack;

public class SingleLinkedListDemo2 {
    public static void main(String[] args) {
        SingleLinkedList list1 = new SingleLinkedList();
        HeroNode hero1 = new HeroNode(1, "宋江", "及时雨");
        HeroNode hero2 = new HeroNode(2, "卢俊义", "玉麒麟");
        HeroNode hero3 = new HeroNode(3, "吴用", "智多星");
        HeroNode hero4 = new HeroNode(4, "林冲", "豹子头");

        list1.addByOrder(hero1);
        list1.addByOrder(hero4);
        list1.addByOrder(hero3);
        list1.addByOrder(hero2);
        System.out.println("原链表为~~");
        list1.show();
        System.out.println("------------------------------------------------");

       /* System.out.println(getNode(list1.getHead(),0));
        System.out.println("------------------------------------------------");

        System.out.println(getNode(list1.getHead(),3));*/

        reverseList(list1.getHead());
        System.out.println("翻转后的链表为~~");
        list1.show();
        System.out.println("------------------------------------------------");

        System.out.println("利用栈,逆序打印的结果为~~");
        reversePrint(list1.getHead());
    }

    //返回单链表中倒数第K个节点
    public static HeroNode getNode(HeroNode head,int k){
        int total = SingleLinkedListDemo1.getNumb(head);
        int index = total -k+1;
        int count =0;
        HeroNode temp = head;
        if(temp.next == null){
            return null;
        }
        if(index<=0 || index>total){
            return null;
        }
        while(count != index){
            temp = temp.next;
            count++;
        }
        return temp;
    }

    //翻转链表
    public static void reverseList(HeroNode head){
        if(head.next == null || head.next.next == null){
            return;
        }
        HeroNode reverseHead = new HeroNode(0,"","");
        HeroNode temp = head.next;
        HeroNode next = null;
        while (temp!= null) {
            next = temp.next;//用一个东西把取掉东西的原列表继承一下
            temp.next = reverseHead.next;
            reverseHead.next = temp;
            temp = next;
        }
        head.next = reverseHead.next;
    }

    //利用栈的性质实现逆序打印
    public static void reversePrint(HeroNode head){
        if(head.next == null){
            System.out.println("该链表为空!");
        }
        Stack<HeroNode> stack = new Stack<>();
        HeroNode cur = head.next;
        while(cur !=null){
            stack.push(cur);
            cur = cur.next;
        }
        while(stack.size()>0){
            System.out.println(stack.pop());
        }
    }
}
