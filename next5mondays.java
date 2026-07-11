import java.time.DayOfWeek;
import java.time.LocalDate;

public class next5mondays {
    public static void main(String[] args) {
        LocalDate date=LocalDate.now();
        int count=0;
        while(count<5){
            date=date.plusDays(1);
            if(date.getDayOfWeek()== DayOfWeek.MONDAY){
                System.out.println(date);
                count++;
            }
        }
    }
}
