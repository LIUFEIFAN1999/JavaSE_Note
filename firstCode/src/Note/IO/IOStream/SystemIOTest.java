package Note.IO.IOStream;

import java.util.Scanner;

public class SystemIOTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str="start";
        /**
         * 下面的字符串的比较不能用==或！=，因为input.next返回的String
         * 并不是字面常量，并非来自常量池，而是new String()得来
         */
        while(!str.equals("OVER")){
            str = input.next();
            System.out.println(str);
        }
        input.close();
    }
}
