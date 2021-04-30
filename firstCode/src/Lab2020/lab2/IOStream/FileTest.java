package Lab2020.lab2.IOStream;

import java.io.*;

public class FileTest {
    public static void main(String[] args) {
        File d = new File("D:/sr");
        //挑选txt文件
        String pattern = ".*\\.txt";
        //将所有txt文件保存在数组中
        File[] files = d.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                if(name.matches(pattern))
                    return true;
                else
                    return false;
            }
        });
        //进行文件操作
        try{
            for (File file: files) {
                // 创建目标文件
                // 目标文件名与源文件名相同
                String targetFilePath = "D:/tmp/"+file.getName();
                File targetFile = new File(targetFilePath);
                targetFile.mkdir();
                // 创建输入输出流
                Reader reader = new FileReader(file);
                Writer writer = new FileWriter(targetFile);
                BufferedReader br = new BufferedReader(reader);
                BufferedWriter bw = new BufferedWriter(writer);
                String s;
                while ((s = br.readLine()) != null) {
                    writer.write(s);
                }
                br.close();
                bw.close();
            }
        }catch (IOException e){
                    System.out.println("文件操作异常");
        }
    }
}
