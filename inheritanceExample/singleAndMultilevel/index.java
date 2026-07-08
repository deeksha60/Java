package inheritanceExample.singleAndMultilevel;

public class index {
    public static void main(String[] args) {
//        parent class cannot access the child methods
//            Animal a=new Animal();
//            a.eat();//method of animal

//        child of class animal can access the methods of class Animal
//            mammal m=new mammal();
//            m.eat();//method of animal
//            m.walk();//method of mammal

//        child class of class mammal can access the methods of both Animal and mammal class
//          dog d=new dog();
//          d.eat();//method of animal
//          d.walk();//method of mammal
//          d.bark();//method of dog

//       car object which is a child of vehicle
//        car c = new car();
//        c.drive();
//        c.start();

//        objects of class manager person->employee->manager
        manager m=new manager();
        m.manage();
        m.work();
        m.speak();
    }
}
