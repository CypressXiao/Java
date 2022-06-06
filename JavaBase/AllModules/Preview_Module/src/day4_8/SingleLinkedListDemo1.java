package day4_8;

public class SingleLinkedListDemo1 {
    public static void main(String[] args) {

    }
}

class SingleLinkedList{
    private HeroNode head = new HeroNode(0,"");
    //头结点是用来方便查找
    //有个方法是用来查找头结点

    public HeroNode getHead(){
        return head;
    }

    //添加节点
    public void addHeroNode(HeroNode heroNode){
        //因为head节点是不能动的,因此我们需要一个辅助节点temp
        HeroNode temp = head;
        //添加数据是从链表的最后添加,如何确定最后的位置,只能节点.next 这样遍历下去,直到值为null就找到位置
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = heroNode;
    }

    //显示链表
    public void show(HeroNode head){
        if(head.next == null ){
            System.out.println("链表为空!");
        }
        //因为头结点是不能动的,所以需要一个辅助变量来遍历
        HeroNode temp = head.next;
        while(true){
            if(temp == null){
                break;
            }
            System.out.println(temp);
            temp =temp.next;
        }
    }

    //修改链表节点数据 1.刘备;2.关羽;3.张飞 用temp.id =heroNode.id 则temp.name =heroNode.name
    public void update(HeroNode heroNode){
        //判断链表是否为空
        if(head.next == null){
            System.out.println("链表为空!");
        }
        //定义一个辅助节点
        HeroNode temp = head.next;
        boolean flag = false;
        while(true){
            if(temp.next == null){
                break;
            }
            if(temp.id == heroNode.id){
                flag = true;
                break;
            }
            temp = temp.next;
        }
        if(flag){
            temp.name = heroNode.name;
        }else{
            System.out.println("没有找到重复的");
        }
    }
}

class HeroNode{
    public int id;
    public String name;
    public HeroNode next;//用来指向下个节点

    public HeroNode(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "HeroNode{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", next=" + next +
                '}';
    }
}