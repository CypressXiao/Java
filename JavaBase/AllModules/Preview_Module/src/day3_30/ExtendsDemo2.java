package day3_30;

public class ExtendsDemo2 {
    public static void main(String[] args) {
        Worker w1 =new Worker();
        w1.name ="张三";
        w1.gender = '男';
        w1.age = 34;
        w1.id ="001";

        Worker w2 = new Worker();
        w2.setName("小红");
        w2.setGender('女');
        w2.setAge(25);
        w2.setId("002");

        Worker w3 = new Worker("小明",56,'男',"003");

        Worker[] worker =new Worker[]{w1,w2,w3};
        for(Worker w:worker){
            w.show();
        }

    }
}

class Boss {
    String name;
    int age;
    char gender;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }
}

class Worker extends Boss {
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    String id;
    public void show(){
        System.out.println("姓名:"+name+",性别:"+gender+",年龄:"+age+",工号:"+id);
    }
    public Worker(String name,int age,char gender,String id){
        this.name =name;
        this.age =age;
        this.gender =gender;
        this.id =id;
    }
    public Worker(){

    }
}
