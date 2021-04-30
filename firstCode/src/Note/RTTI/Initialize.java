package Note.RTTI;

class Father{
    static int num1 = 0;
    static {
        int num2 = 4;
        System.out.println("父类代码块被执行");
    }
}

class Son extends Father {
    static{
        System.out.println("子代码块被执行");
    }

}

public class Initialize {
    public static void main(String[] args) {
        Son son = new Son();
    }
}
