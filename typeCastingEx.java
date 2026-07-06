public class typeCastingEx {
    public static void main(String[] args) {
        System.out.println("widening  conversion");
        System.out.println("-----------------------");
        byte byteValues = 10;
        short shortValues = byteValues;
        int intValues = shortValues;
        long longValues = intValues;
        float floatValues = longValues;
        double doubleValues = floatValues;
        System.out.println("int:"+intValues);
        System.out.println("long:"+longValues);
        System.out.println("float:"+floatValues);
        System.out.println("double:"+doubleValues);
        System.out.println("short:"+shortValues);

        System.out.println("Narrowing conversion");
        System.out.println("------------------------");
        double doubleValue = 123.456565825;
        float floatValue = (float)doubleValue;
        long longValue = (long)floatValue;
        int intValue = (int)longValue;
        short shortValue = (short)intValue;
        System.out.println("double:"+doubleValue);
        System.out.println("float:"+floatValue);
        System.out.println("long:"+longValue);
        System.out.println("int:"+intValue);
        System.out.println("short:"+shortValue);
    }
}
