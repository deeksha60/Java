package interfaceEx.inheritanceininterface;

//child of interface2
public class child1 implements interface2 {
    @Override
    public void print() {
        System.out.println("printing");
    }

    @Override
    public void show() {
        System.out.println("....");
    }

    public static void main(String[] args) {
        child1 c=new child1();
        c.print();
        c.show();
    }
}
