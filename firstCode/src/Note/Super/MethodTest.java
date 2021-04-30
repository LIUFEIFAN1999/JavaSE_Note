package Note.Super;

public class MethodTest {
    public static void main(String[] args) {
        Father father = new Father("Dad");
        Son son = new Son();
        father.fatherMethod();
        son.sonMethod();
    }
}
