public class checkImmutablity {
    public static void main(String[] args) {
        String s1="Hello";
        System.out.println("original string :"+s1);
//        modifying string
        s1.concat("world");
        System.out.println("after concatenation string:"+s1);

        String s2=s1.concat("world");
        System.out.println("s2 string is:"+s2);
        System.out.println("string s1:"+s1);

        String s="hello";
        s=s.concat(" world");
        System.out.println("new s is:"+s);
    }
}
