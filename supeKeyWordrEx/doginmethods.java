package supeKeyWordrEx;
//child of class animalinmethods
public class doginmethods extends animalinmethods {
    void bark(){
        super.eat();
    }

    public static void main(String[] args) {
        doginmethods d=new doginmethods();
        d.bark();

    }
}
