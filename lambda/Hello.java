package lambda;

public class Hello {

//    if we use lambda function no need to implement the class as child of interface and no need to define the method
    public static void main(String[] args) {
        Greeting g=(int a,int b)->{
            System.out.println(a+b);
    };
    g.sum(3,9);
    }
}
//lambda expression