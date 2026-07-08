package polymorphismoverride.bankEx;

//child of bank
public class sbi extends bank{
    @Override
     void interestrate(){
        System.out.println("interest rate of sbi is 7%");
    }
}
