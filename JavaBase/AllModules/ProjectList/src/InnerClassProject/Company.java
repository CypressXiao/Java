package InnerClassProject;

import java.util.ArrayList;
import java.util.Random;

public class Company {
    static double asset;
    static ArrayList<Worker> list;

    public Company(double asset, ArrayList<Worker> list) {
        Company.asset = asset;
        Company.list = list;
    }

    public double getAsset() {
        return asset;
    }

    public void setAsset(double asset) {
        Company.asset = asset;
    }

    public void payOff(){
        for (Worker worker : list) {
            if (worker instanceof Manager) {
                worker.salary += ((Manager) worker).bonus;
            }
            /*if("经理".equals(list.get(i).name)){
                list.get(i).salary += ((Manager) list.get(i)).bonus;
            }*/
            worker.deposit += worker.salary;
            asset -= worker.salary;
        }
        System.out.println("发放工资后公司的总资产为:"+asset);
    }

    public void changeSalary(String name,double changeSalary){
        for (Worker worker : list) {
            if(name.equals(worker.name)){
                worker.salary += changeSalary;
                System.out.println("调整后的工资为:"+worker.salary);
                break;
            }
        }
    }

    public void luckyWorker(){
        Random ran =new Random();
        int ran1 = ran.nextInt(list.size());
        for (int i = 0; i < list.size(); i++) {
            if(i == ran1){
                System.out.println("幸运员工是:"+list.get(i).name);
            }
        }
    }

    public void show(){
        for (Worker worker : list) {
            System.out.println(worker);
        }
    }
}
