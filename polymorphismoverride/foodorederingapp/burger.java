package polymorphismoverride.foodorederingapp;

//child of food
public class burger extends food{
    @Override
    void prepare() {
        System.out.println("burger");
    }
}
