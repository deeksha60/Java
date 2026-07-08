public class staticExample {
    String name;
//    static will create the only one copy of variable  which can be accessed by aLL the objects
    static String school="green valley";

    staticExample(String s){
        name=s;
    }
    void show(){
        System.out.println("name:"+name);
        System.out.println("school:"+school);

    }
    public static void main(String[] args) {
        staticExample static_obj=new staticExample("tom");
        static_obj.show();
        staticExample static_obj1=new staticExample("john");
        static_obj1.show();
    }
}
