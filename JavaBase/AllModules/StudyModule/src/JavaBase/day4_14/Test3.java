package JavaBase.day4_14;


/**
 * 3.设计一个在内存中只能生成一个对象的类(使用两种方式)
 */
public class Test3 {
    //饿汉式
    private static Test3 t = new Test3();
    private Test3() {

    }
    public static Test3 getInstance(){
        return t;
    }

}

class TestDemo{
    private static TestDemo t;
    private TestDemo(){

    }
    public static TestDemo getInstance(){
        if(t == null){
            t = new TestDemo();
        }
        return t;
    }
}

