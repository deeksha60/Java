import java.util.Scanner;
public class breakAndContinue {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);

//        continue ex
//        for(int i=1;i<=10;i++){
//            if(i==6) {
//                continue;
//            }
//                        System.out.println(i);
//        }

//        break ex
//        for(int i=1;i<=10;i++){
//            if(i==6) {
//               break;
//            }
//            System.out.println(i);
//        }

//        1-10 skip even numbers
//        for(int i=1;i<=10;i++){
//            if(i%2==0){
//                continue;
//            }
//            System.out.println(i);
//        }

//        keep taking input until the user enters 0
//        while(true) {
//            System.out.println("enter any number");
//            int num=sc.nextInt();
//            if(num==0){
//                break;
//            }
//        }

//        print 1-20 but skip multiples of 3
        for(int i=1;i<=20;i++){
            if(i%3==0){
                continue;
            }
            System.out.println(i);
        }
    }
}
