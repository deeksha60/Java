import java.util.Scanner;
public class whileForDoWhileLoops {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

//        while loop
//        int i=1;
//        int sum=0;
//        System.out.println("Enter the value of N");
//        int N = sc.nextInt();
//        while(i<=N){
//            sum = sum + i;
//            i++;
//        }
//        System.out.println("sum is :"+sum);

//        do-while loop
//        int i=1;
//        int sum=0;
//        do{
//            sum=sum+i;
//            i++;
//        }while(i<=5);
//        System.out.println(sum);

//        example for do while loop
//        int age;
//        do{
//            System.out.println("Enter your age");
//            age = sc.nextInt();
//        }while(age<=18);
//        System.out.println("you can vote");

//         numbers from 1 to N using while
//        System.out.println("Enter the value of N");
//        int N=sc.nextInt();
//        int i=1;
//        while(i<=N){
//            System.out.println(i);
//            i++;
//        }
//         multiplication table
//        System.out.println("Enter the value of N");
//        int n=sc.nextInt();
//        int i=1;
//        while(i<=10){
//            System.out.println(n+"*"+i+"="+n*i);
//            i++;
//        }

//        reversing number using while
//        System.out.println("Enter any number");
//        int num=sc.nextInt();
//        int digit=0;
//        int reverse=0;
//        while(num>0){
//            digit=num%10;
//            reverse=reverse*10+digit;
//            num=num/10;
//        }
//        System.out.println(reverse);

//      asking for age using do-while
//        int age;
//        do{
//            System.out.println("Enter your age");
//            age = sc.nextInt();
//        }while(age<=0);
//        System.out.println("valid age");

//        password validation using do-while
//        String password="java123";
//        String pass;
//        do{
//            System.out.println("enter the password");
//            pass=sc.nextLine();
//        }while (!pass.equals(password));
//        System.out.println("you have entered correct password");

//        for loop example
//        for (int i =1;i<=5;i++){
//            System.out.println(i);
//        }

//      infinite for loop
//        for(; ;){
//            System.out.println("hello");
//        }

//      multiple vars
//        for(int i=1,j=5;i<=j;i++,j--){
//            System.out.println(i+" "+j);
//        }

//        factorial of a number using for loop
//        int fact=1;
//        for (int i=1;i<=5;i++){
//            fact=fact*i;
//        }
//        System.out.println("factorial of 5 is "+fact);

//      multiplication table
//        int n=5;
//        for(int i=1;i<=10;i++){
//            System.out.println(n+"*"+i+"="+n*i);
//        }

//        even numbers using for loop
//        System.out.println("enter the value of num");
//        int num=sc.nextInt();
//        for(int i=1;i<=num ;i++){
//            if(i%2==0 ) {
//                System.out.println(i);
//            }
//        }

//      sum of odd numbers using for loop
//        int sum = 0;
//        for(int i=1;i<=10 ;i++){
//            if(i%2!=0 ) {
//                System.out.println(i);
//                sum = sum+i;
//            }
//        }
//        System.out.println("sum of odd numbers is "+sum);

//      printing the star pattern
//        for(int i = 1;i<=5;i++){
//            int j=1;
//            while(j<=i) {
//                System.out.print("*");
//                j++;
//            }
//            System.out.println();
//        }

//        counting number of digits in the given integer
        int count = 0;
        int num = 10001;

        for(int i=1;num!=0;i++){
            num=num/10;
            count++;
        }
        System.out.println(count);
    }
}

