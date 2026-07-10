package multithreading;

public class index {
    public static void main(String[] args) throws InterruptedException {
        Hello h1=new Hello();
        Hi h2=new Hi();

//        it gives true or false-it will gives false before thread starts
        System.out.println(h1.isAlive());
        System.out.println(h2.isAlive());

        h1.start();
//        h1.join();  //first completes the execution of h1 thread and then comes to next thread
        h2.start();

        System.out.println(h1.isAlive());  //after starting the thread it gives true
        System.out.println(h2.isAlive());
    }
}
