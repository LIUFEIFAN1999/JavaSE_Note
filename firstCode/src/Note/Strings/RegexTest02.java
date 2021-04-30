package Note.Strings;

public class RegexTest02 {
    public static void main(String[] args) {
        String s = ".*(\\.)txt";
        String s1 = "asxx.txt";
        System.out.println(s1.matches(s));
    }
}
