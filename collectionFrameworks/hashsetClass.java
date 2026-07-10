package collectionFrameworks;
import java.util.Iterator;
import java.util.Set;
import java.util.HashSet;

//uniqueness(no duplicates)+order of insertion is not maintained
public class hashsetClass {
    public static void main(String[] args) {
        Set<String> cities=new HashSet<>();

//        adding values to set
        cities.add("delhi");
        cities.add("mumbai");
//        duplicate values will be ignored
        cities.add("delhi");
        cities.add("pune");
        System.out.println(cities);

//        iterating using for loop
        System.out.println("using for loop");
        for (String city:cities){
            System.out.println(city);
        }

//        iterating using the iterator
        System.out.println("using iterator");
        Iterator<String > it= cities.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
//        removing the elements
       cities.remove("delhi");

//        contains the specific element
        cities.contains("delhi");

//        size,clear,isempty
        System.out.println(cities.size());
        cities.clear();
        cities.isEmpty();
    }
}
