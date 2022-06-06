package JavaBase.day4_15;

import java.util.Arrays;

/**
 * 已经数组长度为10 存储5个元素 其余元素为null值
 * 在指定索引为2的位置处添加一个元素"杨幂" 其余元素依次后移
 */
public class ArrayCopy {
    public static void main(String[] args) {
    String[] str ={"Cypress","Jordan","James","Kobe","Wade",null,null,null,null,null};
    int index =2;
    int moveNum1 =5-index;
    if(moveNum1>0){
        System.arraycopy(str,index,str,index+1,moveNum1);
    }
        System.out.println(Arrays.toString(str));
        str[2] = "Denkeng";
        System.out.println(Arrays.toString(str));

    }
}
