package Note.Strings;

public class RegexTest01 {
    public static void main(String[] args) {
        String string="goodabs";
        String string2= "go*dabs";
        boolean flag= string.matches(string2);
        System.out.println(flag);
    }
}
