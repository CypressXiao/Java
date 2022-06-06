package JavaBase.day5_4;

/**
 * @ClassName OldTeacher
 * @Description TODO
 * @Author 肖榆柏
 * @Date 2022/5/4 20:34
 * @Version 1.0
 */


public class OldTeacher implements TeacherAction {

    @Override
    public void teach() {
        System.out.println("资深老师教数学~~");
    }
}


class NewTeacher implements TeacherAction {

    @Override
    public void teach() {
        System.out.println("新老师教英语~~");
    }
}

interface TeacherAction {
    void teach();
}

