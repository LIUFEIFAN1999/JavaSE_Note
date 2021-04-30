package Lab2020.lab2.IOStream;

import java.io.IOException;
import java.util.Scanner;

public class SkipWhitespaceTest {

    /*
     * 从控制台读取输入字符串（包含空格字符），使用SkipWhitespaceOutputStream
     * 过滤掉空格，并再次输出到控制台中
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextLine()) {
            String str2 = scanner.nextLine();
            //向控制台输出
            try {
                SkipWhitespaceOutputStream output = new SkipWhitespaceOutputStream();
                output.write(str2);
                output.close();
            } catch (IOException e) {
                System.out.println("写入失败");
            }
        }
        scanner.close();
    }
}
