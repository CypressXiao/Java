package day4_18;

public class MyExceptionDemo {
    public static void main(String[] args) {
        Person p1 = new Person();
        try {
            p1.setAge(1000);
        } catch (MyException e) {
            e.printStackTrace();
        }

    }
}


class MyException extends Exception{ //编译时异常必须处理,运行时异常可以不处理
    public MyException(){}
    public MyException(String s){
        super(s);
    }
}

class Person{
    int age;

    public void setAge(int age) throws MyException {
        if (age>=1 && age<=260) {
            this.age = age;
        }else{
            throw new MyException("年龄有问题!!!!");
        }
    }
}