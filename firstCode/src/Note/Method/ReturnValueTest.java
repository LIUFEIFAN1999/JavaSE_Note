package Note.Method;

public class ReturnValueTest {
    public static double sum(int i, int j, int k) {
        int d=i+j+k;
        return d;
    }

    public static void main(String[] args) {
        double d = sum(1,2,3);
        System.out.println(d);
    }
}
