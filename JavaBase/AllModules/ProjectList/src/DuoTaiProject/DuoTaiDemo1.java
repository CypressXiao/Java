package src.DuoTaiProject;

/**
 * 定义笔记本类，具备开机，关机和使用USB设备的功能。具体是什么USB设备，笔记本并不关心，只要符合USB规格的设备都可以。
 * 鼠标和键盘要想能在电脑上使用，那么鼠标和键盘也必须遵守USB规范，不然鼠标和键盘的生产出来无法使用;
 * 进行描述笔记本类，实现笔记本使用USB鼠标、USB键盘
 * - USB接口，包含开启功能、关闭功能
 * - 笔记本类，包含运行功能、关机功能、使用USB设备功能
 * - 鼠标类，要符合USB接口
 * - 键盘类，要符合USB接口
 * <p>
 * 阶段一：
 * 使用笔记本，笔记本有运行功能，需要笔记本对象来运行这个功能
 * 阶段二：
 * ​		想使用一个鼠标，又有一个功能使用鼠标，并多了一个鼠标对象。
 * 阶段三：
 * ​		还想使用一个键盘 ，又要多一个功能和一个对象
 * ​	问题：每多一个功能就需要在笔记本对象中定义一个方法，不爽，程序扩展性极差。
 * ​	降低鼠标、键盘等外围设备和笔记本电脑的耦合性。
 */

public class DuoTaiDemo1 {
    public static void main(String[] args) {
    Notebook notebook = new Notebook();
    notebook.useUSB(new Mouse());


    }
}

interface USB{
    void open();
    void close();
}


class Mouse implements USB{

    @Override
    public void open() {
        System.out.println("鼠标开启!");
    }

    @Override
    public void close() {
        System.out.println("鼠标关闭!");
    }
}

class KeyBoard implements USB{

    @Override
    public void open() {
        System.out.println("键盘开启!");
    }

    @Override
    public void close() {
        System.out.println("键盘关闭!");
    }
}

class Notebook {
    public void operate(){
        System.out.println("电脑开机!");
    }

    public void shutdown(){
        System.out.println("电脑关机!");
    }

    public void useUSB(USB usb){
        usb.open();
        usb.close();
    }
}

