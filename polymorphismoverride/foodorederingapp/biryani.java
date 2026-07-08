package polymorphismoverride.foodorederingapp;

//child of food
public class biryani extends food{
    @Override
    void prepare() {
        System.out.println("biryani");
    }
}
