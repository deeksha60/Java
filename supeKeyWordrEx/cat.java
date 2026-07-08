package supeKeyWordrEx;
//child of class animal
public class cat extends animal {
    String color="white";

    void showcolor(){
        System.out.println("cat color:"+color);
        System.out.println("animal color:"+super.color);
    }
    public static void main(String[] args) {
        cat c=new cat();
        c.showcolor();
    }
}
