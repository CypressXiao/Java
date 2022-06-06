package JosephuProblem;

public class CircleLinkedListDemo {
    public static void main(String[] args) {
        CircleLinkedList list = new CircleLinkedList();
        list.add(25);
        list.show();
        list.solve(5,2,25);
    }
}

class CircleLinkedList{
    Boy first = new Boy();

    //创建一个约瑟夫问题的方法
    public void solve(int startNo,int countNum,int nums){
        //startNo 从第几个小孩开始数数;countNum 每次数几个;Nums 小孩总数
        if(first == null ||startNo <1 ||startNo > nums){
            System.out.println("参数输入有误请重新输入!");
            return;
        }
        Boy helper = first;//定义一个辅助指针并让其在first前一位
        while(helper.getNext() != first){
            helper = helper.getNext();
        }
        //让头指针和辅助指针挪到合适位置,环形指针,头就可以移动了
        for (int i = 1; i <=startNo-1 ; i++) {
            first = first.getNext();
            helper = helper.getNext();
        }
        int count = 0;
        while (true){
            if(helper == first){
                System.out.printf("最后一个取出的小孩编号为:%d",first.getNo());
                break;
            }
            for (int i = 1; i <=countNum-1 ; i++) {
                first = first.getNext();
                helper = helper.getNext();
            }
            count++;
            System.out.printf("第%d取出的小孩的编号为%d",count,first.getNo());
            System.out.println();
            first = first.getNext();
            helper.setNext(first);
        }


    }

    //创建一个人数为nums的环形链表
    public void add(int nums){
        first = null;
        if(nums<2){
            System.out.println("组成环形的人数过少!");
            return;
        }
        Boy temp = null;
        for (int i = 1; i <= nums; i++) {
            Boy boy = new Boy(i);
            if(i==1){
                first = boy;
                first.setNext(first);
                temp = first;
            }else{
                temp.setNext(boy);
                boy.setNext(first);
                temp = boy;
            }
        }
    }

    //遍历环形链表
    public void show(){
        if(first == null){
            System.out.println("环形中没有男孩!");
            return;
        }
        Boy temp = first;
        while (true) {
            System.out.printf("编号为%d的男孩已添加!", temp.getNo());//必须要放在判断条件上边,不然就会少打印一次!!!!
            System.out.println();
            if(temp.getNext() == first){
                break;
            }
            temp = temp.getNext();
        }
    }


}




class Boy{
    private int no;
    private Boy next;

    public Boy() {
    }

    public Boy(int no) {
        this.no = no;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public Boy getNext() {
        return next;
    }

    public void setNext(Boy next) {
        this.next = next;
    }
}