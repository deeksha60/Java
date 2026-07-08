package abstractclass;

//child of the class animal
public class dog extends animal{

//    we need to override the abstract class
    @Override
    void sound() {
        System.out.println("they can speak");
    }
}
