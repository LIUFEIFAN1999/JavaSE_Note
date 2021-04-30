package Note.Extends.Override;

import java.io.IOException;

public class test {
    public static void testSay(Father father) throws IOException{
        father.say();
    }
    public static void main(String[] args) {
        Father father = new Son();
        //father = new Daughter();
        try {
            testSay(father);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
