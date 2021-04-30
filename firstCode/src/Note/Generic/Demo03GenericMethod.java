package Note.Generic;

public class Demo03GenericMethod {
    public static void main(String[] args) {
        GenericMethod gm = new GenericMethod();
        gm.method01("hello");
        gm.method01(1);
        gm.method01('a');
    }
}
