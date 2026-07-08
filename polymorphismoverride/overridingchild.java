package polymorphismoverride;

public class overridingchild extends overriding{
    @Override
    void sound() {
        System.out.println("animal make sounds");
    }

    public static void main(String[] args) {
        overridingchild c=new overridingchild();
        c.sound();
    }
}
