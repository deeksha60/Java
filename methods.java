import java.util.Scanner;
public class methods {

//    public static void change(int x){
//        x=x+5;
//    }
//    public static int add(int n1,int n2){
//        return n1+n2;
//    }
//    public static void changearraay(int[] a ){
//        a[0]=a[0]+5;
//    }
//
//
//    public static void main(String[] args) {
//
//        int num=5;
//        change(num);
//        System.out.println(num);

//        System.out.println(add(45,78));
//        int a[]={1,23,45};
//        changearraay(a);
//        System.out.println(a[0]);

//    to print your name
//    public static void name(String name){
//        System.out.println("hi "+name);
//
//    }
//
//    public static void main(String[] args) {
//        name("deeksha");
//    }

//    to find the square of a number
//    public static int square(int num){
//        return num*num;
//    }
//
//    public static void main(String[] args) {
//        System.out.println(square(25));
//    }

//    to find whether the given number is even or odd
//    public static void oddEven(int num){
//        if(num%2==0){
//            System.out.println("given number is even");
//        }
//        else
//            System.out.println("the given number is odd");
//    }
//
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        System.out.println("enter the number");
//        int n=sc.nextInt();
//        oddEven(n);
//    }

//    find the max of 2 numbers
    public static void max(int n1,int n2){
        if(n1>n2){
            System.out.println(n1+" is the largest");
        }
        else
            System.out.println(n2+" is the largest");
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the first number");
        int n1=sc.nextInt();
        System.out.println("enter the second number");
        int n2=sc.nextInt();
        max(n1,n2);
    }
}
