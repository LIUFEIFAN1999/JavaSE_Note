package Note.IO.IOStream;

import java.io.*;

public class BufferedInputTest {
    public static void main(String[] args) {
        File file = new File("D:/Test/test.txt");
        try {
            FileInputStream fis = new FileInputStream(file);
            BufferedInputStream bis = new BufferedInputStream(fis);
            long startTime = System.currentTimeMillis();//开始时间
            int i;
            while((i=bis.read())!=-1){
                //System.out.println(i);//输出对应的ASCII码
            }
            long endTime = System.currentTimeMillis();//结束时间
            System.out.println("总用时："+ (endTime-startTime)+" ms");
            bis.close();
        }catch (FileNotFoundException e){
            System.out.println("文件不存在");
        }catch (IOException e){
            System.out.println("文件读取错误");
        }
    }
}
