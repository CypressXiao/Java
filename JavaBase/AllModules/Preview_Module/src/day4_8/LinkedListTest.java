package day4_8;

public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);

        list.addListNode(node1);
        list.addListNode(node2);
        list.addListNode(node3);

        list.showAllListNode(new ListNode(0));


    }

    public ListNode deleteDuplicates(ListNode head) {
        if(head.next == null ) return head;
        else{
            ListNode temp = head.next;
            while(temp != null){
                if(temp.val == temp.next.val){
                    temp.next = temp.next.next;
                }
                temp = temp.next;
            }
            return head;
        }
    }
}