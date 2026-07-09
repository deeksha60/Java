//package exceptionHandling;
//
//
//public class Exception {
//    public Exception(String message) {
//    }
//
//    static void withdraw(int amt) throws InvalidBalanceException{
//        int balance=10000;
//        if(amt>balance){
//            throw new InvalidBalanceException("your balance is less then the withdrawal amt");
//        }
//        else
//            System.out.println("you can withdraw");
//    }
//    public static void main(String[] args) {
//        try{
//            withdraw(5000);
//        }catch (InvalidBalanceException e){
//            System.out.println("your balance is less then the amt");
//        }
//    }
//}
