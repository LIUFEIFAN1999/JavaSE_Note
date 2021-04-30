package Note.Exception.Finally;

public class test {
    public static int app() {
        int t = 1;
        try {
            throw new RuntimeException();
        } catch (Exception e) {
            e.printStackTrace();
            return t;
        } finally {
            System.out.println(t +" finally执行");
            ++t;
            System.out.println(t +" finally执行");
        }
    }
    public static void main(String[] args) {
        System.out.println(app());
    }
}
