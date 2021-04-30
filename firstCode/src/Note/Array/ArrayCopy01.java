package Note.Array;

public class ArrayCopy01 {
    public static void main(String[] args) {
        int [] a = {1,2,3};
        int [] b = new int[3];
        System.arraycopy(a, 0, b, 0, 3);
        for(int x: b)
            System.out.println(x);
    }
}
