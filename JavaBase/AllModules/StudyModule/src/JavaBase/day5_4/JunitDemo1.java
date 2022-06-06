package JavaBase.day5_4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @ClassName JunitDemo1
 * @Description TODO
 * @Author 肖榆柏
 * @Date 2022/5/4 11:07
 * @Version 1.0
 */

public class JunitDemo1 {
    public static void main(String[] args) {

    }
    private String name;

    @Before
    public void show(){
        System.out.println("show");
    }

    @Before
    public void set(){
        name ="乔丹";
    }

    @Test
    public void get(){
        System.out.println(this.name);
    }

    @After
    public void after(){
        System.out.println("我是After方法!");
    }
}
