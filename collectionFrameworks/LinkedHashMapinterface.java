package collectionFrameworks;

import java.util.Map;
import java.util.LinkedHashMap;

public class LinkedHashMapinterface {
    public static void main(String[] args) {
        Map<Integer, String> name = new LinkedHashMap<>();
        name.put(10, "pen");
        name.put(20,"pencil");
        name.put(30,"book");
        name.put(40,"Eraser");
        name.put(50,"Marker");
        System.out.println("products:"+name);

        name.put(40,"Notebook");
        System.out.println("after replacing:"+name);
    }
}
