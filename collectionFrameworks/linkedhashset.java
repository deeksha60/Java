package collectionFrameworks;
import java.util.Set;
import java.util.LinkedHashSet;

//uniqueness(no duplicates) + insertion order is maintained
public class linkedhashset {
    public static void main(String[] args) {
        Set<String> animals=new LinkedHashSet<>();

        animals.add("cat");
        animals.add("dog");
        animals.add("dog");
        animals.add("cow");
        System.out.println(animals);

        animals.remove("cat");
        System.out.println(animals);

        System.out.println(animals.contains("cow"));

        System.out.println(animals.size());
        animals.clear();
        System.out.println(animals.isEmpty());

    }
}
