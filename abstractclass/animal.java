package abstractclass;
//parent class
abstract public class animal {        //abstract class cannot be instantiated(cannot create an object)
    abstract void sound();           //abstract method should not have body and should be override by the child class
    void sleep(){
        System.out.println("sleep");
    }
}
