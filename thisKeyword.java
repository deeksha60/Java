public class thisKeyword {
    String name;
    int age;
//    constructor
    thisKeyword(String name,int age){
        this.name=name;
        this.age=age;
    }
    void display(){
        System.out.println("name:"+name);
        System.out.println("age:"+age);
    }
    public static void main(String[] args) {
        thisKeyword k=new thisKeyword("john",23);
        k.display();
    }
}
