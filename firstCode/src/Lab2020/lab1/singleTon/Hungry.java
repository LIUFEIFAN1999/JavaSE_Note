package Lab2020.lab1.singleTon;

public class Hungry {
    private static Hungry hungry;

    private Hungry(){}

    static {
        hungry = new Hungry();
    }

    public static Hungry getHungry(){
        return hungry;
    }
}
/*
 * 类加载时，对象即被创建。然而有时候只需要用到某些静态方法
 * 而不需要使用到对象时，创建的对象会浪费内存。
 */
