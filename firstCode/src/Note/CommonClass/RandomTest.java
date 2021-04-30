package Note.CommonClass;

import java.util.Random;

public class RandomTest {
    public static void main(String[] args) {
        Random random = new Random();
        int num = random.nextInt(10);
        System.out.println("随机数："+num);
    }
}
