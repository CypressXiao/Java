package JavaBase.day4_15;



import java.util.ArrayList;

public class StarsStastics {
    public static void main(String[] args) {
        ArrayList<Star> list = new ArrayList<>();
        String str1 = "成龙,3000;李连杰,5000;李冰冰,2000;成龙,20000;李连杰,30000";
        String[] str2 = str1.split(";");
        boolean flag = true;
        for (String s : str2) {
            String[] str3 = s.split(",");
            Star star = new Star(str3[0],Integer.parseInt(str3[1]),1);
            for (Star s1 : list) {
                if(s1.name.equals(str3[0])){
                    s1.donate += Integer.parseInt(str3[1]);
                    s1.count++;
                    flag = false;
                    break;
                }
            }
            if(flag){
                list.add(star);
            }
        }
        System.out.println(list);
    }
}

class Star{
    String name;
    int donate;
    int count;

    public Star(String name, int donate, int count) {
        this.name = name;
        this.donate = donate;
        this.count = count;
    }

    @Override
    public String toString() {
        return "Star{" +
                "姓名:" + name +
                ", 捐款金额:" + donate +
                ", 捐款次数:" + count +
                '}';
    }
}
