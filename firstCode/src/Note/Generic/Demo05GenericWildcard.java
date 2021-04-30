package Note.Generic;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo05GenericWildcard {
    public static void main(String[] args) {
        //创建两种不同类型的线性表
        ArrayList<String> list1 = new ArrayList<String>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        list1.add("hello");
        list2.add(1);

        //调用方法
        printArray(list1);
        printArray(list2);
    }
    public static void printArray(ArrayList<?> list){
        //迭代器遍历打印
        Iterator<?> iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
