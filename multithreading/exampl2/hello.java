package multithreading.exampl2;

public class hello extends Thread{

    void print(){
        for (int i=0;i<=10;i++){
        System.out.println("hello");}
    }
    void show(){
        for (int i=0;i<=10;i++){
        System.out.println("hi");}
    }
    public void run(){
        print();
        show();
    }

    public static void main(String[] args) {
        hello h=new hello();
        h.start();
    }
}
