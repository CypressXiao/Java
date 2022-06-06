package JavaBase.day4_18;

public class ObjectOrientedPractice1 {
    public static void main(String[] args) {
        MyTime time = new MyTime(3,34,54);
        time.addHour(3);
        time.addMinute(10);
        time.addSecond(5);
        time.show();

        time.subSecond(10);
        time.subMinute(20);
        time.subHour(1);
        time.show();
    }
}

class MyTime{
    private int hour;
    private int minute;
    private int second;

    public MyTime() {
    }

    public MyTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public void show(){
        System.out.println("当前时间为:"+hour+":"+minute+":"+":"+second);
    }

    public void addSecond(int sec){
        second += sec;
    }

    public void addMinute(int minute){
        this.minute = this.minute + minute;
    }

    public void addHour(int hour){
        this.hour = this.hour +hour;//这种格式之前不熟悉
    }

    public void subSecond(int sec){
        this.second = this.second -sec;
    }

    public void subMinute(int minute){
        this.minute = this.minute -minute;
    }

    public void subHour(int hour){
        this.hour = this.hour -hour;
    }

}
