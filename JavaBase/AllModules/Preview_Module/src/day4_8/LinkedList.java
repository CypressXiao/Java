package day4_8;

public class LinkedList {
    //链表的增删改查
       ListNode head = new ListNode(0);
    /**
     * 1.末尾添加节点
     */
    public void addListNode(ListNode listNode) {
        ListNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = listNode;
    }

    /**
     * 2.遍历
     */
    public void showAllListNode(ListNode head) {
        ListNode temp = head.next;
        if (temp == null) {
            System.out.println("链表为空!");
        } else {
            while (temp != null) {
                System.out.println(temp);
                temp = temp.next;
            }
        }
    }


    /**
     * 3.在指定节点位置后添加新节点
     */
    public void addListNode(ListNode listNode, int a) {
        ListNode temp = head;
        if (temp.next == null) {
            System.out.println("链表为空!");
        } else {
            while (temp.next != null) {
                if (temp.next.val == a) {
                    listNode.next = temp.next.next;
                    temp.next.next = listNode;
                    break;
                }
                temp = temp.next;
            }
        }
    }

    /**
     * 4.修改指定位置的值
     */
    public void updateListNode(ListNode listNode, int a) {
        ListNode temp = head;
        if (temp.next == null) {
            System.out.println("链表为空!");
        } else {
            while (temp.next != null) {
                if (temp.next.val == a) {
                    temp.next.val = listNode.val;
                    break;
                }
                temp = temp.next;
            }
        }
    }

    /**
     * 5.删除某个节点值(all)
     */
    public void delListNode(ListNode listNode){
        ListNode temp = head;
        if(temp.next == null){
            System.out.println("链表为空!");
        }else{
            while(temp.next != null){
                if(temp.next.val == listNode.val){
                    temp.next = temp.next.next;
                }else {
                    temp = temp.next;
                }
            }
        }
    }

}

class ListNode {
    public int val;
    public ListNode next;



    public ListNode() {

    }

    public ListNode(int val) {
        super();
        this.val = val;
    }

    @Override
    public String toString() {
        return "ListNode{" +
                "val=" + val +
                ", next=" + next +
                '}';
    }
}
