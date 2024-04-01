package W3School;
import java.time.*;

public class DateTime {
    public static void main(String[] args) {
        LocalDate myObj = LocalDate.now();
        System.out.println(myObj);

        LocalTime a = LocalTime.now();
        System.out.println(a);

        LocalDateTime w = LocalDateTime.now();
        System.out.println(w);
    }
}
