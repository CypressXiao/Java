package JavaBase.day4_10;

public class PolymorphismDemo3 {
    public static void main(String[] args) {
        TeacherTeach t = new TeacherTeach();

        t.teacher_teach(new NewTeacher());
        t.teacher_teach(new OldTeacher());
        t.teacher_teach(new SophisticatedTeacher());
    }
}

interface Teacher{
    abstract public void teach();
}

class TeacherTeach{
    public void teacher_teach(Teacher tt){
        tt.teach();
    }
}


class NewTeacher implements Teacher{

    @Override
    public void teach() {
        System.out.println("新老师教语文!");
    }
}


class OldTeacher implements Teacher{

    @Override
    public void teach() {
        System.out.println("老老师教数学!");
    }
}


class SophisticatedTeacher implements Teacher{

    @Override
    public void teach() {
        System.out.println("资深老师教物理!");
    }
}

//单例设计模式


class SimpleDesign1{
    //饿汉式
    private static SimpleDesign1 s = new SimpleDesign1();
    private SimpleDesign1(){

    }
    public static SimpleDesign1 getInstance(){
        return s;
    }
}

class SimpleDesign2{
    //懒汉式
    private static SimpleDesign2 s1;
    private SimpleDesign2(){

    }
    public static SimpleDesign2 getInstance(){
        if(s1 == null){
            s1 = new SimpleDesign2();
        }
        return s1;
    }
}
