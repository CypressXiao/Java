package JavaBase.day4_19;

import java.util.ArrayList;

public class StackDemo {
    public static void main(String[] args) {
        MyStack ms = new MyStack();
        ms.push("Cypress");
        ms.push("cheer");
        ms.push("up");
        ms.push("!");
        ms.show();
        while(ms.size()>0){
            ms.pop();
        }
    }
}

class MyStack{
    private ArrayList<String> list = new ArrayList<>();;

    public MyStack() {

    }

    public MyStack(ArrayList<String> list) {
        this.list = list;
    }

    public void push(String s){
        list.add(0,s);
    }

    public void pop(){
        System.out.println(list.remove(0));
    }

    public int size(){
        return list.size();
    }

    public void show(){
        for (int i = 0; i < list.size(); i++) {
            if(i==0){
                System.out.print("["+list.get(i)+",");
            }else if(i==list.size()-1){
                System.out.print(list.get(i)+"]");
            }else{
                System.out.print(list.get(i)+",");
            }
        }
        System.out.println();
    }
}
