package Note.Iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class CollectionTest {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(1);
        arrayList.add(2);
        //数组遍历
        int[] a = {1,2,3,4,1,3};
        for(int x : a)
            System.out.println(x);
        //线性表遍历
        for (Object x : arrayList)
            System.out.println(x);
        //迭代器
        System.out.println(arrayList.iterator().next());
        System.out.println(arrayList.iterator().next());

        Iterator iterator = arrayList.iterator();
        System.out.println(iterator.next());
        System.out.println(iterator.next());

    }
}
