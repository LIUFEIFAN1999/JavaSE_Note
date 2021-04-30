package Note.Strings;

public class AppendableTest {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("abc");
        stringBuilder.append(65);
        System.out.println(stringBuilder);
    }
}
