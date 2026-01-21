import java.util.*;

public class CalenderClass {
    public static void main(String[] args) {
        
        GregorianCalendar gc = new GregorianCalendar();
        System.out.println(gc.get(Calendar.DAY_OF_MONTH));
        System.out.println(gc.get(Calendar.MONTH)); // January is 0
        System.out.println(gc.get(Calendar.YEAR));
        TimeZone tz = gc.getTimeZone();
        System.out.println(tz);
        System.out.println(tz.getID());
    }
}
