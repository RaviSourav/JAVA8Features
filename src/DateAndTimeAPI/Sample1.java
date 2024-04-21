package DateAndTimeAPI;

import java.time.*;

public class Sample1 {
    public static void main(String[] args) {
        //oracle people introduced Joda-Time API.
        //This API developed by joda.org and available in Java in the form of Java.time package.
        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(date+" "+time+" "+dateTime);

        //get specific day, month and year
        System.out.println(date.getDayOfMonth());
        System.out.println(date.getDayOfWeek());
        System.out.println(date.getDayOfYear());
        System.out.println(date.getMonth());
        System.out.println(date.getMonthValue());
        System.out.println(date.getYear());

        //get specific time with minute, hour and second
        System.out.println(time.getHour());
        System.out.println(time.getMinute());
        System.out.println(time.getSecond());
        System.out.println(time.getNano());

        //all the above operations can be done from dateTime variable
        LocalDateTime dateTime1 = LocalDateTime.of(1998, Month.MAY, 24,12,45);
        LocalDateTime dateTime2 = LocalDateTime.of(1998, 05, 24,12,45);
        System.out.println(dateTime1+" "+ dateTime2);
        System.out.println("After six months: "+ dateTime1.plusMonths(6));
        System.out.println("Before Six Months: "+dateTime1.minusMonths(6));
        System.out.println("Parents anniversary before 3 days: "+ dateTime1.minusDays(3));


        //ZoneId object can be used to represent Zone.
        ZoneId zoneId = ZoneId.systemDefault();
        System.out.println(zoneId);
        ZoneId zoneId1 = ZoneId.of("America/Los_Angeles");
        System.out.println(zoneId1);

        //Period object can be used to represent quantity of time
        //used to calculate age of a person
        LocalDate date1 = LocalDate.now();
        LocalDate birthdDay = LocalDate.of(1998,05,24);
        System.out.println(Period.between(date1,birthdDay));

        if (birthdDay.isLeapYear())
            System.out.println("Its a leap year");
        else
            System.out.println("Its not a leap year");
    }
}
