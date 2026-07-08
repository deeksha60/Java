package polymorphismoverride.onlineshopping;

//child of product
public class electronics extends product{
    @Override
    void dicount() {
        System.out.println("the discount of electronics is 20%");
    }
}
