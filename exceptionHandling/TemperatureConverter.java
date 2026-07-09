package exceptionHandling;
import java.util.Scanner;
public class TemperatureConverter {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter temperature in celcius");
        int temp=sc.nextInt();
        System.out.println("Enter any number to divide");
        int num=sc.nextInt();
        int res;
        try{
            res=temp/num;
            System.out.println(res);

            }catch (Exception e){
            System.out.println("zero division error");
        }

    }
}
