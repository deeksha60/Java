public class rectangleConstructor {
    int length;
    int breadth;
    rectangleConstructor(int l,int b){
        length=l;
        breadth=b;
    }
    void calculatearea(){
        System.out.println("Area:"+length*breadth);

    }

    public static void main(String[] args) {
        rectangleConstructor area=new rectangleConstructor(4,5);
        area.calculatearea();
    }
}
