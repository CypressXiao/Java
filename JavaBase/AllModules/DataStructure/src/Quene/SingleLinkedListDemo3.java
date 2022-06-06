package Quene;
public class SingleLinkedListDemo3 {
    public static void main(String[] args) {
        SingleLinkedList list1 = new SingleLinkedList();
        SingleLinkedList list2 = new SingleLinkedList();

        HeroNode hero1 = new HeroNode(1, "宋江", "及时雨");
        HeroNode hero2 = new HeroNode(2, "卢俊义", "玉麒麟");
        HeroNode hero3 = new HeroNode(3, "吴用", "智多星");
        HeroNode hero4 = new HeroNode(4, "林冲", "豹子头");
        HeroNode hero5 = new HeroNode(5, "武松", "行者");
        HeroNode hero6 = new HeroNode(6, "李逵", "黑旋风");
        HeroNode hero7 = new HeroNode(7, "鲁智深", "花和尚");
        HeroNode hero8 = new HeroNode(8, "华荣", "小李广");

        list1.add(hero1);
        list1.add(hero3);
        list1.add(hero5);
        list1.add(hero7);
        list2.add(hero2);
        list2.add(hero4);
        list2.add(hero6);
        list2.add(hero8);

        /*list1.show();
        list2.show();*/

        mergeLinkedList(list1.getHead(),list2.getHead());

    }

    //将两个有序链表重新按顺序排成新的链表
    public static void mergeLinkedList(HeroNode head1,HeroNode head2) {
        SingleLinkedList list3 = new SingleLinkedList();
        HeroNode head = list3.getHead();
        HeroNode temp = head;
        HeroNode next = null;
        while(head1.next != null && head2.next != null){
            if(head1.next.no > head2.next.no){
                next = head2.next.next;//取下一个后必须要有另一个去接收
                temp.next = head2.next;
                temp = temp.next;
                head2.next =next;
            }else{
                next = head1.next.next;
                temp.next = head1.next;
                temp = temp.next;
                head1.next =next;
            }
        }
        if(head1.next == null){
            temp.next = head2.next;
        }
        if(head2.next == null){
            temp.next = head1.next;
        }
        list3.show();
    }
}