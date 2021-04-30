package Note.Method;

class DataSwap{
    public int a;
    public int b;
}

public class SwapTest {
    public static void swap(DataSwap arg) {
        int tmp = arg.a;
        arg.a=arg.b;
        arg.b=tmp;
        System.out.println(arg.a+" "+arg.b);
    }
    public static void main(String[] args) {
        DataSwap dataSwap = new DataSwap();
        dataSwap.a=6;
        dataSwap.b=9;
        swap(dataSwap);
        System.out.println(dataSwap.a+" "+dataSwap.b);
    }
}
