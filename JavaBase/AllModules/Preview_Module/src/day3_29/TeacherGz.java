package day3_29;

public class TeacherGz {
    private String name;
    private int age;
    //set和get方法的使用
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age =age;
    }
    //用构造方法进行初始化
    public TeacherGz(String name,int age){
        this.name =name;
        this.age = age;
    }
    //如果不写上面的构造方法,默认生成如下形式的构造方法
    public TeacherGz(){};
    public void Show(){
        System.out.println("姓名:"+name+",年龄:"+age);
    }
}
