package Preview.SingleLinkedList;

public class singleLinkedListPreview {
    public static void main(String[] args) {
        SingleLinkedList list1 = new SingleLinkedList();
        HeroNode hero1 = new HeroNode(1, "宋江", "及时雨");
        HeroNode hero2 = new HeroNode(2, "卢俊义", "玉麒麟");
        HeroNode hero3 = new HeroNode(3, "吴用", "智多星");
        HeroNode hero4 = new HeroNode(4, "林冲", "豹子头");

//        list1.add(hero4);
//        list1.add(hero2);
//        list1.add(hero1);
//        list1.add(hero3);
//        list1.show();
//        System.out.println("---------------------------------------------------------");

        list1.addByOrder(hero4);
        list1.addByOrder(hero2);
        list1.addByOrder(hero1);
        list1.addByOrder(hero3);
        list1.show();
    }
}













