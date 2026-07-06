import javax.xml.transform.Source;
import java.sql.SQLOutput;
import java.util.Scanner;
public class switchStatement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        int day = 6;
//        switch (day){
//            case 1:
//                System.out.println("Monday");
//                break;
//            case 2:
//                System.out.println("Tuesday");
//                break;
//            case 3:
//                System.out.println("Wednesday");
//                break;
//            case 4:
//                System.out.println("Thursday");
//                break;
//            case 5:
//                System.out.println("Friday");
//                break;
//            case 6:
//                System.out.println("Saturday");
//                break;
//            case 7:
//                System.out.println("Sunday");
//                break;
//            default :
//                System.out.println("Invalid day");

//        }

//        simple calculator
//        System.out.println("enter the first number");
//        int num1 = sc.nextInt();
//        System.out.println("enter the Second number");
//        int num2 = sc.nextInt();
//        System.out.println("Enter the operator (+,-,*,/)");
//        String operator = sc.next();
//        int res;
//        switch (operator){
//            case "+":
//               res = num1 + num2;
//                System.out.println("result is "+res);
//               break;
//            case "-":
//                res = num1 - num2;
//                System.out.println("result is "+res);
//                break;
//            case "*":
//                res = num1 * num2;
//                System.out.println("result is "+res);
//                break;
//            case "/":
//                if(num2 !=0) {
//                    res = num1 / num2;
//                    System.out.println("result is " + res);
//                }
//                else
//                    System.out.println("zero division error");
//                break;
//            default:
//                System.out.println("invalid operator");
//        }

//        month number to number of days
        System.out.println("enter the month (1-12)");
        int month = sc.nextInt();
        switch (month){
            case 1,3,5,7,9,11:
                System.out.println("31 days");
                break;
            case 2:
                System.out.println("28 days");
                break;
            case 4,6,8,10,12:
                System.out.println("30 days");
                break;
            default:
                System.out.println("invalid month");
        }

    }
}
