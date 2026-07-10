package collectionFrameworks;
import java.util.Set;
import java.util.TreeSet;

//uniqueness(no duplicates) +elements are sorted
public class TreeSetclass {
    public static void main(String[] args) {
        Set<String> animals=new TreeSet<>();
        animals.add("lion");
        animals.add("Dog");
        animals.add("Cow");
        animals.add("cat");
        animals.add("10");
        animals.add("890");

        System.out.println(animals);
        System.out.println(animals.size());
        animals.remove("cow");

        System.out.println(animals.contains("cat"));
        System.out.println(animals.size());
        System.out.println(animals.isEmpty());

        Set<Integer> num=new TreeSet<>();
        num.add(100);
        num.add(40);
        num.add(20);
        System.out.println(num);
    }
}
