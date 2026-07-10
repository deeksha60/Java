package EnumExamples;

public class seasonindex {
    public static void main(String[] args) {
        season s=season.SUMMER;

        switch (s){
            case RAINY:
                System.out.println("this is the rainy season");
                break;
            case SUMMER:
                System.out.println("it's hot stay hydrated");
                break;
            case WINTER:
                System.out.println("this is winter");
                break;
            default:
                System.out.println("not in the season");
        }
    }
}
