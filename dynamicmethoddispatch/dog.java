package dynamicmethoddispatch;

//child class
public class dog extends animal{
    @Override
    void sound() {
        System.out.println("dog barks");
    }
}
