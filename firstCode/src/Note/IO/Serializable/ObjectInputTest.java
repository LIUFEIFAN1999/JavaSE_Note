package Note.IO.Serializable;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ObjectInputTest {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("D:/Test/1.dat");
            ObjectInputStream ois = new ObjectInputStream(fis);
            Student stu1 = (Student) ois.readObject();
            Student stu2 = (Student) ois.readObject();
            ois.close();

            System.out.println(stu1.toString());
            System.out.println(stu2.toString());
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("操作错误！");

        }

    }
}
