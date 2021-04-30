package Note.IO.IOStream;

import java.io.*;

public class FileReaderTest {
    public static void main(String[] args) {
        File file = new File("D:/Test/test.txt");
        try {
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String str;
            while((str=br.readLine())!=null){
                System.out.println(str);
            }
            br.close();
        }catch (FileNotFoundException e){
            System.out.println("文件不存在");
        }catch (IOException e){
            System.out.println("文件读取错误");
        }
    }
}
