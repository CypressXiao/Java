package JavaBase.day4_19;

import java.util.*;

public class Test1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Cypress");
        list.add("Cypress1");
        list.add("Cypress");
        list.add("Cypress2");
        list.add("Cypress");

        Object[] obj = list.toArray();
        for (int i = 0; i < obj.length; i++) {
            System.out.print(obj[i]+" ");
        }
        System.out.println();

        Iterator<String> it = list.iterator();
        while(it.hasNext()){
            System.out.print(it.next()+" ");
        }
        System.out.println();

        ListIterator<String> lit = list.listIterator(list.size());
        while (lit.hasPrevious()){
            System.out.print(lit.previous()+" ");
        }
        System.out.println();

        for (String s : list) {
            System.out.print(s+" ");
        }
        System.out.println();

        try {
            delete(list,"xiaoyubai");
        } catch (ExistException e) {
            System.err.println(e.getMessage());
        }
    }

    public static void delete(List list,String s) throws ExistException {
        if(!list.contains(s)){
            throw new ExistException(s+"元素不存在!");
        }
        list.remove(s);
    }
}

class ExistException extends Exception{
    public ExistException(String s){
        super(s);
    }
}


