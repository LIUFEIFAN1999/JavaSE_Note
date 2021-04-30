package Note.IO.File;

import java.io.File;
import java.io.IOException;

public class Test {
    public static void main(String[] args) {
        /**
         * 磁盘分区情况
         */
        File[] disks=File.listRoots();
        System.out.println("磁盘分区情况：");
        for(File disk : disks){
            System.out.println(disk.getAbsolutePath()+"盘\t总空间："
                    +disk.getTotalSpace()/1024/1024/1024+"G\t剩余空间"
                    +disk.getFreeSpace()/1024/1024/1024+"G");
        }
        /**
         * 目录、文件属性
         */
        File file = new File("D:/Java");
        System.out.println("canRead:\t\t\t"+file.canRead());
        System.out.println("canWrite:\t\t\t"+file.canWrite());
        System.out.println("Path:\t\t\t"+file.getAbsolutePath());
        System.out.println("length:\t\t\t"+file.length());
        System.out.println("Files:");
        File[] files = file.listFiles();
        for(File f : files) {
            System.out.println(f.getAbsolutePath());
        }
        System.out.println("isDirectory:\t"+file.isDirectory());
        System.out.println("isFile:\t\t\t"+file.isFile());
        System.out.println("FileName:\t\t"+file.getName());
        /**
         * 文件、目录创建
         * 若文件或者目录不存在，则创建新文件或者目录，返回true
         * 若文件或目录已存在，返回false
         */
        File file2 = new File("D:/Test");
        System.out.println(file2.mkdir());//创建目录
        File file3 = new File("D:/Test/test.txt");
        try {
            System.out.println(file3.createNewFile());//创建文件
        }catch (IOException e){
            e.printStackTrace();
        }
        File file5 = new File("D:/Test/TestSub1/TestSub2/TestSub3");
        System.out.println(file5.mkdirs());//创建目录以及不存在的父目录，只要创建目录数>0返回true
    }
}
