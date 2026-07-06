import java.util.Scanner;
public class ifLoop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

//        age and citizenship for voting
//        System.out.println("enter your age");
//        int age=sc.nextInt();
//        System.out.println("enter true if you are a citizen otherwise false ");
//        boolean citizenship=sc.nextBoolean();
//        if(age>=18 && citizenship==true){
//            System.out.println("you can vote");
//        }
//        else
//            System.out.println("you can't vote");


//        marks
//        int marks=56;
//        if(marks>=90){
//            System.out.println("grade A");
//        }
//        else if(marks>=75) {
//            System.out.println("grade B");
//        }else if (marks>=35) {
//            System.out.println("grade c");
//        }else
//            System.out.println("fail");


//        2 numbers-greater,smaller,equal
//        System.out.println("enter num1");
//        int num1=sc.nextInt();
//        System.out.println("enter num2");
//        int num2=sc.nextInt();
//        if(num1>num2){
//            System.out.println("first number is greater then ");
//        } else if (num2>num1) {
//            System.out.println("second is larger");
//        }
//        else
//            System.out.println("both are equal");


//        whether a number is positive,negative or equal to 0
//        System.out.println("Enter any number");
//        int number=sc.nextInt();
//        if(number>0){
//            System.out.println("entered number is positive");
//        } else if (number<0) {
//            System.out.println("entered number is negative");
//        }
//        else
//            System.out.println("entered number is 0");


//        check whether it lies b/w 1-100
//        System.out.println("enter any number");
//        int x=sc.nextInt();
//        if (x>=1 && x<=100){
//            System.out.println("true");
//        }
//        else
//            System.out.println("False");

//        scholarship eligibility
//        System.out.println("enter your marks");
//        int marks=sc.nextInt();
//        System.out.println("enter your family income");
//        int income=sc.nextInt();
//        if (marks>=85 || (marks>=70 && income<200000)){
//            System.out.println("you are eligible");
//        }
//        else
//            System.out.println("you are not eligible");


//        name and password
//        String name = "reena";
//        String password = "reena@1234";
//        System.out.println("Enter your name to login");
//        String name1 = sc.nextLine();
//        System.out.println("Enter the password to login");
//        String password1 = sc.nextLine();
//        if(name.equals(name1) && password.equals(password1)){
//            System.out.println("login successful");
//        }
//        else
//             System.out.println("renter the name and password");

//        driving license eligibility
        System.out.println("Enter your age");
        int age = sc.nextInt();
        System.out.println("medical fitness(true or false)");
        boolean fitness = sc.nextBoolean();
        if (age>=18 && fitness){
            System.out.println("you are eligible for driving license");
        }
        else
            System.out.println("you are not eligible for driving license");
    }
}
