package JavaBase.day4_7;

public class ObjectOrientedDemo2 {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.setName("Cypress");
        p1.setAge(100);
        p1.setGender("男");

        System.out.println(p1.getName());
        System.out.println(p1.getAge());
        System.out.println(p1.getGender());
    }
}

class Person {

    private String name;
    private int age;
    private String gender;

    public void setName(String name) {
        if (!name.equals("二狗子") && !name.equals("傻逼")) {
            this.name = name;
        } else {
            System.out.println("名字输入不合法");
        }
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        if (age >= 20 && age <= 120) {
            this.age = age;
        } else {
            System.out.println("年龄输入有误");
        }
    }

    public int getAge() {
        return age;
    }

    public void setGender(String gender) {
        if ("男".equals(gender) || "女".equals(gender)) {
            this.gender = gender;
        } else {
            System.out.println("是个人妖吧");
        }
    }

    public String getGender() {
        return gender;
    }
}
