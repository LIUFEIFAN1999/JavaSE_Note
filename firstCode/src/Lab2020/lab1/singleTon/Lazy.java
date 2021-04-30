package Lab2020.lab1.singleTon;

public class Lazy {

    private static Lazy lazy;

    private Lazy(){}

    public static Lazy getLazy(){
        if(null==lazy){
            synchronized (Lazy.class){
                if(null==lazy)
                    lazy = new Lazy();
            }
        }
        return lazy;
    }
}

/*
 * 类加载时不会自动创建对象。
 * 只有获取对象时才有可能创建新对象，不会造成内存浪费
 */
