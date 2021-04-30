package Note.RTTI;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public class InitiableTest01 {
    public static void main(String[] args) throws Exception{
        Class initable = Initable.class;
        try {
            //调用无参构造器（且构造器可见）
            Object object = initable.newInstance();
            //调用其他构造器，可访问私有构造器
            Constructor cons2 = initable.getDeclaredConstructor(String.class);
            if(!cons2.isAccessible())
                cons2.setAccessible(true);
            Object object2 = cons2.newInstance("Hello");
            //没有设置访问权限，无法访问
            Object object3 = initable.getDeclaredConstructor(String.class).newInstance("World");
        }catch(InstantiationException e) {
            System.out.println("Cannot Instantiate");
        }
        catch (IllegalAccessException e) {
            System.out.println("Cannot Access");
        }
        System.out.println(Initable.staticUnfinal);
        System.out.println(Initable.StaticFinal);
        System.out.println("After initializaing Initable");
        Field[] fields = initable.getDeclaredFields();
        System.out.println(fields[0]);
    }
}
