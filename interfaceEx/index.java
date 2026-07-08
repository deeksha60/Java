package interfaceEx;

public class index {
    public static void main(String[] args) {
        animal a=new dog();//we can't create an object for abstract class so using dispatch method
        a.sound();
        dog d=new dog();
        d.sound();
    }
}
