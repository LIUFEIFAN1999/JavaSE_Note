package Note.IO.IOStream;

import java.io.*;

public class FileOutputTest {
    public static void main(String[] args) {
        File fileRead = new File("D:/Test/test.txt");
        File fileWrite = new File("D:/Test/test1.txt");
        try {
            FileInputStream fis = new FileInputStream(fileRead);
            FileOutputStream fos = new FileOutputStream(fileWrite);//若文件不存在，自动创建
            long startTime = System.currentTimeMillis();//开始时间
            int i;
            while((i=fis.read())!=-1){
                //System.out.println(i);//输出对应的ASCII码
                fos.write(i);
            }
            long endTime = System.currentTimeMillis();//结束时间
            System.out.println("总用时："+ (endTime-startTime)+" ms");
            fis.close();
            fos.close();
        }catch (FileNotFoundException e){
            System.out.println("文件不存在");
        }catch (IOException e){
            System.out.println("文件读取错误");
        }
    }
}
