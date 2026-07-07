public class mainclas {
    public static void main(String[] args) {
        car myCar = new car();
        myCar.color = "red";
        myCar.speed = 120;

        myCar.start();
        myCar.stop();
        System.out.println("color:" + myCar.color);
    }
}