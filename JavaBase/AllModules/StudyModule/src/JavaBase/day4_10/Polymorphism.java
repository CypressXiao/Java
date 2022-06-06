package JavaBase.day4_10;

public class Polymorphism {
    public static void main(String[] args) {
        MyDate md = new MyDate(1996,8,30);
        boolean result = md.isLeapYear();
        if(result){
            System.out.println(md.year+"是闰年!");
        }else{
            System.out.println(md.year+"不是闰年!");
        }
        MyDate updateDate = new MyDate();
        updateDate.puls(md,10,17,100);
    }
}


/*
abstract class Citizen{
    String name;
    MyDate birthday;
    String IDNumb;
}
*/

class MyDate{
    int year;
    int mon;
    int day;

    public MyDate() {
    }

    public MyDate(int year, int mon, int day) {
        this.year = year;
        this.mon = mon;
        this.day = day;
    }

    @Override
    public String toString() {
        return "MyDate{" +
                "year=" + year +
                ", mon=" + mon +
                ", day=" + day +
                '}';
    }

    public boolean isLeapYear(){
        if(year %4 ==0 && year%100 !=0){
            return true;
        }else if(year%400 ==0){
            return true;
        }else{
            return false;
        }
    }

    public void set(int year,int mon,int day){
        this.year = year;
        this.mon =mon;
        this.day =day;
        System.out.println("新的日期为:"+year+"-"+mon+"-"+day);
    }

    public void puls(MyDate md,int years,int months,int days){
        int[] arr;
        int[] arr1 =new int[]{31,28,31,30,31,30,31,31,30,31,30,31};
        int[] arr2 =new int[]{31,29,31,30,31,30,31,31,30,31,30,31};
        if(md.isLeapYear()){
            arr =arr2;
        }else{
            arr =arr1;
        }
        md.mon += months;
        md.year += years;
        md.day += days;
        while (true) {
            if(md.mon>12){
                md.year +=(md.mon/12);
                md.mon %= 12;
                if(md.day>arr[md.mon]){
                    md.mon += 1;
                }
            }else{
                if(md.day>arr[md.mon-1]) {
                    md.mon += 1;
                    md.day -=arr[md.mon-1];
                }else{
                    break;
                }
            }
        }
        System.out.println("新的日期为:"+md.year+"-"+md.mon+"-"+md.day);
        System.out.println(md);

    }

}