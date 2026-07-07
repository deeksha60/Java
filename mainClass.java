public class mainClass {
    //creating an object
    public static void main(String[] args) {
        //creating an object for class car
        car myCar = new car();
        myCar.color = "red";
        myCar.speed = 120;

        myCar.start();
        myCar.stop();
        System.out.println("color:" + myCar.color);



    }
}