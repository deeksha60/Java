public class workingWithString {
    public static void main(String[] args) {
        String s1="Hello";

        String s2 = new String("hello");
        System.out.println("s1:"+s1);
        System.out.println("s2:"+s2);

        String s3="Java";
        String s4="Java";
        String s5=new String("Java");
        System.out.println(s3 == s4);
        System.out.println(s3.equals(s4));
        System.out.println(s4 == s5);
        System.out.println(s4.equals(s5));
    }
}
