package polymorphismoverride.bankEx;

//child of bank
public class icici extends bank{
    @Override
    void interestrate(){
        System.out.println("interest rate of icici is 6%");
    }
}
