package polymorphismoverride.onlineshopping;

public class index {
    public static void main(String[] args) {
//        object for class electronics
        electronics e=new electronics();
        e.dicount();

//        object for class clothing
        clothing c = new clothing();
        c.dicount();

//        objects for the class furniture
        furniture f = new furniture();
        f.dicount();
    }
}
