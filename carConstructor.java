public class carConstructor {
    String brand;
    int price;
    carConstructor(){
        brand="BMW";
        price=40000000;
    }
    carConstructor(String n,int p){ //parameterized constructor
        brand=n;
        price=p;
    }
    void display(){ //default constructor
        System.out.println("brand:"+brand);
        System.out.println("price:"+price);
    }

    public static void main(String[] args) {
        carConstructor car = new carConstructor();
        carConstructor car1 = new carConstructor("Toyato",50000);
        car.display();
        car1.display();
    }
}
