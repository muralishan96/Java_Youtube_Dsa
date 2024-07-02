package Java.Time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateTimeOperations {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();
        LocalDateTime current = LocalDateTime.now();

        LocalDateTime plus = current.plusDays(2).plusHours(3).plusMonths(2);
        System.out.println(plus);

        boolean ifBefore = plus.isBefore(current);
        boolean ifAfter = plus.isAfter(current);

        System.out.println(ifBefore +" "+ ifAfter);
    }
}
