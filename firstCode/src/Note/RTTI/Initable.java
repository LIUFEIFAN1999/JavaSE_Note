package Note.RTTI;

public class Initable {
    static final  int StaticFinal = 20;
    static int staticUnfinal = 30;
    final int UnstaticFinal = 40;
    static {
        System.out.println("Initable Initializing");
    }
    private Initable(String s) {
        System.out.println("Constructing Initable" + "   " +s);
    }
    public Initable() {
        System.out.println("Constructing Initable");
    }
}
