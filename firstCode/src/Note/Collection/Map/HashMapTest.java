package Note.Collection.Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapTest {
    /**
     * 保存具有映射关系的数据，以key-value方式存储数据
     * Map集合内部有两个集合：key集合、value集合
     * key、value可以是任何数据类型
     * key重复则覆盖掉原来的value
     * HashTable与HashMap区别：
     * HashTable线程安全；HashMap非线程安全，但性能高
     * Hashtable不可以用null作为key、value，HashMap可以
     */
    public static void main(String[] args) {
        Map<String, String> map = new HashMap();
        map.put("001","LFF");
        map.put("002","ZZL");
        map.put("003","ZYC");
        map.put("004","WXF");
        Set keySet = map.keySet();
        Collection valueCollection = map.values();
        System.out.println("keys:"+keySet);
        System.out.println("values:"+valueCollection);
        Object obj = map.get("002");
        System.out.println(map.get("001"));
        System.out.println(obj);
    }
}
