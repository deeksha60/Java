public class totalAvgPercentage {
    public static void main(String[] args) {
        System.out.println("total ,average,percentage of the marks obtained in 5 subjects");
        int java=45;
        int python=42;
        int c=44;
        int os=46;
        int cn=48;
        int total=java+python+c+os+cn;
        float avg=(float)total/5;
        float percentage=(float)total/250*100;
        System.out.println("total:"+total);
        System.out.println("average:"+avg);
        System.out.println("percentage:"+percentage+"%");
    }}