package JavaBase.day4_13;

public class StringBuilderDemo1 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("12345678");
        System.out.println(sb.capacity());
        /*sb.delete(0,4);//包左不包右
        System.out.println(sb);*/
        /*sb.deleteCharAt(3);
        System.out.println(sb);*/
        sb.setCharAt(1,'9');
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
    }
}
