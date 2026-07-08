package polymorphismoverride.onlineshopping;

//child of product
public class furniture extends product{
    @Override
    void dicount() {
        System.out.println("the discount for furniture is 10%");
    }
}
