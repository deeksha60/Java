package exceptionHandling;

public class arrayoutofbound {
    public static void main(String[] args) {
        System.out.println("hello");
        int a=5;
        int b=0;
        int res;
        int arr[]={1,2,3,4,5};
        try{
            System.out.println(arr[0]);
            System.out.println(arr[6]);   //trying to access the value which is out of bound
            res=a/b;                      //it don't handle this exception because when it gets the first exception it goes to catch block
            System.out.println(res);
        }
//        catch (ArithmeticException e){
//            System.out.println(e);
//        }
//        catch(ArrayIndexOutOfBoundsException e){
//            System.out.println(e);      //so exception block executed
//        }
        finally {                 //whether the program executes or caught error final block will be executed always
            System.out.println("i'll run anyway");
        }
        System.out.println("byee");
    }
}
