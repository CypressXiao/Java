package JavaBase.day4_29;


import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ClassTestDemo2 {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        try (
                BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Cypress_Xiao\\Desktop\\in.txt"));
                BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\Cypress_Xiao\\Desktop\\out.txt"))
        ) {
            String s;
            while ((s = br.readLine()) != null) {
                String[] s1 = s.split("\\.");
                map.put(Integer.parseInt(s1[0]), s1[1]);
            }
            Set<Map.Entry<Integer,String>> set = map.entrySet();
            for (Map.Entry<Integer, String> entry : set) {
                bw.write(entry.getKey()+"."+entry.getValue());
                bw.newLine();
            }
            /*for (int i = 1; i <= map.size(); i++) {
                bw.write(i+"."+map.get(i));
                bw.newLine();
            }*/
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
