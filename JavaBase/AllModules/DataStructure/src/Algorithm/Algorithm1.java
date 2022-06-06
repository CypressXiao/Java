package Algorithm;

//给你两个 非空 的链表，表示两个非负的整数。它们每位数字都是按照 逆序 的方式存储的，并且每个节点只能存储 一位 数字。
//请你将两个数相加，并以相同形式返回一个表示和的链表。
public class Algorithm1 {
    public static void main(String[] args) {

    }
    //l1和l2都代表的是链表第一个节点位置
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        //创建一个新的链表的头节点
        ListNode head = new ListNode(0);
        //定义一个临时节点好移动
        ListNode temp = head;
        //定义一个向下一位进值的数
        int value = 0;
        //移动l1和l2节点
        while(l1 != null || l2 != null){
            int x;
            int y;
            //如果l1为空说明其到结尾了,就让其为零,若没到末尾则取原值
            if(l1 == null ){
                x = 0;
            }else{
                x =l1.val;
                l1 =l1.next;
            }
            //如果l2为空说明其到结尾了,就让其为零,若没到末尾则取原值
            if(l2 == null){
                y = 0;
            }else{
                y =l2.val;
                l2 =l2.next;
            }
            //获得当前位数的和
            int sum = x+y+value;
            if(sum>9){
                //更新向下一位进的值
                value = sum/10;
                //若大于9,则进该位的新值为原值取余
                sum %=10;
            }else{
                //否则将value重置为0;
                value = 0;
            }
            //将该位的值赋给新链表对应的节点
            temp.next = new ListNode(sum);//节点只能指向节点
            temp = temp.next;
        }
        //如果l1和l2都为空,判断进值是否为0,不为0则再进1位
        if(value!=0){
            temp.next = new ListNode(value);
        }
        return head.next;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}