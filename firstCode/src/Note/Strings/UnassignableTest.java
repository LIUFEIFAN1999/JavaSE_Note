package Note.Strings;

public class UnassignableTest {
    public static void main(String[] args) {
        String string;
        string = "hhh";
        System.out.println(string.hashCode());
        string = "hiahiahia";
        System.out.println(string.hashCode());
    }
}
