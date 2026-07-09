package multithreading;

public class index {
    public static void main(String[] args) throws InterruptedException {
        Hello h1=new Hello();
        Hi h2=new Hi();
        h1.start();
        h1.join();  //first completes the execution of h1 thread and then comes to next thread
        h2.start();
    }
}
