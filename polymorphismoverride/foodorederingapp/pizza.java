package polymorphismoverride.foodorederingapp;

//child of food
public class pizza extends food{
    @Override
    void prepare() {
        System.out.println("pizza");
    }
}
