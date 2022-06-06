package HashTable;

import java.util.Scanner;

/**
 * @ClassName HashTable.HashTab
 * @Description 哈希表, 通过存储员工信息的案例来深入理解
 * @Author 肖榆柏
 * @Date 2022/5/14 21:39
 * @Version 1.0
 */

public class HashTabDemo {
    public static void main(String[] args) {
        String key = "";
        final Scanner sc = new Scanner(System.in);
        final HashTab ht = new HashTab(8);
        while (true) {
            Emp emp = new Emp();
            System.out.println("请输入操作选项:");
            System.out.println("add: 添加员工");
            System.out.println("list:遍历员工");
            System.out.println("find:查找员工");
            System.out.println("del: 删除员工");
            System.out.println("exit:退出");
            key = sc.next();
            switch (key) {
                case "add":
                    System.out.println("请输入员工id:");
                    emp.id = sc.nextInt();
                    System.out.println("请输入员工名字:");
                    emp.name = sc.next();
                    ht.add(emp);
                    break;
                case "list":
                    ht.list();
                    break;
                case "find":
                    System.out.println("请输入员工id:");
                    emp.id = sc.nextInt();
                    System.out.println("请输入员工名字:");
                    emp.name = sc.next();
                    ht.find(emp);
                    break;
                case "del":
                    System.out.println("请输入员工id:");
                    emp.id = sc.nextInt();
                    ht.del(emp.id);
                    break;
                case "exit":
                    sc.close();
                    System.exit(0);
            }
        }
    }
}

class HashTab {
    int size;
    private LinkedList[] linkedListArray;

    public HashTab(int size) {
        this.size = size;
        linkedListArray = new LinkedList[size];
        for (int i = 0; i < size; i++) {
            linkedListArray[i] = new LinkedList();
        }
    }

    //添加员工的方法
    public void add(Emp emp) {
        //确定在第几个链表
        int num = emp.id % size;
        linkedListArray[num].add(emp);
    }

    //遍历hashTab的方法
    public void list() {
        for (int i = 0; i < linkedListArray.length; i++) {
            linkedListArray[i].list(i);
        }
    }

    //查找员工所在位置的方法
    public void find(Emp emp) {
        int num = emp.id % size;
        final int num1 = linkedListArray[num].find(emp.id);
        if (num1 == -1) {
            System.out.printf("不存在工号为%d,姓名为%s的员工~~\n", emp.id, emp.name);
        } else {
            System.out.printf("该员工在第%d条链表的第%d号位置\n", num, num1);
        }
    }

    //删除员工的方法
    public void del(int id) {
        int num = id % size;
        linkedListArray[num].del(id);
    }
}


class LinkedList {
    Emp head;

    //按id顺序添加员工的方法
    public void add(Emp emp) {
        if (head == null) {
            head = emp;
            return;
        }
        Emp temp = head;
        while (temp.next != null) {
            if (temp.id < emp.id && emp.id < temp.next.id) {
                break;
            }
            temp = temp.next;
        }
        emp.next = temp.next;
        temp.next = emp;
    }

    //遍历员工的方法
    public void list(int i) {
        if (head == null) {
            System.out.println("第" + (i + 1) + "条链表为空~~");
            return;
        }
        System.out.println("第" + (i + 1) + "条链表员工信息如下:\t");
        Emp temp = head;
        while (temp != null) {
            System.out.printf("==> %d %s\t", temp.id, temp.name);
            temp = temp.next;
        }
        System.out.println();
    }

    //根据员工id查找员工的方法
    public int find(int id) {
        if (head == null) {
            return -1;
        }
        int count = 1;
        Emp temp = head;
        while (temp != null) {
            if (temp.id == id) {
                return count;
            }
            temp = temp.next;
            count++;
        }
        return -1;
    }

    //根据员工id删除员工的方法
    public void del(int id) {
        if (head == null) {
            System.out.println("该链表为空~~");
            return;
        }
        if (head.next == null) {
            if (head.id == id) {
                System.out.println("员工号为" + head.id + "的员工:" + head.name + "已删除~");
                head = null;
                return;
            }
        }
        Emp temp = head;
        while (temp.next != null) {
            if (temp.next.id == id) {
                temp.next = temp.next.next;
                System.out.println("员工号为" + temp.next.id + "的员工:" + temp.next.name + "已删除~");
                return;
            }
            temp = temp.next;
        }
    }
}


//员工类为链表的每个节点
class Emp {
    int id;
    String name;
    Emp next;

    public Emp() {
    }

    public Emp(int id, String name) {
        this.id = id;
        this.name = name;
    }
}



