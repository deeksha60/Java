package polymorphismoverride.onlineshopping;

//child of product
public class clothing extends product{
    @Override
    void dicount() {
        System.out.println("the discount for clothing is 25%");
    }
}
