package exceptionHandling;
import java.util.Scanner;
public class TravelBooking {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String dest[]={"paris","tokyo","sydney"};
        System.out.println("enter the destination number");
        int n=sc.nextInt();
        try{
            System.out.println(dest[n]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid destination number");
        }finally {
            System.out.println("booking is close");
        }
    }
}
