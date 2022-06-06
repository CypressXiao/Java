package JavaBase.day4_20;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        MyStack ms = new MyStack();
        ms.push("hello");
        ms.push("world");
        ms.push("java");

        System.out.println(ms.strAt("hell"));

        System.out.println(ms.length());

        ms.show();

        ms.pop();
        ms.pop();
        ms.pop();

    }
}

class MyStack{
    private LinkedList<String> ll = new LinkedList<>();

    public MyStack() {
    }

    public MyStack(LinkedList<String> ll) {
        this.ll = ll;
    }

    public void push(String s){
        ll.addFirst(s);
    }

    public int strAt(String str){
        for (int i = 0; i < ll.size(); i++) {
            if(ll.get(i).equals(str)){
                return i;
            }
        }
        return -1;
    }

    public void pop(){
        if(length()>0){
        System.out.println(ll.removeFirst());
        }else{
            System.out.println("栈为空!");
        }

    }

    public int length(){
        return ll.size();
    }

    public void show(){
        System.out.println(ll);
    }

}
