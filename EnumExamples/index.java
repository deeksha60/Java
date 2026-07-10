package EnumExamples;

public class index {
    public static void main(String[] args) {
        System.out.println(days.MONDAY);
        System.out.println(days.TUESDAY);
        System.out.println(days.WEDNESDAY);
        System.out.println(days.THURSDAY);
        System.out.println(days.FRIDAY);
        System.out.println(days.SATURDAY);
        System.out.println(days.SUNDAY);

//        enum in switch cases
        days day=days.MONDAY;
        switch (day){
            case MONDAY:
                System.out.println("start of the week");
                break;
            case FRIDAY:
                System.out.println("almost weekend");
                break;
            case SUNDAY:
                System.out.println("weekend");
                break;
            default:
                System.out.println("mid week day");
        }

    }
}
