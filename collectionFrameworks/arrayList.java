package collectionFrameworks;

import java.util.ArrayList;

public class arrayList {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
//        adding elements to the arraylist
        fruits.add("mango");
        fruits.add("apple");
        fruits.add("banana");
        System.out.println("after add() "+fruits);

//        adding element at specific index it donot deletes the element just move it to next index
        fruits.add(1,"berry");
        System.out.println("after insertion at 1 position :"+fruits);

//        retrieving the element at specific index
        System.out.println(fruits.get(3));

//        setting the element at specific index which deletes the element at specific index at set it
        fruits.set(1,"orange");
        System.out.println("after setting at position 1 :"+fruits);

//        remove element at specific index or by passing the object
        System.out.println(fruits.remove(0));
        System.out.println(fruits.remove("orange"));
        System.out.println("after removing:"+fruits);

//        to get the size of the list
        System.out.println("size:"+fruits.size());

//        to check whether it contains the specific element
        System.out.println(fruits.contains("banana"));

//        duplicate values can be added
        fruits.add("banana");
        System.out.println("after adding duplicate value:"+fruits);
//        to clear the list
        fruits.clear();

//        to check whether the list is empty
        System.out.println("is empty:"+fruits.isEmpty());


    }
}
