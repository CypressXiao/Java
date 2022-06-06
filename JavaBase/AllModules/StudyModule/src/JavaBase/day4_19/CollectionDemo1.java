package JavaBase.day4_19;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionDemo1 {
    public static void main(String[] args) {
        Collection<String> cl = new ArrayList<>();
        cl.add("Cypress");
        cl.add("Cypress1");
        cl.add("Cypress2");
        cl.add("Cypress3");
        //转成数组打印
        Object[] obj = cl.toArray();
        for (Object o : obj) {
            System.out.println(o);
        }
        System.out.println("---------------------------------");
        //迭代器打印
        Iterator<String> it = cl.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        //增强for
        System.out.println("---------------------------------");
        for (String s : cl) {
            System.out.println(s);
        }
    }
}
