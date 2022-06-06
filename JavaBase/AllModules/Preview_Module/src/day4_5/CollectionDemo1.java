package day4_5;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class CollectionDemo1 {
    public static void main(String[] args) {
        Collection<java.io.Serializable> c1 = new ArrayList<java.io.Serializable>();
        c1.add("小明");
        c1.add(24);
        c1.add('男');
        System.out.println(c1);

        Collection<java.io.Serializable> c2 =new HashSet<java.io.Serializable>();
        c2.add("小红");
        c2.add(25);
        c2.add('女');
        System.out.println(c2);

        c1.addAll(c2);
        System.out.println(c1);

        System.out.println(c1.contains(c2));

        c1.retainAll(c2);
        System.out.println(c1);

        Object[]  arr = c1.toArray();
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        Iterator it = c1.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
