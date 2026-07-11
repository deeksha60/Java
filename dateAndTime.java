import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class dateAndTime {
    public static void main(String[] args) {
        LocalDate date=LocalDate.now();
        LocalTime time=LocalTime.now();
        LocalDateTime dateTime=LocalDateTime.now();
        DateTimeFormatter f=DateTimeFormatter.ofPattern("dd/MMM/yyyy HH:mm:ss a");

        System.out.println("Date:"+date);
        System.out.println("Time:"+time);
        System.out.println("localdatetime:"+dateTime);
        System.out.println("formatted date:"+ dateTime.format(f));
        System.out.println();

//        custom date and time
        System.out.println("custom date and time");
        LocalDate customdate=LocalDate.of(2026,7,4);
        LocalTime customtime=LocalTime.of(9,44,36);
        LocalDateTime customdateTime=LocalDateTime.of(2026,7,9,9,44,56);

        System.out.println("Date:"+customdate);
        System.out.println("Time:"+customtime);
        System.out.println("localdatetime:"+customdateTime);
        System.out.println();

//        adding and subtracting the date
        LocalDate today=LocalDate.now();
        LocalDate nextweek=today.plusWeeks(1);
        LocalDate lastweek=today.minusWeeks(1);
        LocalDate tomorrow=today.plusDays(1);
        LocalDate yesterday =today.minusDays(1);
        LocalDate nextmonth=today.plusMonths(1);
        LocalDate lastmonth = today.minusMonths(1);
        LocalDate nextyear=today.plusYears(1);
        LocalDate lastyear=today.minusYears(1);

        System.out.println("add:"+nextweek);
        System.out.println("sub:"+lastweek);
        System.out.println("tomorrow:"+tomorrow);
        System.out.println("yesterday:"+yesterday);
        System.out.println("Next month:"+nextmonth);
        System.out.println("last month:"+lastmonth);
        System.out.println("next year:"+nextyear);
        System.out.println("last years:"+lastyear);
        System.out.println();
//        difference b/w the date
        LocalDate start=LocalDate.of(2026,6,26);
        LocalDate end=LocalDate.now();

        long daysbetween =ChronoUnit.DAYS.between(start,end);
        long yearsbetween =ChronoUnit.YEARS.between(start,end);
        System.out.println(daysbetween);
        System.out.println(yearsbetween);
    }
}
