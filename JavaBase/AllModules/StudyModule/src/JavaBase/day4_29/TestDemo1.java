package JavaBase.day4_29;


import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

//统计一个文件"C:\\Users\\Cypress_Xiao\\Desktop\\肖榆柏的总结.docx（见附件）"中字母'A'和'a'出现的总次数
public class TestDemo1 {
    public static void main(String[] args) {
        //创建一个map集合,用来存储所有元素
        HashMap<Character,Integer> map = new HashMap<>();
        //创建一个缓冲字节输入流
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("C:\\Users\\Cypress_Xiao\\Desktop\\pictures\\1.docx")))
        ) {
            int num;
            while((num =br.read())!=-1){
                char ch =(char)num;
                if(!map.containsKey(ch)){
                    map.put(ch,1);
                }else{
                    map.put(ch,map.get(ch)+1);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        Set<Map.Entry<Character,Integer>> set = map.entrySet();
        for (Map.Entry<Character, Integer> entry : set) {
            System.out.println(entry.getKey()+"("+entry.getValue()+")");
        }
    }
}
