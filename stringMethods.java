public class stringMethods {
    public static void main(String[] args) {
        String name="John";
        String name1="John";

        System.out.println("original string:"+name);
        System.out.println("length:"+name.length());
        System.out.println("uppercase:"+name.toUpperCase());
        System.out.println("lowercase:"+name.toLowerCase());
        System.out.println("character at 0 th position:"+name.charAt(0));

        System.out.println(name.equals(name1));
        System.out.println(name == name1);

        String s2=new String("john");
        System.out.println(name.equals(s2));
        System.out.println(name.equalsIgnoreCase(s2));
        System.out.println(name == s2);

        System.out.println(name.contains(""));
        System.out.println(name.substring(0,4));

        s2=s2.concat(" don");
        System.out.println("after concatenation:"+s2);
        System.out.println(name.equals(s2));
        System.out.println(name.equalsIgnoreCase(s2));
        System.out.println(name == s2);
    }
}
