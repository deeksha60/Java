package inheritanceExample.singleAndMultilevel;

// multi-level inheritance animal->mammal->dog
public class dog extends mammal {
    void bark(){
        System.out.println("dog is barking");
    }
    public static void main(String[] args) {
    }
}
