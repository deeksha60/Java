package polymorphismoverride.foodorederingapp;

public class index {
    public static void main(String[] args){

//        object for class pizza
        pizza p=new pizza();
        p.prepare();

//        object for the class burger
        burger b=new burger();
        b.prepare();

//        object for biryani class
        biryani y=new biryani();
        y.prepare();

    }
}
