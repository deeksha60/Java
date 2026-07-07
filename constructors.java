public class constructors {

//    String name;
//    constructors(String a){
//        name=a;
//    }
//
//    public static void main(String[] args) {
//        constructors stu_obj=new constructors("john");
//        System.out.println(stu_obj.name);
//    }

//    default constructors
//    String name;
//    int age;
//    constructors(){
//        name = "unknown";
//        age = 0;
//    }
//    void displayinfo(){
//        System.out.println("name:"+name);
//        System.out.println("age:"+age);
//
//    }
//    public static void main(String[] args) {
//        constructors student = new constructors();
//        student.displayinfo();
//    }

//        parameterized constructor
        String name;
        int salary;
        constructors(String s,int n){
            name=s;
            salary=n;
        }
        void display(){
            System.out.println("name:"+name);
            System.out.println("salary:"+salary);
    }

        public static void main(String[] args) {
            constructors employee=new constructors("tom",10000);
            employee.display();
    }


}
