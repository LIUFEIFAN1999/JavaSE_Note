package Note.IO.Serializable;

import java.io.*;

public class ObjectOutputTest {
    public static void main(String[] args) {
        Student s1 = new Student("tom", 20);
        Student s2 = new Student("杰瑞", 23);
        try {
            FileOutputStream fos = new FileOutputStream("D:/Test/1.dat");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            long startTime = System.currentTimeMillis();//开始时间
            oos.writeObject(s1);
            oos.writeObject(s2);
            oos.close();
            long endTime = System.currentTimeMillis();//结束时间
            System.out.println("总用时："+ (endTime-startTime)+" ms");
        } catch (IOException e) {
            System.out.println("操作错误");
        }
    }
}
