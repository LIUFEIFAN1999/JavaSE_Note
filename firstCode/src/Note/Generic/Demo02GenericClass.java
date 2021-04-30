package Note.Generic;

public class Demo02GenericClass {
    public static void main(String[] args) {
        //字符串类型
        GenericClass<String> genericClass = new GenericClass<String>();
        genericClass.setName("字符串");
        String name01 = genericClass.getName();
        System.out.println(name01);

        //整型类型
        GenericClass<Integer> genericClass1 = new GenericClass<Integer>();
        genericClass1.setName(1);
        int name02 = genericClass1.getName();
        System.out.println(name02);
    }
}
