package polymorphismoverride.bankEx;

public class index {
    public static void main(String[] args) {
//        object of class sbi
        sbi s=new sbi();
        s.interestrate();

//        object for class hdfc
        hdfc h=new hdfc();
        h.interestrate();

//        object for class icici
        icici i=new icici();
        i.interestrate();
    }
}
