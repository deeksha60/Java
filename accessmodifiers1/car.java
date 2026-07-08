package accessmodifiers1;

public class car {
    String brand;
    int price;
    public car(){
        brand="BMW";
        price=40000000;
    }
    public car(String n, int p){ //parameterized constructor
        brand=n;
        price=p;
    }
    public void display(){ //default constructor
        System.out.println("brand:"+brand);
        System.out.println("price:"+price);
    }

    public static void main(String[] args) {

    }
}
