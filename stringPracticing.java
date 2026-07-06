public class stringPracticing {
    public static void main(String[] args) {
        String name="luca";
        System.out.println("length of my name "+name.length());

        System.out.println("first character "+name.charAt(0));
        System.out.println("last character "+name.charAt(name.length()-1));

        String s1 = "java programming";
        System.out.println("in lowercase "+s1.toLowerCase());
        System.out.println("in uppercase "+s1.toUpperCase());

        String s2 = "Java";
        String s3 = "JAVA";
        System.out.println("s2 equals to s3 \""+s2.equals(s3)+"\"");
        System.out.println("s2 equals ignore case to s3 "+s2.equalsIgnoreCase(s3));

        String str = "madam";
        StringBuilder reversed = new StringBuilder(str).reverse();
        System.out.println("Reversed String: " + reversed);
    }
}
