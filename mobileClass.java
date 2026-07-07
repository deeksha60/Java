public class mobileClass {
    String model;
    String storage;
    int price;

    void displaySpecs(){
        System.out.println("model:"+model);
        System.out.println("Storage:"+storage);
        System.out.println("price:"+price);
    }

    public static void main(String[] args) {
        mobileClass m1=new mobileClass();
        m1.model="iphone 17";
        m1.storage="65 GB";
        m1.price=15000;
        m1.displaySpecs();
    }
}
