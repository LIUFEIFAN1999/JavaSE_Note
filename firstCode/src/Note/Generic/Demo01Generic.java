package Note.Generic;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo01Generic {
    public static void main(String[] args) {
        show01();
    }
    /*
     *创建集合对象，使用泛型
     * 好处：
     * 1.存什么类型，取出什么类型
     * 2.把异常提前到编译期（类型转换）
     * 坏处：
     * 只能储存一种类型数据
     */
    private  static void show01(){
        ArrayList list = new ArrayList();
        list.add("abc");
        list.add(1);

        //使用迭代器遍历list集合
        //获取迭代器
        Iterator it = list.iterator();
        while(it.hasNext()){
            Object obj = it.next();
            System.out.println(obj);

            //向下转型，出现类型转换异常
            String s = (String)obj;
            System.out.println(s.length());
        }
    }
}
