public class swap2Num {
    public static void main(String[] args) {
        System.out.println("Swapping of two numbers");
        int a = 5;
        int b = 7;
        System.out.println("a:"+a);
        System.out.println("b:"+b);
        int temp;
        temp = a;
        a = b;
        b = temp;
        System.out.println("after swapping");
        System.out.println("a:"+a);
        System.out.println("b:"+b);
    }
}
