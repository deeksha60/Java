package abstractclass.areaandperimeter;

public class rectangle extends shape{
    @Override
    void area(int l,int b) {
        int res=l*b;
        System.out.println("area:"+res);
    }

    @Override
    void perimeter(int l,int b) {
        int res=2*(l*b);
        System.out.println("perimeter:"+res);
    }
}
