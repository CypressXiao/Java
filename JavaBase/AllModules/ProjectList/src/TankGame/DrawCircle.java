package TankGame;

import javax.swing.*;
import java.awt.*;

/**
 * 演示如何在面板上画圆
 */
/*public class DrawCircle extends JFrame{
    private MyPanel mp =null;
    public static void main(String[] args) {
        new DrawCircle();
        //定义一个面板

    }

    public DrawCircle(){//构造器
        //初始化面板
        mp = new MyPanel();
        //把面板放入到窗口(画框)
        this.add(mp);
        //设置窗口对的大小
        this.setSize(400,300);
        //当点击窗口的x程序结束
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);//可以显示
    }
}

//1.先定义一个面板的MyPanel类,继承JPanel类,画图形就在面板上写
class MyPanel extends JPanel{

    //1.MyPanel 就是画板
    //2.Graphics g 理解成一支画笔
    //3.Graphics 提供了很多绘图方法
    @Override
    public void paint(Graphics g) {//绘图方法
        super.paint(g);//调用父类的方法完成初始化
        g.drawOval(10,10,100,100);
    }
}*/

public class DrawCircle extends JFrame{
    public static void main(String[] args) {
        new DrawCircle();
    }

    public DrawCircle() {
        MyPanel mp = new MyPanel();
        this.add(mp);
        this.setSize(500,500);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class MyPanel extends JPanel{
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.drawOval(100,100,200,200);
    }
}

