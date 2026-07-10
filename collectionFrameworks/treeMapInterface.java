package collectionFrameworks;

import java.util.TreeMap;
import java.util.Map;

public class treeMapInterface {
    public static void main(String[] args) {
        Map<Integer, String> name = new TreeMap<>();
        name.put(1, "john");
        name.put(2,"ana");
        name.put(3,"alice");
        name.put(4,"bob");
        name.put(1,"roy");
        System.out.println(name);
    }
}
