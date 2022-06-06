package day4_26;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class DynamicProxyDemo1 {
    public static void main(String[] args) {
        Demo3 d3 = new Demo3();
        final Object o1 = Proxy.newProxyInstance(DynamicProxyDemo1.class.getClassLoader(), new Class[]{B.class}, new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("增强开始!");
                Object o = method.invoke(d3, args);
                System.out.println("增强结束!");
                return o;
            }
        });
        B b =(B)o1;
        b.show();
        System.out.println("---------------------------");
        b.test(1,2,3,4,5);
    }
}

interface B {
    void show();

    void test(int... a);
}

class Demo3 implements B {

    @Override
    public void show() {
        System.out.println("杜兰特垃圾!");
    }

    @Override
    public void test(int... a) {
        int sum = 0;
        for (int i : a) {
            sum += i;
        }
        System.out.println(sum);
    }
}