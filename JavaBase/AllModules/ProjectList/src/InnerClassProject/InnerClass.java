package InnerClassProject;

import java.util.ArrayList;

/**
 * 公司类
 * ​	属性
 * ​		总资产属性
 * ​		所有员工属性
 * ​	方法
 *
 * ​		发工资方法：从总资产中减去所有员工支出。
 * 员工：
 * ​	属性
 * ​		姓名
 * ​		工号
 * ​		存款
 * ​		工资
 * 经理、厨师、服务员均为员工子类。经理在员工基础上添加奖金属性。发完工资后，请查看所有员工的存款情况.
 * 公司类加入调整员工工资方法：
 * 返回值为void
 * 参数为：被调整工资的员工与调整金额(涨工资为正数、降工资为负数)。
 * ​		方法体逻辑为，在员工工资的基础上调整相应的金额
 * 在上边需求基础上，添加评选幸运员工(随机抽取一名员工并返回)。
 */
public class InnerClass {
    public static void main(String[] args) {
        double asset = 1000000;
        ArrayList<Worker> list = new ArrayList<>();
        Manager manager = new Manager("经理",101,300000,15000,5000);
        Cook cook = new Cook("厨师",178,100000,10000);
        Waiter waiter = new Waiter("服务员",310,50000,6000);

        list.add(manager);
        list.add(cook);
        list.add(waiter);

        Company com = new Company(asset,list);

        //得到公司当前总资产
        System.out.println("总资产为:"+com.getAsset());

        com.show();
        System.out.println("--------------------------------------------------------------");

        //发工资后情况
        com.payOff();
        System.out.println("总资产为:"+com.getAsset());
        com.show();
        System.out.println("---------------------------------------------------------------");

        //调整员工薪水后的情况
        com.changeSalary("经理",-1000);
        com.show();
        System.out.println("----------------------------------------------------------------");

        //选择优秀员工
        com.luckyWorker();
    }
}


