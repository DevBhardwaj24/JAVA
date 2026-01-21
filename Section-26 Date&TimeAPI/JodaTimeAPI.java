
import java.time.*;


public class JodaTimeAPI {
    public static void main(String[] args) {
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime);

        LocalDate date = LocalDate.of(2023, Month.DECEMBER, 25);
        System.out.println(date);

        LocalTime time = LocalTime.now(Clock.systemDefaultZone());
        System.out.println(time);
    }
}
