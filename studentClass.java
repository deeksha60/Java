public class studentClass {
    String name;
    int age;
    int marks;

    void displaydetails(){
        System.out.println("name:"+name);
        System.out.println("age:"+age);
        System.out.println("marks:"+marks);
    }
    public static void main(String[] args) {
        studentClass student1=new studentClass();
        student1.name="john";
        student1.age=14;
        student1.marks=45;
        student1.displaydetails();

        studentClass student2=new studentClass();
        student2.name="tony";
        student2.age=15;
        student2.marks=34;
        student2.displaydetails();
    }
}
