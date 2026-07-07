package acessmodifiers;

import accessmodifiers1.car;

public class index {
    public static void main(String[] args) {
        car car2 = new car();
        car car1 = new car("Toyato",50000);
        car2.display();
        car1.display();
    }
}
