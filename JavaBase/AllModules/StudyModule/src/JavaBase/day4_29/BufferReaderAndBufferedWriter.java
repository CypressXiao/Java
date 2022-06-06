package JavaBase.day4_29;


import java.io.*;

public class BufferReaderAndBufferedWriter {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("D:\\课程文件\\day21\\day21-代码和文档\\代码\\day21\\笔记.txt"));
            BufferedWriter bw = new BufferedWriter(new FileWriter("D:/copy.txt"));
            String line;
            while((line = br.readLine())!=null){
                bw.write(line);
                bw.newLine();
                bw.flush();
            }
            bw.close();
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
