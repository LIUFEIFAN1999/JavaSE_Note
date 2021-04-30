package Note.Strings;

public class EqualsTest {
    public static void main(String[] args) {
        String string1 = "ABC";
        String string2 = "ABC";
        String string3 = new String("ABC");
        String string4 = new String("ABC");
        System.out.println(string1==string2);
        System.out.println(string2==string3);
        System.out.println(string3==string4);
    }
}
