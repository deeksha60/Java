import java.time.DayOfWeek;
import java.time.LocalDate;

public class workingdays {
    public static void main(String[] args) {
        LocalDate start=LocalDate.of(2026,7,1);
        System.out.println(start.getDayOfWeek());

        LocalDate end=LocalDate.of(2026,7,21);

        int workingdays=0;
        while (!start.isAfter(end)){
            DayOfWeek day=start.getDayOfWeek();
            if(day!=DayOfWeek.SATURDAY && day!=DayOfWeek.SUNDAY){
                workingdays++;
            }
            start=start.plusDays(1);
        }
        System.out.println("working days from is "+workingdays);
    }
}
