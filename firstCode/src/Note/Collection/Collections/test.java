package Note.Collection.Collections;

import java.util.*;

public class test {
    /**
     * hashtable的key、value不能是null，否则空指针异常
     * hashMap线程不安全， hashtable线程安全
     * 但是以下代码验证synchronizedMap方法并不是将hashMap转换成hashtable
     * 因为转换之仍然是可以对key、value赋值null
     */
    public static void main(String[] args) {
        Map<String, String > map = new HashMap<>();
        Map<String, String > table = new Hashtable<>();
        map.put("001","LLL");
        Collections.synchronizedMap(map);
        map.put(null, null);
        System.out.println(map.keySet());
        table.put(null, null);
    }
}