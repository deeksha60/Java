package interfaceEx.multipleinterfaces;
// multiple class inheritance is not supported by java because if we have a same method in both the parents then the compiler will get confused when called by the child
// but supported by the interface because no matter even if the parent class as same methods it is overrided or implemented in the child class
public class demochild implements printable,showable{

    @Override
    public void print() {
        System.out.println("printing...");
    }

    public static void main(String[] args) {
        demochild d=new demochild();
        d.print();
    }
}
