import java.util.Scanner;
public class areaAndPerimeter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length");
        double length = sc.nextDouble();
        System.out.println("Enter the length");
        double breadth = sc.nextDouble();
        double area = length * breadth;
        System.out.println("Area is " + area);
//        int perimeter = 2 * (length * breadth);
//        System.out.println("perimeter is " + perimeter);
    }}