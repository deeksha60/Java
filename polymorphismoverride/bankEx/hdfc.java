package polymorphismoverride.bankEx;

//child of bank
public class hdfc extends bank{
    @Override
    void interestrate(){
        System.out.println("interest rate of hdfc is 11%");
    }
}
