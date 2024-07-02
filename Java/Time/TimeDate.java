package Java.Time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;


public class TimeDate {
    public static void main(String[] args) {
        LocalDate day = LocalDate.now();
        System.out.println("Date :"+day);

        LocalTime time = LocalTime.now();
        System.out.println("Time "+time);

        LocalDateTime currentTime = LocalDateTime.now();
        System.out.println("Current date time : "+currentTime);


        LocalDate d = LocalDate.of(1996,11,04);
        System.out.println("DOB :"+d);


        LocalTime t = LocalTime.of(11,11);
        System.out.println("time : "+t);
    }
}
