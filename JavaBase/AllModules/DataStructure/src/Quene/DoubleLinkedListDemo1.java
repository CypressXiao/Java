package Quene;

public class DoubleLinkedListDemo1 {
    public static void main(String[] args) {
        DoubleLinkedList list = new DoubleLinkedList();
        HeroNode1 hero1 = new HeroNode1(1, "宋江", "及时雨");
        HeroNode1 hero2 = new HeroNode1(2, "卢俊义", "玉麒麟");
        HeroNode1 hero3 = new HeroNode1(3, "吴用", "智多星");
        HeroNode1 hero4 = new HeroNode1(4, "林冲", "豹子头");

        list.addByOrder(hero1);
        list.addByOrder(hero4);
        list.addByOrder(hero3);
        list.addByOrder(hero2);
        list.show();

        list.addByOrder(hero1);
        list.addByOrder(hero4);
        list.addByOrder(hero3);
        list.addByOrder(hero2);
        //list.show();
    }
}

class DoubleLinkedList{
    private final HeroNode1 head = new HeroNode1(0,"","");

    public HeroNode1 getHead(){
        return head;
    }

    //双向链表末尾增添
    public void add(HeroNode1 heroNode1){
        HeroNode1 temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = heroNode1;
        heroNode1.pre = temp;
    }

    //双向链表按顺序添加
    public void addByOrder(HeroNode1 heroNode1){
        HeroNode1 temp = head;
        boolean flag = false;
        while(true){
            if(temp.next == null){
                break;
            }
            if(temp.next.no > heroNode1.no){
                break;
            }else if( temp.next.no == heroNode1.no){
                flag = true;
                break;
            }
            temp = temp.next;
        }
        if(flag){
            System.out.printf("编号为%d的英雄%s已被添加!",heroNode1.no,heroNode1.name);
            System.out.println();
        }else if(temp.next == null){
            temp.next = heroNode1;
            heroNode1.pre = temp;
        }else{
            heroNode1.next = temp.next;
            temp.next = heroNode1;
            temp.next.next.pre = heroNode1;
            heroNode1.pre = temp;

        }

    }

    //删除某个元素
    public void del(int no){
        HeroNode1 temp = head.next;
        boolean flag = false;
        if(temp == null){
            System.out.println("该链表为空!");
        }
        while (temp != null){
            if(temp.no == no){
                flag = true;
                break;
            }
            temp = temp.next;
        }
        if(flag){
            temp.pre.next = temp.next;
            if(temp.next != null){
                temp.next.pre = temp.pre;
            }
            System.out.printf("{%d\t%s\t%s}的英雄删除成功!",temp.no,temp.name,temp.nickname);
        }else{
            System.out.printf("编号为%d的英雄不存在",no);
        }
        System.out.println("----------------------------------------------------------------");

    }

    //修改某个元素
    public void set(HeroNode1 heroNode1){
        HeroNode1 temp = head.next;
        boolean flag = false;
        if(temp == null){
            System.out.println("该链表为空!");
        }
        while(true){
            if(temp == null){
                break;
            }
            if(temp.no == heroNode1.no){
                flag = true;
                break;
            }
            if(flag){
                temp.name = heroNode1.name;
                temp.nickname = heroNode1.name;
            }else{
                System.out.printf("编号为%d的英雄不存在",heroNode1.no);
            }
        }
        System.out.println("----------------------------------------------------------------");

    }

    //遍历所有元素
    public void show(){
        HeroNode1 temp = head.next;
        while(temp != null){
            System.out.println(temp);
            temp = temp.next;
        }
        System.out.println("----------------------------------------------------------------");
    }

}







class HeroNode1{
    int no;
    String name;
    String nickname;
    HeroNode1 next;
    HeroNode1 pre;

    public HeroNode1(int no, String name, String nickname) {
        this.no = no;
        this.name = name;
        this.nickname = nickname;
    }

    @Override
    public String toString() {
        return "HeroNode1{" +
                "no=" + no +
                ", name='" + name + '\'' +
                ", nickname='" + nickname + '\'' +
                '}';
    }
}
