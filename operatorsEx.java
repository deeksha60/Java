public class operatorsEx {
    public static void main(String[] args) {
        System.out.println("Relational operators");
        int a=10,b=5;
        System.out.println(a>b);
        System.out.println(a<b);
        System.out.println(a==b);
        System.out.println(a!=b);

        System.out.println("logical operators");
        int age=20;
        System.out.println(age>10 && age<20);
        System.out.println(age>10 || age<20);
        System.out.println(age!=15);

        System.out.println("assignment operators");
        int x=10;
        System.out.println(x+=5);
        System.out.println(x-=6);
        System.out.println(x*=2);
        System.out.println(x/=3);
        System.out.println(x%=4);

        System.out.println("unary operator");
        int y=9;
        System.out.println(++y);
        System.out.println(y++);
        System.out.println(y);


    }
}