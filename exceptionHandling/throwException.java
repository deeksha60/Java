package exceptionHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class throwException {

    public static void main(String[] args) {

//      throw will just throw the exception
        int age=12;
        System.out.println(age);
//        try {
//            if(age>18){
//                System.out.println("you are eligible to vote");  //manually creating and triggering the exception
//            }
//        } catch (ArithmeticException e){
//            System.out.println("error occured"+e);
//        }

        if(age<=18){
            throw new ArithmeticException("you are not eligible to vote");  //manually creating and triggering the exception
        }
//      when exception occurs it terminates the program so we need to handle it using the try catch exception
        System.out.println("eligible");
        System.out.println("end");


    }
}
