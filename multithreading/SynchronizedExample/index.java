package multithreading.SynchronizedExample;

public class index {
    public static void main(String[] args) throws InterruptedException{
        counter c=new counter();
        Thread t=new Thread(()->{
            for (int i=0;i<=1000;i++){
                c.increment();
            }
        });
        Thread t2=new Thread(()->{
            for (int i=0;i<=1000;i++){
                c.increment();
            }
        });
        t.start();
        t2.start();

        t.join();
        t2.join();

        System.out.println(c.count);
    }
}
