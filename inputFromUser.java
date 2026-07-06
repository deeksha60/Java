//import java.util.Scanner;
//public class inputFromUser {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//
//        System.out.println("Enter your name");
//        String name=sc.nextLine();
//        System.out.println("enter the register number");
//        String usno=sc.nextLine();
//        System.out.println("Enter your age");
//        int age=sc.nextInt();
//        System.out.println("enter your height");
//        double height=sc.nextDouble();
//
//        System.out.println("name:"+name);
//        System.out.println("register:"+usno);
//        System.out.println("age:"+age);
//        System.out.println("height:"+height);
//
//    }
//}
import java.util.Scanner;
public class inputFromUser {
    public static void main(String[] args) {
        Scanner src=new Scanner(System.in);

        System.out.println("Enter your Full name:");
        String name=src.nextLine();
        System.out.println("Enter your Age:");
        int age = src.nextInt();
        System.out.println("Enter your height");
        double height=src.nextDouble();
        System.out.println("are you student(enter only True or False)");
        boolean student=src.nextBoolean();

        System.out.println("Name:"+name);
        System.out.println("Age:"+age);
        System.out.println("Height:"+height);
        System.out.println("Student:"+student);

    }
}
