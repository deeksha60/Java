public class findingRange {
    public static void main(String[] args) {
        System.out.println("Byte range");
        System.out.println("----------------------");
        byte a = 127;
        System.out.println("the example byte is:" + a);
        System.out.println("minimum of byte value:" + Byte.MIN_VALUE);
        System.out.println("maximum of byte value:" + Byte.MAX_VALUE);

        System.out.println("integer range");
        System.out.println("----------------------");
        int age = 127;
        System.out.println("the example byte is:" + age);
        System.out.println("minimum of int value:" + Integer.MIN_VALUE);
        System.out.println("maximum of int value:" + Integer.MAX_VALUE);

        System.out.println("Float range");
        System.out.println("------------------------");
        System.out.println("minimum of Float value:" + Float.MIN_VALUE);
        System.out.println("maximum of Float value:" + Float.MAX_VALUE);

        System.out.println("Short range");
        System.out.println("------------------------");
        System.out.println("Minimum of Short value:" +Short.MIN_VALUE);
        System.out.println("Maximum of Short value:" +Short.MAX_VALUE);

        System.out.println("Character range");
        System.out.println("------------------------");
        System.out.println("minimum of Character value:" + (int)Character.MIN_VALUE);
        System.out.println("maximum of Character value:" + (int)Character.MAX_VALUE);
        System.out.println((char)97);

        System.out.println("long range");
        System.out.println("------------------------");
        System.out.println("minimum of long value:" + Long.MIN_VALUE);
        System.out.println("maximum of long value:" + Long.MAX_VALUE);
    }
}