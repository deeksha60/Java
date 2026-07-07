public class gettersAndSetters {
//    int age;
//    String name;
//
//    public void setAge(int n) {
//        if (n > 0) {
//            age = n;
//        } else
//            System.out.println("invalid age");
//    }
//
//    public void setName(String a) {
//        name=a;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public static void main(String[] args) {
//        gettersAndSetters s1 = new gettersAndSetters();
//        s1.setAge(5);
//        s1.setName("john");
//        System.out.println(s1.getAge());
//        System.out.println(s1.getName());
//    }

//    setting the private variables name and rollno and name

    private String name;
    private int rollno;
    public void setName(String a){
        name=a;
    }
    public void setRollno(int no){
        if(no>0){
            rollno=no;
        }
        else
            System.out.println("invalid number");
    }
    public String getName(){
        return name;
    }
    public int getRollno(){
        return rollno;
    }

    public static void main(String[] args) {
        gettersAndSetters s=new gettersAndSetters();
        s.setName("tom");
        s.setRollno(15);
        System.out.println("name:"+s.getName());
        System.out.println("rollno:"+s.getRollno());
    }
}
