package abstractclass.bank;

public class index {
    public static void main(String[] args) {
//        object for class sbi
        SBI s=new SBI();
        System.out.println("interest:"+s.getrateinterest());
        System.out.println("name:"+s.name);

//        object for class hdfc
        HDFC h=new HDFC();
        System.out.println("interest:"+h.getrateinterest());
        System.out.println("name:"+h.name);
    }
}
