package acessmodifiers;

import accessmodifiers1.car;

public class index {
    public static void main(String[] args) {
        car car1 = new car();
        car car2 = new car("Toyato",50000);
        car1.display();
        car2.display();
    }
}
