package collectionFrameworks;

import java.util.HashMap;
import java.util.Map;

public class HashMap_Integer {
    public static void main(String[] args) {
        Map<Integer,String> name=new HashMap<>();

        name.put(1,"john");
        name.put(2,"roe");
        name.put(3,"tom");
        name.put(4,"tony");
        name.put(5,"don");

        name.remove(2);
        System.out.println(name);
        System.out.println(name.containsKey(2));
        System.out.println(name);

    }

}
