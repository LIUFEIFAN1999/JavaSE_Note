package Note.Collection.Set;

import java.util.HashSet;
import java.util.Set;

public class HashSetTest {
    public static void main(String[] args) {
        Set set = new HashSet();
        set.add("A");
        System.out.println(set.size());
        set.add("A");
        System.out.println(set.size());
        set.add(null);
        set.add(null);
        System.out.println(set.size());
        System.out.println(set.contains(null));
    }
}
