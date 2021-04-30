package Lab2020.lab2.IOStream;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileTest {
    public static void main(String[] args) throws IOException {
        File file = new File("D:/Readme.txt");
        RandomAccessFile raf = new RandomAccessFile(file, "rw");
        raf.writeUTF("The FirstLine\n");
        long length = raf.getFilePointer();
        raf.writeUTF("The SecondLine\n");
        raf.seek(length+2);
        System.out.println(raf.readLine());
        raf.seek(raf.length()-1);
        raf.writeUTF("The ThirdLine");
        raf.close();
    }
}
