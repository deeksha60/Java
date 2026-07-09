package multithreading;

public class Hello extends Thread{

    public void run(){
        for (int i=0;i<=50;i++){
            System.out.println("hello");
            try{
                Thread.sleep(500);
            }catch (InterruptedException e){
                System.out.println(e);
            }
        }
    }

//    public void run(){
//        for (int i=0;i<=100;i++){
//            System.out.println("hello");
//        }
//    }
}
