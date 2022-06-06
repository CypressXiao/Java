package JavaBase.day4_19;

public class CloneConstructorDemo1 {
    /**
     * 最好使用拷贝构造函数或者拷贝工厂来拷贝对象，安全。
     */
    private int[] arr;

    public CloneConstructorDemo1(){
        arr = new int[10];  //this.arr
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
    }

    public CloneConstructorDemo1(CloneConstructorDemo1 original){
        arr = new int[original.arr.length]; //e2.arr = new int[e1.arr.length];
        for (int i = 0; i < original.arr.length; i++) {
            arr[i] = original.arr[i];
        }
    }

    public void setValue(int index, int value) {
        arr[index] = value;
    }

    public int getValue(int index) {
        return arr[index];
    }

    public static void main(String[] args) {
        CloneConstructorDemo1 e1 = new CloneConstructorDemo1();
        CloneConstructorDemo1 e2 = new CloneConstructorDemo1(e1);

        e1.setValue(2,11);
        System.out.println(e2.getValue(2));
    }
}
